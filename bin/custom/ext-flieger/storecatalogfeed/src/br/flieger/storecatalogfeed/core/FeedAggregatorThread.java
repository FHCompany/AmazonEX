/**
 * 
 */
package br.flieger.storecatalogfeed.core;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import br.flieger.storecatalogfeed.utils.XMLUtils;

/**
 * Gather all partial feed files to build the final feed
 * 
 * @author franthescollymaneira
 *
 */
public class FeedAggregatorThread extends AbstractFeedThread {

    @Override
    public void run() {
        try {
            super.run();
            // collecting all XML generated by threads.
            String[] generatedXMLs = getPartialFeedList();
            if (generatedXMLs.length == 0) {
                LOG.info("Could not find the partial feeds");
                return;
            }
            final Document fullFeed = aggregate(generatedXMLs);
            final XMLUtils xmlUtils = new XMLUtils();
            xmlUtils.clearDirectory(getExportFilePath());
            xmlUtils.writeXMLFile(fullFeed, getExportFileName());
        } catch (Exception e) {
            LOG.error("Error", e);
        }
    }


    /**
     * 
     * @param generatedXMLs
     * @return
     * @throws JDOMException
     * @throws IOException
     */
    private Document aggregate(String[] generatedXMLs) throws JDOMException, IOException {
        final XMLUtils xmlUtils = new XMLUtils();
        final SAXBuilder builder = new SAXBuilder();
        final String dir = getPathByStore() + getXmlTemplate() + "/";
        final Document fullFeed = createRootDocument();
        for (String xmlName : generatedXMLs) {
            Document originalDocument = builder.build(dir + xmlName);
            xmlUtils.copy(originalDocument, fullFeed, true);
        }
        return fullFeed;
    }


    private Document createRootDocument() {
        final XMLUtils xmlUtils = new XMLUtils();
        final Element root = new Element("products");
        root.addContent(xmlUtils.createElement("now", getFormattedDate(), true));
        root.addContent(xmlUtils.createElement("styleT", getXMLStyle(), true));
        return new Document(root);
    }


    /**
     * @return
     */
    private String[] getPartialFeedList() {
        final File catalogXMLDirectory = new File(getPathByStore() + getXmlTemplate());
        String[] generatedXMLs = catalogXMLDirectory.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("partial_feed_nr_") && name.endsWith(".xml");
            }
        });
        return generatedXMLs;
    }


    private String getExportFileName() {
        StringBuilder fileName = new StringBuilder().append(getExportFilePath())
                .append(getXmlTemplate()).append(".xml");
        return fileName.toString();
    }


    private String getFormattedDate() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
        StringBuilder formattedDate = new StringBuilder().append(dateFormat.format(now))
                .append("T").append(timeFormatter.format(now)).append("Z");
        return formattedDate.toString();
    }


    private String getXMLStyle() {
        StringBuilder style = new StringBuilder()
                .append("<?xml-stylesheet ")
                .append("type=\"text/xsl\" ")
                .append("href=\"http://www.fliegersoftware.de/JUST_A_SAMPLE_YOU_MUST_CHANGE_IT/sitemap.xsl\" ")
                .append("?>");
        return style.toString();
    }
}
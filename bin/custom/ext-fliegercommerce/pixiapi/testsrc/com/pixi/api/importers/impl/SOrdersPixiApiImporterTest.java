package com.pixi.api.importers.impl;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pixi.api.core.PixiFunctionParameter;
import com.pixi.api.core.PixiParameterType;
import com.pixi.api.impl.DefaultPixiSoapApi;
import com.pixi.api.result.SOrderResult;

import de.hybris.bootstrap.annotations.UnitTest;

/**
 * @author jfelipe
 *
 */
@UnitTest
public class SOrdersPixiApiImporterTest {

    private SOrdersPixiApiImporter fixture;
    //
    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    /**
     * 
     * 
     *
     * @author jfelipe
     */
    @Before
    public void setUp() {
        fixture = new SOrdersPixiApiImporter();
        fixture.setPixiSoapApi(new DefaultPixiSoapApi());
    }


    /**
     * 
     * 
     *
     * @author jfelipe
     */
    @Test
    public void importDataTest() {
        try {
            List<SOrderResult> results = fixture.importData(null);
            Assert.assertTrue("result XML should not be null.", results != null);
            Assert.assertFalse("result XML should not be empty.", results.isEmpty());
        } catch (Exception e) {
            Assert.assertTrue("Should not have thrown an exception. Type: "
                    + e.getClass().getName() + ". Message: " + e.getMessage(), false);
        }
    }


    /**
     * 
     * 
     *
     * @author jfelipe
     */
    @Test
    public void importDataTest_WrongParameterList() {
        try {
            List<PixiFunctionParameter> parameters = new ArrayList<PixiFunctionParameter>();
            PixiFunctionParameter paramDate = new PixiFunctionParameter();
            paramDate.setType(PixiParameterType.BIN_NAME);
            paramDate.setValue("");
            parameters.add(paramDate);
            fixture.importData(parameters);
        } catch (InvalidParameterException actualException) {
            InvalidParameterException expectedException = new InvalidParameterException(
                    "The PixiAPI function parameter should not be null.");
            Assert.assertEquals(
                    "Should have thrown an exception of type InvalidParameterException",
                    expectedException.getClass(), actualException.getClass());
            Assert.assertEquals("Wrong exception message. ", "The given PixiFunctionParameter "
                    + "list has an invalid parameters: " + PixiParameterType.BIN_NAME.getValue(),
                    actualException.getMessage());
        } catch (Exception e) {
            Assert.assertTrue("Should not have thrown an exception. Type: "
                    + e.getClass().getName() + ". Message: " + e.getMessage(), false);
        }
    }
}

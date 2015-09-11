/**
 * PerformResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.flieger.exacttarget.wsdl.api;

public class PerformResult  extends br.flieger.exacttarget.wsdl.api.Result  implements java.io.Serializable {
    private br.flieger.exacttarget.wsdl.api.APIObject object;

    private br.flieger.exacttarget.wsdl.api.TaskResult task;

    public PerformResult() {
    }

    public PerformResult(
           java.lang.String statusCode,
           java.lang.String statusMessage,
           java.lang.Integer ordinalID,
           java.lang.Integer errorCode,
           java.lang.String requestID,
           java.lang.String conversationID,
           java.lang.String overallStatusCode,
           br.flieger.exacttarget.wsdl.api.RequestType requestType,
           java.lang.String resultType,
           java.lang.String resultDetailXML,
           br.flieger.exacttarget.wsdl.api.APIObject object,
           br.flieger.exacttarget.wsdl.api.TaskResult task) {
        super(
            statusCode,
            statusMessage,
            ordinalID,
            errorCode,
            requestID,
            conversationID,
            overallStatusCode,
            requestType,
            resultType,
            resultDetailXML);
        this.object = object;
        this.task = task;
    }


    /**
     * Gets the object value for this PerformResult.
     * 
     * @return object
     */
    public br.flieger.exacttarget.wsdl.api.APIObject getObject() {
        return object;
    }


    /**
     * Sets the object value for this PerformResult.
     * 
     * @param object
     */
    public void setObject(br.flieger.exacttarget.wsdl.api.APIObject object) {
        this.object = object;
    }


    /**
     * Gets the task value for this PerformResult.
     * 
     * @return task
     */
    public br.flieger.exacttarget.wsdl.api.TaskResult getTask() {
        return task;
    }


    /**
     * Sets the task value for this PerformResult.
     * 
     * @param task
     */
    public void setTask(br.flieger.exacttarget.wsdl.api.TaskResult task) {
        this.task = task;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformResult)) return false;
        PerformResult other = (PerformResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.task==null && other.getTask()==null) || 
             (this.task!=null &&
              this.task.equals(other.getTask())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        if (getTask() != null) {
            _hashCode += getTask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PerformResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "APIObject"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Task"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TaskResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

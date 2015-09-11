/**
 * ImportDefinitionAutoGenerateDestination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.exacttarget.wsdl.partnerAPI;

public class ImportDefinitionAutoGenerateDestination  implements java.io.Serializable {
    private com.exacttarget.wsdl.partnerAPI.DataExtension dataExtensionTarget;

    private java.lang.Boolean errorIfExists;

    public ImportDefinitionAutoGenerateDestination() {
    }

    public ImportDefinitionAutoGenerateDestination(
           com.exacttarget.wsdl.partnerAPI.DataExtension dataExtensionTarget,
           java.lang.Boolean errorIfExists) {
           this.dataExtensionTarget = dataExtensionTarget;
           this.errorIfExists = errorIfExists;
    }


    /**
     * Gets the dataExtensionTarget value for this ImportDefinitionAutoGenerateDestination.
     * 
     * @return dataExtensionTarget
     */
    public com.exacttarget.wsdl.partnerAPI.DataExtension getDataExtensionTarget() {
        return dataExtensionTarget;
    }


    /**
     * Sets the dataExtensionTarget value for this ImportDefinitionAutoGenerateDestination.
     * 
     * @param dataExtensionTarget
     */
    public void setDataExtensionTarget(com.exacttarget.wsdl.partnerAPI.DataExtension dataExtensionTarget) {
        this.dataExtensionTarget = dataExtensionTarget;
    }


    /**
     * Gets the errorIfExists value for this ImportDefinitionAutoGenerateDestination.
     * 
     * @return errorIfExists
     */
    public java.lang.Boolean getErrorIfExists() {
        return errorIfExists;
    }


    /**
     * Sets the errorIfExists value for this ImportDefinitionAutoGenerateDestination.
     * 
     * @param errorIfExists
     */
    public void setErrorIfExists(java.lang.Boolean errorIfExists) {
        this.errorIfExists = errorIfExists;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportDefinitionAutoGenerateDestination)) return false;
        ImportDefinitionAutoGenerateDestination other = (ImportDefinitionAutoGenerateDestination) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataExtensionTarget==null && other.getDataExtensionTarget()==null) || 
             (this.dataExtensionTarget!=null &&
              this.dataExtensionTarget.equals(other.getDataExtensionTarget()))) &&
            ((this.errorIfExists==null && other.getErrorIfExists()==null) || 
             (this.errorIfExists!=null &&
              this.errorIfExists.equals(other.getErrorIfExists())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDataExtensionTarget() != null) {
            _hashCode += getDataExtensionTarget().hashCode();
        }
        if (getErrorIfExists() != null) {
            _hashCode += getErrorIfExists().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportDefinitionAutoGenerateDestination.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ImportDefinitionAutoGenerateDestination"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExtensionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataExtensionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataExtension"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorIfExists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorIfExists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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

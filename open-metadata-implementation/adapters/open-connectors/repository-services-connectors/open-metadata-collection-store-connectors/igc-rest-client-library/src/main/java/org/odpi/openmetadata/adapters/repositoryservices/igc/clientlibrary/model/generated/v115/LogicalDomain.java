/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v115;

import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'logical_domain' asset type in IGC, displayed as 'Logical Domain' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class LogicalDomain extends MainObject {

    public static final String IGC_TYPE_ID = "logical_domain";

    /**
     * The 'logical_data_model' property, displayed as 'Logical Data Model' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link LogicalDataModel} object.
     */
    protected Reference logical_data_model;

    /**
     * The 'entity_attributes' property, displayed as 'Entity Attributes' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link EntityAttribute} objects.
     */
    protected ReferenceList entity_attributes;

    /**
     * The 'parent_domain' property, displayed as 'Parent Domain' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link LogicalDomain} object.
     */
    protected Reference parent_domain;

    /**
     * The 'child_domains' property, displayed as 'Child Domains' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link LogicalDomain} objects.
     */
    protected ReferenceList child_domains;

    /**
     * The 'data_type' property, displayed as 'Data Type' in the IGC UI.
     */
    protected String data_type;

    /**
     * The 'native_type' property, displayed as 'Native Type' in the IGC UI.
     */
    protected String native_type;

    /**
     * The 'default_value' property, displayed as 'Default Value' in the IGC UI.
     */
    protected String default_value;

    /**
     * The 'null_value' property, displayed as 'Null Value' in the IGC UI.
     */
    protected String null_value;

    /**
     * The 'length' property, displayed as 'Length' in the IGC UI.
     */
    protected Number length;

    /**
     * The 'scale' property, displayed as 'Scale' in the IGC UI.
     */
    protected Number scale;


    /** @see #logical_data_model */ @JsonProperty("logical_data_model")  public Reference getLogicalDataModel() { return this.logical_data_model; }
    /** @see #logical_data_model */ @JsonProperty("logical_data_model")  public void setLogicalDataModel(Reference logical_data_model) { this.logical_data_model = logical_data_model; }

    /** @see #entity_attributes */ @JsonProperty("entity_attributes")  public ReferenceList getEntityAttributes() { return this.entity_attributes; }
    /** @see #entity_attributes */ @JsonProperty("entity_attributes")  public void setEntityAttributes(ReferenceList entity_attributes) { this.entity_attributes = entity_attributes; }

    /** @see #parent_domain */ @JsonProperty("parent_domain")  public Reference getParentDomain() { return this.parent_domain; }
    /** @see #parent_domain */ @JsonProperty("parent_domain")  public void setParentDomain(Reference parent_domain) { this.parent_domain = parent_domain; }

    /** @see #child_domains */ @JsonProperty("child_domains")  public ReferenceList getChildDomains() { return this.child_domains; }
    /** @see #child_domains */ @JsonProperty("child_domains")  public void setChildDomains(ReferenceList child_domains) { this.child_domains = child_domains; }

    /** @see #data_type */ @JsonProperty("data_type")  public String getDataType() { return this.data_type; }
    /** @see #data_type */ @JsonProperty("data_type")  public void setDataType(String data_type) { this.data_type = data_type; }

    /** @see #native_type */ @JsonProperty("native_type")  public String getNativeType() { return this.native_type; }
    /** @see #native_type */ @JsonProperty("native_type")  public void setNativeType(String native_type) { this.native_type = native_type; }

    /** @see #default_value */ @JsonProperty("default_value")  public String getDefaultValue() { return this.default_value; }
    /** @see #default_value */ @JsonProperty("default_value")  public void setDefaultValue(String default_value) { this.default_value = default_value; }

    /** @see #null_value */ @JsonProperty("null_value")  public String getNullValue() { return this.null_value; }
    /** @see #null_value */ @JsonProperty("null_value")  public void setNullValue(String null_value) { this.null_value = null_value; }

    /** @see #length */ @JsonProperty("length")  public Number getLength() { return this.length; }
    /** @see #length */ @JsonProperty("length")  public void setLength(Number length) { this.length = length; }

    /** @see #scale */ @JsonProperty("scale")  public Number getScale() { return this.scale; }
    /** @see #scale */ @JsonProperty("scale")  public void setScale(Number scale) { this.scale = scale; }


    public static final Boolean isLogicalDomain(Object obj) { return (obj.getClass() == LogicalDomain.class); }

}

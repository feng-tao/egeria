/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v117;

import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'providerpropertyinfo' asset type in IGC, displayed as 'ProviderPropertyInfo' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Providerpropertyinfo extends MainObject {

    public static final String IGC_TYPE_ID = "providerpropertyinfo";

    /**
     * The 'property_data_type' property, displayed as 'Property Data Type' in the IGC UI.
     */
    protected String property_data_type;

    /**
     * The 'has_provider_property_info_extended' property, displayed as 'Has Provider Property Info Extended' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Providerpropertyinfoextended} objects.
     */
    protected ReferenceList has_provider_property_info_extended;

    /**
     * The 'is_searchable' property, displayed as 'Is Searchable' in the IGC UI.
     */
    protected Boolean is_searchable;

    /**
     * The 'complex_attribute_source' property, displayed as 'Complex Attribute Source' in the IGC UI.
     */
    protected Boolean complex_attribute_source;

    /**
     * The 'description' property, displayed as 'Description' in the IGC UI.
     */
    protected String description;

    /**
     * The 'is_complex_attribute' property, displayed as 'Is Complex Attribute' in the IGC UI.
     */
    protected Boolean is_complex_attribute;

    /**
     * The 'is_required' property, displayed as 'Is Required' in the IGC UI.
     */
    protected Boolean is_required;

    /**
     * The 'display_name' property, displayed as 'Display Name' in the IGC UI.
     */
    protected String display_name;

    /**
     * The 'has_directory_provider_property' property, displayed as 'Has Directory Provider Property' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Directoryproviderproperty} objects.
     */
    protected ReferenceList has_directory_provider_property;

    /**
     * The 'is_editable' property, displayed as 'Is Editable' in the IGC UI.
     */
    protected Boolean is_editable;

    /**
     * The 'default_value' property, displayed as 'Default Value' in the IGC UI.
     */
    protected String default_value;


    /** @see #property_data_type */ @JsonProperty("property_data_type")  public String getPropertyDataType() { return this.property_data_type; }
    /** @see #property_data_type */ @JsonProperty("property_data_type")  public void setPropertyDataType(String property_data_type) { this.property_data_type = property_data_type; }

    /** @see #has_provider_property_info_extended */ @JsonProperty("has_provider_property_info_extended")  public ReferenceList getHasProviderPropertyInfoExtended() { return this.has_provider_property_info_extended; }
    /** @see #has_provider_property_info_extended */ @JsonProperty("has_provider_property_info_extended")  public void setHasProviderPropertyInfoExtended(ReferenceList has_provider_property_info_extended) { this.has_provider_property_info_extended = has_provider_property_info_extended; }

    /** @see #is_searchable */ @JsonProperty("is_searchable")  public Boolean getIsSearchable() { return this.is_searchable; }
    /** @see #is_searchable */ @JsonProperty("is_searchable")  public void setIsSearchable(Boolean is_searchable) { this.is_searchable = is_searchable; }

    /** @see #complex_attribute_source */ @JsonProperty("complex_attribute_source")  public Boolean getComplexAttributeSource() { return this.complex_attribute_source; }
    /** @see #complex_attribute_source */ @JsonProperty("complex_attribute_source")  public void setComplexAttributeSource(Boolean complex_attribute_source) { this.complex_attribute_source = complex_attribute_source; }

    /** @see #description */ @JsonProperty("description")  public String getDescription() { return this.description; }
    /** @see #description */ @JsonProperty("description")  public void setDescription(String description) { this.description = description; }

    /** @see #is_complex_attribute */ @JsonProperty("is_complex_attribute")  public Boolean getIsComplexAttribute() { return this.is_complex_attribute; }
    /** @see #is_complex_attribute */ @JsonProperty("is_complex_attribute")  public void setIsComplexAttribute(Boolean is_complex_attribute) { this.is_complex_attribute = is_complex_attribute; }

    /** @see #is_required */ @JsonProperty("is_required")  public Boolean getIsRequired() { return this.is_required; }
    /** @see #is_required */ @JsonProperty("is_required")  public void setIsRequired(Boolean is_required) { this.is_required = is_required; }

    /** @see #display_name */ @JsonProperty("display_name")  public String getDisplayName() { return this.display_name; }
    /** @see #display_name */ @JsonProperty("display_name")  public void setDisplayName(String display_name) { this.display_name = display_name; }

    /** @see #has_directory_provider_property */ @JsonProperty("has_directory_provider_property")  public ReferenceList getHasDirectoryProviderProperty() { return this.has_directory_provider_property; }
    /** @see #has_directory_provider_property */ @JsonProperty("has_directory_provider_property")  public void setHasDirectoryProviderProperty(ReferenceList has_directory_provider_property) { this.has_directory_provider_property = has_directory_provider_property; }

    /** @see #is_editable */ @JsonProperty("is_editable")  public Boolean getIsEditable() { return this.is_editable; }
    /** @see #is_editable */ @JsonProperty("is_editable")  public void setIsEditable(Boolean is_editable) { this.is_editable = is_editable; }

    /** @see #default_value */ @JsonProperty("default_value")  public String getDefaultValue() { return this.default_value; }
    /** @see #default_value */ @JsonProperty("default_value")  public void setDefaultValue(String default_value) { this.default_value = default_value; }


    public static final Boolean isProviderpropertyinfo(Object obj) { return (obj.getClass() == Providerpropertyinfo.class); }

}

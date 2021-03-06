/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v117;

import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'inv_data_rule_definition' asset type in IGC, displayed as 'Data Rule Definition' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InvDataRuleDefinition extends MainObject {

    public static final String IGC_TYPE_ID = "inv_data_rule_definition";

    /**
     * The 'short_&amp;_long_description' property, displayed as 'Short &amp; Long Description' in the IGC UI.
     */
    @JsonProperty("short_&_long_description") protected String short___long_description;

    /**
     * The 'project' property, displayed as 'Project' in the IGC UI.
     */
    protected String project;

    /**
     * The 'status' property, displayed as 'Status' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>CANDIDATE (displayed in the UI as 'CANDIDATE')</li>
     *     <li>ACCEPTED (displayed in the UI as 'ACCEPTED')</li>
     *     <li>STANDARD (displayed in the UI as 'STANDARD')</li>
     *     <li>DEPRECATED (displayed in the UI as 'DEPRECATED')</li>
     *     <li>DRAFT (displayed in the UI as 'DRAFT')</li>
     *     <li>IN_PROCESS (displayed in the UI as 'IN_PROCESS')</li>
     *     <li>REJECTED (displayed in the UI as 'REJECTED')</li>
     *     <li>ERROR (displayed in the UI as 'ERROR')</li>
     * </ul>
     */
    protected String status;

    /**
     * The 'contact' property, displayed as 'Contact' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Associativeobject} objects.
     */
    protected ReferenceList contact;

    /**
     * The 'data_rule_set_defintions' property, displayed as 'Data Rule Set Defintions' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InvDataRuleSetDefinition} objects.
     */
    protected ReferenceList data_rule_set_defintions;

    /**
     * The 'data_rules' property, displayed as 'Data Rules' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList data_rules;

    /**
     * The 'published' property, displayed as 'Published' in the IGC UI.
     */
    protected Boolean published;

    /**
     * The 'expression' property, displayed as 'Expression' in the IGC UI.
     */
    protected ArrayList<String> expression;


    /** @see #short___long_description */ @JsonProperty("short_&_long_description")  public String getShortLongDescription() { return this.short___long_description; }
    /** @see #short___long_description */ @JsonProperty("short_&_long_description")  public void setShortLongDescription(String short___long_description) { this.short___long_description = short___long_description; }

    /** @see #project */ @JsonProperty("project")  public String getProject() { return this.project; }
    /** @see #project */ @JsonProperty("project")  public void setProject(String project) { this.project = project; }

    /** @see #status */ @JsonProperty("status")  public String getStatus() { return this.status; }
    /** @see #status */ @JsonProperty("status")  public void setStatus(String status) { this.status = status; }

    /** @see #contact */ @JsonProperty("contact")  public ReferenceList getContact() { return this.contact; }
    /** @see #contact */ @JsonProperty("contact")  public void setContact(ReferenceList contact) { this.contact = contact; }

    /** @see #data_rule_set_defintions */ @JsonProperty("data_rule_set_defintions")  public ReferenceList getDataRuleSetDefintions() { return this.data_rule_set_defintions; }
    /** @see #data_rule_set_defintions */ @JsonProperty("data_rule_set_defintions")  public void setDataRuleSetDefintions(ReferenceList data_rule_set_defintions) { this.data_rule_set_defintions = data_rule_set_defintions; }

    /** @see #data_rules */ @JsonProperty("data_rules")  public ReferenceList getDataRules() { return this.data_rules; }
    /** @see #data_rules */ @JsonProperty("data_rules")  public void setDataRules(ReferenceList data_rules) { this.data_rules = data_rules; }

    /** @see #published */ @JsonProperty("published")  public Boolean getPublished() { return this.published; }
    /** @see #published */ @JsonProperty("published")  public void setPublished(Boolean published) { this.published = published; }

    /** @see #expression */ @JsonProperty("expression")  public ArrayList<String> getExpression() { return this.expression; }
    /** @see #expression */ @JsonProperty("expression")  public void setExpression(ArrayList<String> expression) { this.expression = expression; }


    public static final Boolean isInvDataRuleDefinition(Object obj) { return (obj.getClass() == InvDataRuleDefinition.class); }

}

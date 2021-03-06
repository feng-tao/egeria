/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v115;

import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'dsexternaldependency' asset type in IGC, displayed as 'DSExternalDependency' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Dsexternaldependency extends MainObject {

    public static final String IGC_TYPE_ID = "dsexternaldependency";

    /**
     * The 'of_ds_job_def' property, displayed as 'Of DS Job Def' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Dsjob} object.
     */
    protected Reference of_ds_job_def;

    /**
     * The 'of_ds_routine' property, displayed as 'Of DS Routine' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Routine} object.
     */
    protected Reference of_ds_routine;

    /**
     * The 'a_xmeta_locking_root' property, displayed as 'A XMeta Locking Root' in the IGC UI.
     */
    protected String a_xmeta_locking_root;

    /**
     * The 'calls_ds_routine' property, displayed as 'Calls DS Routine' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Routine} object.
     */
    protected Reference calls_ds_routine;

    /**
     * The 'type' property, displayed as 'Type' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>JOB (displayed in the UI as 'JOB')</li>
     *     <li>ROUTINE (displayed in the UI as 'ROUTINE')</li>
     *     <li>UVROUTINE (displayed in the UI as 'UVROUTINE')</li>
     *     <li>FILE (displayed in the UI as 'FILE')</li>
     *     <li>ACTIVEX (displayed in the UI as 'ACTIVEX')</li>
     *     <li>WEBSERVICE (displayed in the UI as 'WEBSERVICE')</li>
     *     <li>ROOTJOB (displayed in the UI as 'ROOTJOB')</li>
     * </ul>
     */
    protected String type;

    /**
     * The 'location' property, displayed as 'Location' in the IGC UI.
     */
    protected String location;

    /**
     * The 'runs_ds_job' property, displayed as 'Runs DS Job' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Dsjob} object.
     */
    protected Reference runs_ds_job;


    /** @see #of_ds_job_def */ @JsonProperty("of_ds_job_def")  public Reference getOfDsJobDef() { return this.of_ds_job_def; }
    /** @see #of_ds_job_def */ @JsonProperty("of_ds_job_def")  public void setOfDsJobDef(Reference of_ds_job_def) { this.of_ds_job_def = of_ds_job_def; }

    /** @see #of_ds_routine */ @JsonProperty("of_ds_routine")  public Reference getOfDsRoutine() { return this.of_ds_routine; }
    /** @see #of_ds_routine */ @JsonProperty("of_ds_routine")  public void setOfDsRoutine(Reference of_ds_routine) { this.of_ds_routine = of_ds_routine; }

    /** @see #a_xmeta_locking_root */ @JsonProperty("a_xmeta_locking_root")  public String getAXmetaLockingRoot() { return this.a_xmeta_locking_root; }
    /** @see #a_xmeta_locking_root */ @JsonProperty("a_xmeta_locking_root")  public void setAXmetaLockingRoot(String a_xmeta_locking_root) { this.a_xmeta_locking_root = a_xmeta_locking_root; }

    /** @see #calls_ds_routine */ @JsonProperty("calls_ds_routine")  public Reference getCallsDsRoutine() { return this.calls_ds_routine; }
    /** @see #calls_ds_routine */ @JsonProperty("calls_ds_routine")  public void setCallsDsRoutine(Reference calls_ds_routine) { this.calls_ds_routine = calls_ds_routine; }

    /** @see #type */ @JsonProperty("type")  public String getTheType() { return this.type; }
    /** @see #type */ @JsonProperty("type")  public void setTheType(String type) { this.type = type; }

    /** @see #location */ @JsonProperty("location")  public String getLocation() { return this.location; }
    /** @see #location */ @JsonProperty("location")  public void setLocation(String location) { this.location = location; }

    /** @see #runs_ds_job */ @JsonProperty("runs_ds_job")  public Reference getRunsDsJob() { return this.runs_ds_job; }
    /** @see #runs_ds_job */ @JsonProperty("runs_ds_job")  public void setRunsDsJob(Reference runs_ds_job) { this.runs_ds_job = runs_ds_job; }


    public static final Boolean isDsexternaldependency(Object obj) { return (obj.getClass() == Dsexternaldependency.class); }

}

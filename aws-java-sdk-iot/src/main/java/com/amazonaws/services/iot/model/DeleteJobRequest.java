/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is not
     * recommended, and you must ensure that your devices are not using the jobId to refer to the deleted job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is
     * in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job
     * information or update the job execution status. Use caution and ensure that each device executing a job which is
     * deleted is able to recover to a valid state.
     * </p>
     * </note>
     */
    private Boolean force;
    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain
     * the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     */
    private String namespaceId;

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is not
     * recommended, and you must ensure that your devices are not using the jobId to refer to the deleted job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job to be deleted.</p>
     *        <p>
     *        After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is
     *        not recommended, and you must ensure that your devices are not using the jobId to refer to the deleted
     *        job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is not
     * recommended, and you must ensure that your devices are not using the jobId to refer to the deleted job.
     * </p>
     * 
     * @return The ID of the job to be deleted.</p>
     *         <p>
     *         After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is
     *         not recommended, and you must ensure that your devices are not using the jobId to refer to the deleted
     *         job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is not
     * recommended, and you must ensure that your devices are not using the jobId to refer to the deleted job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job to be deleted.</p>
     *        <p>
     *        After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is
     *        not recommended, and you must ensure that your devices are not using the jobId to refer to the deleted
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is
     * in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job
     * information or update the job execution status. Use caution and ensure that each device executing a job which is
     * deleted is able to recover to a valid state.
     * </p>
     * </note>
     * 
     * @param force
     *        (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job
     *        which is in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     *        false.</p> <note>
     *        <p>
     *        Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *        access job information or update the job execution status. Use caution and ensure that each device
     *        executing a job which is deleted is able to recover to a valid state.
     *        </p>
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is
     * in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job
     * information or update the job execution status. Use caution and ensure that each device executing a job which is
     * deleted is able to recover to a valid state.
     * </p>
     * </note>
     * 
     * @return (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job
     *         which is in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     *         false.</p> <note>
     *         <p>
     *         Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *         access job information or update the job execution status. Use caution and ensure that each device
     *         executing a job which is deleted is able to recover to a valid state.
     *         </p>
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is
     * in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job
     * information or update the job execution status. Use caution and ensure that each device executing a job which is
     * deleted is able to recover to a valid state.
     * </p>
     * </note>
     * 
     * @param force
     *        (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job
     *        which is in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     *        false.</p> <note>
     *        <p>
     *        Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *        access job information or update the job execution status. Use caution and ensure that each device
     *        executing a job which is deleted is able to recover to a valid state.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteJobRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is
     * in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job
     * information or update the job execution status. Use caution and ensure that each device executing a job which is
     * deleted is able to recover to a valid state.
     * </p>
     * </note>
     * 
     * @return (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job
     *         which is in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     *         false.</p> <note>
     *         <p>
     *         Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *         access job information or update the job execution status. Use caution and ensure that each device
     *         executing a job which is deleted is able to recover to a valid state.
     *         </p>
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain
     * the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * 
     * @param namespaceId
     *        The namespace used to indicate that a job is a customer-managed job.</p>
     *        <p>
     *        When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that
     *        contain the value in the following format.
     *        </p>
     *        <p>
     *        <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *        </p>
     *        <note>
     *        <p>
     *        The <code>namespaceId</code> feature is in public preview.
     *        </p>
     */

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain
     * the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * 
     * @return The namespace used to indicate that a job is a customer-managed job.</p>
     *         <p>
     *         When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that
     *         contain the value in the following format.
     *         </p>
     *         <p>
     *         <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *         </p>
     *         <note>
     *         <p>
     *         The <code>namespaceId</code> feature is in public preview.
     *         </p>
     */

    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The namespace used to indicate that a job is a customer-managed job.
     * </p>
     * <p>
     * When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that contain
     * the value in the following format.
     * </p>
     * <p>
     * <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     * </p>
     * <note>
     * <p>
     * The <code>namespaceId</code> feature is in public preview.
     * </p>
     * </note>
     * 
     * @param namespaceId
     *        The namespace used to indicate that a job is a customer-managed job.</p>
     *        <p>
     *        When you specify a value for this parameter, AWS IoT Core sends jobs notifications to MQTT topics that
     *        contain the value in the following format.
     *        </p>
     *        <p>
     *        <code>$aws/things/<i>THING_NAME</i>/jobs/<i>JOB_ID</i>/notify-namespace-<i>NAMESPACE_ID</i>/</code>
     *        </p>
     *        <note>
     *        <p>
     *        The <code>namespaceId</code> feature is in public preview.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteJobRequest withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
        if (getNamespaceId() != null)
            sb.append("NamespaceId: ").append(getNamespaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJobRequest == false)
            return false;
        DeleteJobRequest other = (DeleteJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null && other.getNamespaceId().equals(this.getNamespaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteJobRequest clone() {
        return (DeleteJobRequest) super.clone();
    }

}

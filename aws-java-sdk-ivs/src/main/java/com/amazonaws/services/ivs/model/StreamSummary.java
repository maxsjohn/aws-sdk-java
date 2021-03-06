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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StreamSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The stream’s state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The stream’s health.
     * </p>
     */
    private String health;
    /**
     * <p>
     * Number of current viewers of the stream.
     * </p>
     */
    private Long viewerCount;
    /**
     * <p>
     * ISO-8601 formatted timestamp of the stream’s start.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     * 
     * @param channelArn
     *        Channel ARN for the stream.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     * 
     * @return Channel ARN for the stream.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     * 
     * @param channelArn
     *        Channel ARN for the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The stream’s state.
     * </p>
     * 
     * @param state
     *        The stream’s state.
     * @see StreamState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The stream’s state.
     * </p>
     * 
     * @return The stream’s state.
     * @see StreamState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The stream’s state.
     * </p>
     * 
     * @param state
     *        The stream’s state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamState
     */

    public StreamSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The stream’s state.
     * </p>
     * 
     * @param state
     *        The stream’s state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamState
     */

    public StreamSummary withState(StreamState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @param health
     *        The stream’s health.
     * @see StreamHealth
     */

    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @return The stream’s health.
     * @see StreamHealth
     */

    public String getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @param health
     *        The stream’s health.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamHealth
     */

    public StreamSummary withHealth(String health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The stream’s health.
     * </p>
     * 
     * @param health
     *        The stream’s health.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamHealth
     */

    public StreamSummary withHealth(StreamHealth health) {
        this.health = health.toString();
        return this;
    }

    /**
     * <p>
     * Number of current viewers of the stream.
     * </p>
     * 
     * @param viewerCount
     *        Number of current viewers of the stream.
     */

    public void setViewerCount(Long viewerCount) {
        this.viewerCount = viewerCount;
    }

    /**
     * <p>
     * Number of current viewers of the stream.
     * </p>
     * 
     * @return Number of current viewers of the stream.
     */

    public Long getViewerCount() {
        return this.viewerCount;
    }

    /**
     * <p>
     * Number of current viewers of the stream.
     * </p>
     * 
     * @param viewerCount
     *        Number of current viewers of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withViewerCount(Long viewerCount) {
        setViewerCount(viewerCount);
        return this;
    }

    /**
     * <p>
     * ISO-8601 formatted timestamp of the stream’s start.
     * </p>
     * 
     * @param startTime
     *        ISO-8601 formatted timestamp of the stream’s start.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * ISO-8601 formatted timestamp of the stream’s start.
     * </p>
     * 
     * @return ISO-8601 formatted timestamp of the stream’s start.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * ISO-8601 formatted timestamp of the stream’s start.
     * </p>
     * 
     * @param startTime
     *        ISO-8601 formatted timestamp of the stream’s start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth()).append(",");
        if (getViewerCount() != null)
            sb.append("ViewerCount: ").append(getViewerCount()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamSummary == false)
            return false;
        StreamSummary other = (StreamSummary) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        if (other.getViewerCount() == null ^ this.getViewerCount() == null)
            return false;
        if (other.getViewerCount() != null && other.getViewerCount().equals(this.getViewerCount()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        hashCode = prime * hashCode + ((getViewerCount() == null) ? 0 : getViewerCount().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public StreamSummary clone() {
        try {
            return (StreamSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.StreamSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

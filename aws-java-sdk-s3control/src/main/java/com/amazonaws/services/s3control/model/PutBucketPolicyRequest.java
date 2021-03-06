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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBucketPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ARN of the bucket.
     * </p>
     * <p>
     * For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in
     * the future.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private Boolean confirmRemoveSelfBucketAccess;
    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @return The AWS account ID of the Outposts bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Outposts bucket.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Outposts bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketPolicyRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ARN of the bucket.
     * </p>
     * <p>
     * For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     * 
     * @param bucket
     *        The ARN of the bucket.</p>
     *        <p>
     *        For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     *        <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     *        . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by
     *        account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     *        <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must
     *        be URL encoded.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The ARN of the bucket.
     * </p>
     * <p>
     * For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     * 
     * @return The ARN of the bucket.</p>
     *         <p>
     *         For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     *         <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     *         . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by
     *         account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     *         <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must
     *         be URL encoded.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The ARN of the bucket.
     * </p>
     * <p>
     * For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     * . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by account
     * <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must be URL
     * encoded.
     * </p>
     * 
     * @param bucket
     *        The ARN of the bucket.</p>
     *        <p>
     *        For Amazon S3 on Outposts specify the ARN of the bucket accessed in the format
     *        <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;</code>
     *        . For example, to access the bucket <code>reports</code> through outpost <code>my-outpost</code> owned by
     *        account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     *        <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports</code>. The value must
     *        be URL encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketPolicyRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in
     * the future.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param confirmRemoveSelfBucketAccess
     *        Set this parameter to true to confirm that you want to remove your permissions to change this bucket
     *        policy in the future.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setConfirmRemoveSelfBucketAccess(Boolean confirmRemoveSelfBucketAccess) {
        this.confirmRemoveSelfBucketAccess = confirmRemoveSelfBucketAccess;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in
     * the future.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Set this parameter to true to confirm that you want to remove your permissions to change this bucket
     *         policy in the future.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public Boolean getConfirmRemoveSelfBucketAccess() {
        return this.confirmRemoveSelfBucketAccess;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in
     * the future.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param confirmRemoveSelfBucketAccess
     *        Set this parameter to true to confirm that you want to remove your permissions to change this bucket
     *        policy in the future.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketPolicyRequest withConfirmRemoveSelfBucketAccess(Boolean confirmRemoveSelfBucketAccess) {
        setConfirmRemoveSelfBucketAccess(confirmRemoveSelfBucketAccess);
        return this;
    }

    /**
     * <p>
     * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in
     * the future.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Set this parameter to true to confirm that you want to remove your permissions to change this bucket
     *         policy in the future.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public Boolean isConfirmRemoveSelfBucketAccess() {
        return this.confirmRemoveSelfBucketAccess;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     * 
     * @param policy
     *        The bucket policy as a JSON document.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     * 
     * @return The bucket policy as a JSON document.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     * 
     * @param policy
     *        The bucket policy as a JSON document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBucketPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getConfirmRemoveSelfBucketAccess() != null)
            sb.append("ConfirmRemoveSelfBucketAccess: ").append(getConfirmRemoveSelfBucketAccess()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketPolicyRequest == false)
            return false;
        PutBucketPolicyRequest other = (PutBucketPolicyRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getConfirmRemoveSelfBucketAccess() == null ^ this.getConfirmRemoveSelfBucketAccess() == null)
            return false;
        if (other.getConfirmRemoveSelfBucketAccess() != null
                && other.getConfirmRemoveSelfBucketAccess().equals(this.getConfirmRemoveSelfBucketAccess()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getConfirmRemoveSelfBucketAccess() == null) ? 0 : getConfirmRemoveSelfBucketAccess().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutBucketPolicyRequest clone() {
        return (PutBucketPolicyRequest) super.clone();
    }

}

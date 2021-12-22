
package com.gamedoora.model.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "studio_id",
    "uid",
    "name",
    "content",
    "version",
    "asset_type",
    "parent_id",
    "user_id",
    "bucket_name",
    "is_published",
    "is_uploaded",
    "is_uploading",
    "is_deleted",
    "asset_file_size",
    "asset_file_content_type",
    "asset_file_name",
    "asset_file_url",
    "asset_file_updated_at",
    "script_locked_by",
    "script_locked_at",
    "created_at",
    "updated_at"
})
public class Asset {

    @JsonProperty("id")
    private String id;
    @JsonProperty("studio_id")
    private String studioId;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("content")
    private String content;
    @JsonProperty("version")
    private String version;
    @JsonProperty("asset_type")
    private String assetType;
    @JsonProperty("parent_id")
    private String parentId;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("bucket_name")
    private String bucketName;
    @JsonProperty("is_published")
    private String isPublished;
    @JsonProperty("is_uploaded")
    private String isUploaded;
    @JsonProperty("is_uploading")
    private String isUploading;
    @JsonProperty("is_deleted")
    private String isDeleted;
    @JsonProperty("asset_file_size")
    private String assetFileSize;
    @JsonProperty("asset_file_content_type")
    private String assetFileContentType;
    @JsonProperty("asset_file_name")
    private String assetFileName;
    @JsonProperty("asset_file_url")
    private String assetFileUrl;
    @JsonProperty("asset_file_updated_at")
    private String assetFileUpdatedAt;
    @JsonProperty("script_locked_by")
    private String scriptLockedBy;
    @JsonProperty("script_locked_at")
    private String scriptLockedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("studio_id")
    public String getStudioId() {
        return studioId;
    }

    @JsonProperty("studio_id")
    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("asset_type")
    public String getAssetType() {
        return assetType;
    }

    @JsonProperty("asset_type")
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("bucket_name")
    public String getBucketName() {
        return bucketName;
    }

    @JsonProperty("bucket_name")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @JsonProperty("is_published")
    public String getIsPublished() {
        return isPublished;
    }

    @JsonProperty("is_published")
    public void setIsPublished(String isPublished) {
        this.isPublished = isPublished;
    }

    @JsonProperty("is_uploaded")
    public String getIsUploaded() {
        return isUploaded;
    }

    @JsonProperty("is_uploaded")
    public void setIsUploaded(String isUploaded) {
        this.isUploaded = isUploaded;
    }

    @JsonProperty("is_uploading")
    public String getIsUploading() {
        return isUploading;
    }

    @JsonProperty("is_uploading")
    public void setIsUploading(String isUploading) {
        this.isUploading = isUploading;
    }

    @JsonProperty("is_deleted")
    public String getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("is_deleted")
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("asset_file_size")
    public String getAssetFileSize() {
        return assetFileSize;
    }

    @JsonProperty("asset_file_size")
    public void setAssetFileSize(String assetFileSize) {
        this.assetFileSize = assetFileSize;
    }

    @JsonProperty("asset_file_content_type")
    public String getAssetFileContentType() {
        return assetFileContentType;
    }

    @JsonProperty("asset_file_content_type")
    public void setAssetFileContentType(String assetFileContentType) {
        this.assetFileContentType = assetFileContentType;
    }

    @JsonProperty("asset_file_name")
    public String getAssetFileName() {
        return assetFileName;
    }

    @JsonProperty("asset_file_name")
    public void setAssetFileName(String assetFileName) {
        this.assetFileName = assetFileName;
    }

    @JsonProperty("asset_file_url")
    public String getAssetFileUrl() {
        return assetFileUrl;
    }

    @JsonProperty("asset_file_url")
    public void setAssetFileUrl(String assetFileUrl) {
        this.assetFileUrl = assetFileUrl;
    }

    @JsonProperty("asset_file_updated_at")
    public String getAssetFileUpdatedAt() {
        return assetFileUpdatedAt;
    }

    @JsonProperty("asset_file_updated_at")
    public void setAssetFileUpdatedAt(String assetFileUpdatedAt) {
        this.assetFileUpdatedAt = assetFileUpdatedAt;
    }

    @JsonProperty("script_locked_by")
    public String getScriptLockedBy() {
        return scriptLockedBy;
    }

    @JsonProperty("script_locked_by")
    public void setScriptLockedBy(String scriptLockedBy) {
        this.scriptLockedBy = scriptLockedBy;
    }

    @JsonProperty("script_locked_at")
    public String getScriptLockedAt() {
        return scriptLockedAt;
    }

    @JsonProperty("script_locked_at")
    public void setScriptLockedAt(String scriptLockedAt) {
        this.scriptLockedAt = scriptLockedAt;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(studioId).append(uid).append(name).append(content).append(version).append(assetType).append(parentId).append(userId).append(bucketName).append(isPublished).append(isUploaded).append(isUploading).append(isDeleted).append(assetFileSize).append(assetFileContentType).append(assetFileName).append(assetFileUrl).append(assetFileUpdatedAt).append(scriptLockedBy).append(scriptLockedAt).append(createdAt).append(updatedAt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Asset) == false) {
            return false;
        }
        Asset rhs = ((Asset) other);
        return new EqualsBuilder().append(id, rhs.id).append(studioId, rhs.studioId).append(uid, rhs.uid).append(name, rhs.name).append(content, rhs.content).append(version, rhs.version).append(assetType, rhs.assetType).append(parentId, rhs.parentId).append(userId, rhs.userId).append(bucketName, rhs.bucketName).append(isPublished, rhs.isPublished).append(isUploaded, rhs.isUploaded).append(isUploading, rhs.isUploading).append(isDeleted, rhs.isDeleted).append(assetFileSize, rhs.assetFileSize).append(assetFileContentType, rhs.assetFileContentType).append(assetFileName, rhs.assetFileName).append(assetFileUrl, rhs.assetFileUrl).append(assetFileUpdatedAt, rhs.assetFileUpdatedAt).append(scriptLockedBy, rhs.scriptLockedBy).append(scriptLockedAt, rhs.scriptLockedAt).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

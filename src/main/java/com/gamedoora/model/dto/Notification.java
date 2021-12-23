
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
    "uid",
    "entity_type",
    "entity_id",
    "context",
    "action_url",
    "is_email",
    "is_notification",
    "created_at",
    "updated_at"
})
public class Notification {

    @JsonProperty("id")
    private String id;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("entity_type")
    private String entityType;
    @JsonProperty("entity_id")
    private String entityId;
    @JsonProperty("context")
    private String context;
    @JsonProperty("action_url")
    private String actionUrl;
    @JsonProperty("is_email")
    private String isEmail;
    @JsonProperty("is_notification")
    private String isNotification;
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

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("entity_type")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entity_type")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("entity_id")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entity_id")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("action_url")
    public String getActionUrl() {
        return actionUrl;
    }

    @JsonProperty("action_url")
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    @JsonProperty("is_email")
    public String getIsEmail() {
        return isEmail;
    }

    @JsonProperty("is_email")
    public void setIsEmail(String isEmail) {
        this.isEmail = isEmail;
    }

    @JsonProperty("is_notification")
    public String getIsNotification() {
        return isNotification;
    }

    @JsonProperty("is_notification")
    public void setIsNotification(String isNotification) {
        this.isNotification = isNotification;
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
        return new HashCodeBuilder().append(id).append(uid).append(entityType).append(entityId).append(context).append(actionUrl).append(isEmail).append(isNotification).append(createdAt).append(updatedAt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notification) == false) {
            return false;
        }
        Notification rhs = ((Notification) other);
        return new EqualsBuilder().append(id, rhs.id).append(uid, rhs.uid).append(entityType, rhs.entityType).append(entityId, rhs.entityId).append(context, rhs.context).append(actionUrl, rhs.actionUrl).append(isEmail, rhs.isEmail).append(isNotification, rhs.isNotification).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

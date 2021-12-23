
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
    "notification_id",
    "studio",
    "is_seen",
    "is_clicked",
    "created_at",
    "updated at"
})
public class Notification_ {

    @JsonProperty("notification_id")
    private String notificationId;
    @JsonProperty("studio")
    private String studio;
    @JsonProperty("is_seen")
    private String isSeen;
    @JsonProperty("is_clicked")
    private String isClicked;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("notification_id")
    public String getNotificationId() {
        return notificationId;
    }

    @JsonProperty("notification_id")
    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    @JsonProperty("studio")
    public String getStudio() {
        return studio;
    }

    @JsonProperty("studio")
    public void setStudio(String studio) {
        this.studio = studio;
    }

    @JsonProperty("is_seen")
    public String getIsSeen() {
        return isSeen;
    }

    @JsonProperty("is_seen")
    public void setIsSeen(String isSeen) {
        this.isSeen = isSeen;
    }

    @JsonProperty("is_clicked")
    public String getIsClicked() {
        return isClicked;
    }

    @JsonProperty("is_clicked")
    public void setIsClicked(String isClicked) {
        this.isClicked = isClicked;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated at")
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
        return new HashCodeBuilder().append(notificationId).append(studio).append(isSeen).append(isClicked).append(createdAt).append(updatedAt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notification_) == false) {
            return false;
        }
        Notification_ rhs = ((Notification_) other);
        return new EqualsBuilder().append(notificationId, rhs.notificationId).append(studio, rhs.studio).append(isSeen, rhs.isSeen).append(isClicked, rhs.isClicked).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

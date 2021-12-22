
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
    "studio_id",
    "name",
    "uid",
    "is_community",
    "created_at",
    "updated_at",
    "visibility",
    "registration",
    "description"
})
public class Studio {

    @JsonProperty("studio_id")
    private String studioId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("is_community")
    private String isCommunity;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("registration")
    private String registration;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("studio_id")
    public String getStudioId() {
        return studioId;
    }

    @JsonProperty("studio_id")
    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("is_community")
    public String getIsCommunity() {
        return isCommunity;
    }

    @JsonProperty("is_community")
    public void setIsCommunity(String isCommunity) {
        this.isCommunity = isCommunity;
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

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("registration")
    public String getRegistration() {
        return registration;
    }

    @JsonProperty("registration")
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
        return new HashCodeBuilder().append(studioId).append(name).append(uid).append(isCommunity).append(createdAt).append(updatedAt).append(visibility).append(registration).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Studio) == false) {
            return false;
        }
        Studio rhs = ((Studio) other);
        return new EqualsBuilder().append(studioId, rhs.studioId).append(name, rhs.name).append(uid, rhs.uid).append(isCommunity, rhs.isCommunity).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(visibility, rhs.visibility).append(registration, rhs.registration).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

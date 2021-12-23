
package com.gamedoora.model.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "identities"
})
public class StudioIdentities {

    @JsonProperty("studio_id")
    private String studioId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("identities")
    private List<Identity> identities = new ArrayList<Identity>();
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

    @JsonProperty("identities")
    public List<Identity> getIdentities() {
        return identities;
    }

    @JsonProperty("identities")
    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
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
        return new HashCodeBuilder().append(studioId).append(name).append(identities).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudioIdentities) == false) {
            return false;
        }
        StudioIdentities rhs = ((StudioIdentities) other);
        return new EqualsBuilder().append(studioId, rhs.studioId).append(name, rhs.name).append(identities, rhs.identities).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

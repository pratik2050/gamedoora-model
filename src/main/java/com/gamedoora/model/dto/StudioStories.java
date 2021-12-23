
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
    "stories",
    "assets"
})
public class StudioStories {

    @JsonProperty("studio_id")
    private String studioId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("stories")
    private List<Story> stories = new ArrayList<Story>();
    @JsonProperty("assets")
    private List<Asset_> assets = new ArrayList<Asset_>();
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

    @JsonProperty("stories")
    public List<Story> getStories() {
        return stories;
    }

    @JsonProperty("stories")
    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    @JsonProperty("assets")
    public List<Asset_> getAssets() {
        return assets;
    }

    @JsonProperty("assets")
    public void setAssets(List<Asset_> assets) {
        this.assets = assets;
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
        return new HashCodeBuilder().append(studioId).append(name).append(stories).append(assets).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudioStories) == false) {
            return false;
        }
        StudioStories rhs = ((StudioStories) other);
        return new EqualsBuilder().append(studioId, rhs.studioId).append(name, rhs.name).append(stories, rhs.stories).append(assets, rhs.assets).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

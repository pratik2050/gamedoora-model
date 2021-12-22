
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
    "project_name",
    "project_description",
    "worked_for"
})
public class Project {

    @JsonProperty("id")
    private String id;
    @JsonProperty("project_name")
    private String projectName;
    @JsonProperty("project_description")
    private String projectDescription;
    @JsonProperty("worked_for")
    private String workedFor;
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

    @JsonProperty("project_name")
    public String getProjectName() {
        return projectName;
    }

    @JsonProperty("project_name")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @JsonProperty("project_description")
    public String getProjectDescription() {
        return projectDescription;
    }

    @JsonProperty("project_description")
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @JsonProperty("worked_for")
    public String getWorkedFor() {
        return workedFor;
    }

    @JsonProperty("worked_for")
    public void setWorkedFor(String workedFor) {
        this.workedFor = workedFor;
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
        return new HashCodeBuilder().append(id).append(projectName).append(projectDescription).append(workedFor).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Project) == false) {
            return false;
        }
        Project rhs = ((Project) other);
        return new EqualsBuilder().append(id, rhs.id).append(projectName, rhs.projectName).append(projectDescription, rhs.projectDescription).append(workedFor, rhs.workedFor).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

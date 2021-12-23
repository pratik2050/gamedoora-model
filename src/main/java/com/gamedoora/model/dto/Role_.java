
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
    "role_id",
    "studio",
    "studio_id",
    "role_name",
    "role_description"
})
public class Role_ {

    @JsonProperty("role_id")
    private String roleId;
    @JsonProperty("studio")
    private String studio;
    @JsonProperty("studio_id")
    private String studioId;
    @JsonProperty("role_name")
    private String roleName;
    @JsonProperty("role_description")
    private String roleDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("role_id")
    public String getRoleId() {
        return roleId;
    }

    @JsonProperty("role_id")
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @JsonProperty("studio")
    public String getStudio() {
        return studio;
    }

    @JsonProperty("studio")
    public void setStudio(String studio) {
        this.studio = studio;
    }

    @JsonProperty("studio_id")
    public String getStudioId() {
        return studioId;
    }

    @JsonProperty("studio_id")
    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    @JsonProperty("role_name")
    public String getRoleName() {
        return roleName;
    }

    @JsonProperty("role_name")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @JsonProperty("role_description")
    public String getRoleDescription() {
        return roleDescription;
    }

    @JsonProperty("role_description")
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
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
        return new HashCodeBuilder().append(roleId).append(studio).append(studioId).append(roleName).append(roleDescription).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Role_) == false) {
            return false;
        }
        Role_ rhs = ((Role_) other);
        return new EqualsBuilder().append(roleId, rhs.roleId).append(studio, rhs.studio).append(studioId, rhs.studioId).append(roleName, rhs.roleName).append(roleDescription, rhs.roleDescription).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
    "id",
    "name",
    "new-notifictions",
    "notifications"
})
public class UserNotifications {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("new-notifictions")
    private String newNotifictions;
    @JsonProperty("notifications")
    private List<Notification_> notifications = new ArrayList<Notification_>();
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("new-notifictions")
    public String getNewNotifictions() {
        return newNotifictions;
    }

    @JsonProperty("new-notifictions")
    public void setNewNotifictions(String newNotifictions) {
        this.newNotifictions = newNotifictions;
    }

    @JsonProperty("notifications")
    public List<Notification_> getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(List<Notification_> notifications) {
        this.notifications = notifications;
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
        return new HashCodeBuilder().append(id).append(name).append(newNotifictions).append(notifications).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserNotifications) == false) {
            return false;
        }
        UserNotifications rhs = ((UserNotifications) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(newNotifictions, rhs.newNotifictions).append(notifications, rhs.notifications).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

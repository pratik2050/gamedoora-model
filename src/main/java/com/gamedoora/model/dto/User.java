
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
    "name",
    "email",
    "profile_picture",
    "encrypted_password",
    "reset_password_token",
    "reset_password_sent_at",
    "confirmation_token",
    "user_ceates_at",
    "profile_updated_at",
    "sign_in_count",
    "current_sign_in_at",
    "last_sign_in_at",
    "current_sign_in_ip",
    "last_sign_in_ip"
})
public class User {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("profile_picture")
    private String profilePicture;
    @JsonProperty("encrypted_password")
    private String encryptedPassword;
    @JsonProperty("reset_password_token")
    private String resetPasswordToken;
    @JsonProperty("reset_password_sent_at")
    private String resetPasswordSentAt;
    @JsonProperty("confirmation_token")
    private String confirmationToken;
    @JsonProperty("user_ceates_at")
    private String userCeatesAt;
    @JsonProperty("profile_updated_at")
    private String profileUpdatedAt;
    @JsonProperty("sign_in_count")
    private String signInCount;
    @JsonProperty("current_sign_in_at")
    private String currentSignInAt;
    @JsonProperty("last_sign_in_at")
    private String lastSignInAt;
    @JsonProperty("current_sign_in_ip")
    private String currentSignInIp;
    @JsonProperty("last_sign_in_ip")
    private String lastSignInIp;
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

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("profile_picture")
    public String getProfilePicture() {
        return profilePicture;
    }

    @JsonProperty("profile_picture")
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @JsonProperty("encrypted_password")
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    @JsonProperty("encrypted_password")
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    @JsonProperty("reset_password_token")
    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    @JsonProperty("reset_password_token")
    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    @JsonProperty("reset_password_sent_at")
    public String getResetPasswordSentAt() {
        return resetPasswordSentAt;
    }

    @JsonProperty("reset_password_sent_at")
    public void setResetPasswordSentAt(String resetPasswordSentAt) {
        this.resetPasswordSentAt = resetPasswordSentAt;
    }

    @JsonProperty("confirmation_token")
    public String getConfirmationToken() {
        return confirmationToken;
    }

    @JsonProperty("confirmation_token")
    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    @JsonProperty("user_ceates_at")
    public String getUserCeatesAt() {
        return userCeatesAt;
    }

    @JsonProperty("user_ceates_at")
    public void setUserCeatesAt(String userCeatesAt) {
        this.userCeatesAt = userCeatesAt;
    }

    @JsonProperty("profile_updated_at")
    public String getProfileUpdatedAt() {
        return profileUpdatedAt;
    }

    @JsonProperty("profile_updated_at")
    public void setProfileUpdatedAt(String profileUpdatedAt) {
        this.profileUpdatedAt = profileUpdatedAt;
    }

    @JsonProperty("sign_in_count")
    public String getSignInCount() {
        return signInCount;
    }

    @JsonProperty("sign_in_count")
    public void setSignInCount(String signInCount) {
        this.signInCount = signInCount;
    }

    @JsonProperty("current_sign_in_at")
    public String getCurrentSignInAt() {
        return currentSignInAt;
    }

    @JsonProperty("current_sign_in_at")
    public void setCurrentSignInAt(String currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
    }

    @JsonProperty("last_sign_in_at")
    public String getLastSignInAt() {
        return lastSignInAt;
    }

    @JsonProperty("last_sign_in_at")
    public void setLastSignInAt(String lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    @JsonProperty("current_sign_in_ip")
    public String getCurrentSignInIp() {
        return currentSignInIp;
    }

    @JsonProperty("current_sign_in_ip")
    public void setCurrentSignInIp(String currentSignInIp) {
        this.currentSignInIp = currentSignInIp;
    }

    @JsonProperty("last_sign_in_ip")
    public String getLastSignInIp() {
        return lastSignInIp;
    }

    @JsonProperty("last_sign_in_ip")
    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
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
        return new HashCodeBuilder().append(id).append(name).append(email).append(profilePicture).append(encryptedPassword).append(resetPasswordToken).append(resetPasswordSentAt).append(confirmationToken).append(userCeatesAt).append(profileUpdatedAt).append(signInCount).append(currentSignInAt).append(lastSignInAt).append(currentSignInIp).append(lastSignInIp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(email, rhs.email).append(profilePicture, rhs.profilePicture).append(encryptedPassword, rhs.encryptedPassword).append(resetPasswordToken, rhs.resetPasswordToken).append(resetPasswordSentAt, rhs.resetPasswordSentAt).append(confirmationToken, rhs.confirmationToken).append(userCeatesAt, rhs.userCeatesAt).append(profileUpdatedAt, rhs.profileUpdatedAt).append(signInCount, rhs.signInCount).append(currentSignInAt, rhs.currentSignInAt).append(lastSignInAt, rhs.lastSignInAt).append(currentSignInIp, rhs.currentSignInIp).append(lastSignInIp, rhs.lastSignInIp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

package com.gamedoora.model.dto;


import java.util.Date;
import java.util.Map;

public class GdUser {

  private long id;
  private String email;
  private String encryptedPassword;
  private String resetPasswordToken;
  private Date resetPasswordSentAt;
  private Date rememberCreatedAt;
  private long signInCount;
  private Date currentSignInAt;
  private Date lastSignInAt;
  private String currentSignInIp;
  private String lastSignInIp;
  private Date createdAt;
  private Date updatedAt;
  private String provider;
  private String uid;
  private String name;
  private String confirmationToken;
  private Date confirmedAt;
  private Date confirmationSentAt;
  private String unconfirmedEmail;
  
  private  String phoneNumber;
  private  boolean emailVerified;
  private  String displayName;
  private  String photoUrl;
  private  boolean disabled;
  private  Map<String, Object> customClaims;
    

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getEncryptedPassword() {
    return encryptedPassword;
  }

  public void setEncryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }


  public String getResetPasswordToken() {
    return resetPasswordToken;
  }

  public void setResetPasswordToken(String resetPasswordToken) {
    this.resetPasswordToken = resetPasswordToken;
  }


  public Date getResetPasswordSentAt() {
    return resetPasswordSentAt;
  }

  public void setResetPasswordSentAt(Date resetPasswordSentAt) {
    this.resetPasswordSentAt = resetPasswordSentAt;
  }


  public Date getRememberCreatedAt() {
    return rememberCreatedAt;
  }

  public void setRememberCreatedAt(Date rememberCreatedAt) {
    this.rememberCreatedAt = rememberCreatedAt;
  }


  public long getSignInCount() {
    return signInCount;
  }

  public void setSignInCount(long signInCount) {
    this.signInCount = signInCount;
  }


  public Date getCurrentSignInAt() {
    return currentSignInAt;
  }

  public void setCurrentSignInAt(Date currentSignInAt) {
    this.currentSignInAt = currentSignInAt;
  }


  public Date getLastSignInAt() {
    return lastSignInAt;
  }

  public void setLastSignInAt(Date lastSignInAt) {
    this.lastSignInAt = lastSignInAt;
  }


  public String getCurrentSignInIp() {
    return currentSignInIp;
  }

  public void setCurrentSignInIp(String currentSignInIp) {
    this.currentSignInIp = currentSignInIp;
  }


  public String getLastSignInIp() {
    return lastSignInIp;
  }

  public void setLastSignInIp(String lastSignInIp) {
    this.lastSignInIp = lastSignInIp;
  }


  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getConfirmationToken() {
    return confirmationToken;
  }

  public void setConfirmationToken(String confirmationToken) {
    this.confirmationToken = confirmationToken;
  }


  public Date getConfirmedAt() {
    return confirmedAt;
  }

  public void setConfirmedAt(Date confirmedAt) {
    this.confirmedAt = confirmedAt;
  }


  public Date getConfirmationSentAt() {
    return confirmationSentAt;
  }

  public void setConfirmationSentAt(Date confirmationSentAt) {
    this.confirmationSentAt = confirmationSentAt;
  }


  public String getUnconfirmedEmail() {
    return unconfirmedEmail;
  }

  public void setUnconfirmedEmail(String unconfirmedEmail) {
    this.unconfirmedEmail = unconfirmedEmail;
  }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the emailVerified
     */
    public boolean isEmailVerified() {
        return emailVerified;
    }

    /**
     * @param emailVerified the emailVerified to set
     */
    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the photoUrl
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * @param photoUrl the photoUrl to set
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * @return the disabled
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * @param disabled the disabled to set
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * @return the customClaims
     */
    public Map<String, Object> getCustomClaims() {
        return customClaims;
    }

    /**
     * @param customClaims the customClaims to set
     */
    public void setCustomClaims(Map<String, Object> customClaims) {
        this.customClaims = customClaims;
    }

}

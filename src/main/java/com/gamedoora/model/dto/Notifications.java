package com.gamedoora.model.dto;


import java.util.Date;

public class Notifications {

  private long id;
  private String uid;
  private String entityType;
  private long entityId;
  private String context;
  private String actionUrl;
  private long isEmail;
  private long isNotification;
  private Date createdAt;
  private Date updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public long getEntityId() {
    return entityId;
  }

  public void setEntityId(long entityId) {
    this.entityId = entityId;
  }


  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public String getActionUrl() {
    return actionUrl;
  }

  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public long getIsEmail() {
    return isEmail;
  }

  public void setIsEmail(long isEmail) {
    this.isEmail = isEmail;
  }


  public long getIsNotification() {
    return isNotification;
  }

  public void setIsNotification(long isNotification) {
    this.isNotification = isNotification;
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

}

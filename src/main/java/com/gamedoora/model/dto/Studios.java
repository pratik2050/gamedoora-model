package com.gamedoora.model.dto;


import java.util.Date;

public class Studios {

  private long id;
  private String name;
  private String uid;
  private long isCommunity;
  private Date createdAt;
  private Date updatedAt;
  private long visibility;
  private long registration;
  private String description;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public long getIsCommunity() {
    return isCommunity;
  }

  public void setIsCommunity(long isCommunity) {
    this.isCommunity = isCommunity;
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


  public long getVisibility() {
    return visibility;
  }

  public void setVisibility(long visibility) {
    this.visibility = visibility;
  }


  public long getRegistration() {
    return registration;
  }

  public void setRegistration(long registration) {
    this.registration = registration;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}

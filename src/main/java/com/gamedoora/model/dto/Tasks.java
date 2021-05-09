package com.gamedoora.model.dto;


import java.util.Date;

public class Tasks {

  private long id;
  private long storyId;
  private String description;
  private long isDone;
  private Date createdAt;
  private Date updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getStoryId() {
    return storyId;
  }

  public void setStoryId(long storyId) {
    this.storyId = storyId;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getIsDone() {
    return isDone;
  }

  public void setIsDone(long isDone) {
    this.isDone = isDone;
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

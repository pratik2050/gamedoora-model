package com.gamedoora.model.dto;


import java.util.Date;

public class Comments {

  private long id;
  private String context;
  private long commentableId;
  private String commentableType;
  private long userId;
  private long parentId;
  private Date createdAt;
  private Date updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public long getCommentableId() {
    return commentableId;
  }

  public void setCommentableId(long commentableId) {
    this.commentableId = commentableId;
  }


  public String getCommentableType() {
    return commentableType;
  }

  public void setCommentableType(String commentableType) {
    this.commentableType = commentableType;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
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

package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "stories", uniqueConstraints = @UniqueConstraint(columnNames = {"state_id", "created_at"}))
public class Story implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "stories", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", table = "stories")
    private String name;
    @Basic
    @Column(name = "description", table = "stories")
    private String description;
    @Basic
    @Column(name = "start_date", table = "stories")
    private Integer startDate;
    @Basic
    @Column(name = "due_date", table = "stories")
    private Integer dueDate;
    @Basic(optional = false)
    @Column(name = "state_id", table = "stories", nullable = false)
    private int stateId;
    @Basic
    @Column(name = "position", table = "stories")
    private Integer position;
    @Lob
    @Basic
    @Column(name = "remarks", table = "stories", length = 65535)
    private String remarks;
    @Basic(optional = false)
    @Column(name = "created_at", table = "stories", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "stories", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany
    private List<StoryUser> storyUsers;
    @OneToMany
    private List<StudioStoryAsset> studioStoryAssets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getDueDate() {
        return dueDate;
    }

    public void setDueDate(Integer dueDate) {
        this.dueDate = dueDate;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public List<StoryUser> getStoryUsers() {
        if (storyUsers == null) {
            storyUsers = new ArrayList<>();
        }
        return storyUsers;
    }

    public void setStoryUsers(List<StoryUser> storyUsers) {
        this.storyUsers = storyUsers;
    }

    public void addStoryUser(StoryUser storyUser) {
        getStoryUsers().add(storyUser);
    }

    public void removeStoryUser(StoryUser storyUser) {
        getStoryUsers().remove(storyUser);
    }

    public List<StudioStoryAsset> getStudioStoryAssets() {
        if (studioStoryAssets == null) {
            studioStoryAssets = new ArrayList<>();
        }
        return studioStoryAssets;
    }

    public void setStudioStoryAssets(List<StudioStoryAsset> studioStoryAssets) {
        this.studioStoryAssets = studioStoryAssets;
    }

    public void addStudioStoryAsset(StudioStoryAsset studioStoryAsset) {
        getStudioStoryAssets().add(studioStoryAsset);
    }

    public void removeStudioStoryAsset(StudioStoryAsset studioStoryAsset) {
        getStudioStoryAssets().remove(studioStoryAsset);
    }

}
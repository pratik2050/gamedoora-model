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

@Entity
@Table(name = "studios")
public class Studios implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "studios", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", table = "studios")
    private String name;
    @Basic
    @Column(name = "uid", table = "studios")
    private String uid;
    @Basic
    @Column(name = "is_community", table = "studios")
    private Integer isCommunity;
    @Basic(optional = false)
    @Column(name = "created_at", table = "studios", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "studios", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic
    @Column(name = "visibility", table = "studios")
    private Short visibility;
    @Basic
    @Column(name = "registration", table = "studios")
    private Short registration;
    @Lob
    @Basic
    @Column(name = "description", table = "studios", length = 65535)
    private String description;
    @OneToMany
    private List<StudioAssets> studioAssetses;
    @OneToMany
    private List<StudioUserRequests> studioUserRequestses;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getIsCommunity() {
        return isCommunity;
    }

    public void setIsCommunity(Integer isCommunity) {
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

    public Short getVisibility() {
        return visibility;
    }

    public void setVisibility(Short visibility) {
        this.visibility = visibility;
    }

    public Short getRegistration() {
        return registration;
    }

    public void setRegistration(Short registration) {
        this.registration = registration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<StudioAssets> getStudioAssetses() {
        if (studioAssetses == null) {
            studioAssetses = new ArrayList<>();
        }
        return studioAssetses;
    }

    public void setStudioAssetses(List<StudioAssets> studioAssetses) {
        this.studioAssetses = studioAssetses;
    }

    public void addStudioAssetse(StudioAssets studioAssetse) {
        getStudioAssetses().add(studioAssetse);
    }

    public void removeStudioAssetse(StudioAssets studioAssetse) {
        getStudioAssetses().remove(studioAssetse);
    }

    public List<StudioUserRequests> getStudioUserRequestses() {
        if (studioUserRequestses == null) {
            studioUserRequestses = new ArrayList<>();
        }
        return studioUserRequestses;
    }

    public void setStudioUserRequestses(List<StudioUserRequests> studioUserRequestses) {
        this.studioUserRequestses = studioUserRequestses;
    }

    public void addStudioUserRequestse(StudioUserRequests studioUserRequestse) {
        getStudioUserRequestses().add(studioUserRequestse);
    }

    public void removeStudioUserRequestse(StudioUserRequests studioUserRequestse) {
        getStudioUserRequestses().remove(studioUserRequestse);
    }

}
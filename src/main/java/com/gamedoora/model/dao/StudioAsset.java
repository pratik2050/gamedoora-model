package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studio_assets")
public class StudioAsset extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    Studios studios;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Users users;

    @Column(name = "uid")
    private String uid;

    @Column(name = "name" , columnDefinition = "asset name")
    private String name;

    @Column(name = "context" , columnDefinition = "default '1'")
    private String context;

    @Column(name = "version" , columnDefinition = "DEFAULT 1")
    private int version;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "bucket_name" , length = 512)
    private String bucketName;

    @Column(name = "is_published" , columnDefinition = "DEFAULT '0'")
    private boolean isPublished;

    @Column(name = "is_uploaded" , columnDefinition = "DEFAULT '0'")
    private boolean isUploaded;

    @Column(name = "is_uploading" , columnDefinition = "DEFAULT '0'")
    private boolean isUploading;

    @Column(name = "is_deleted" , columnDefinition = "DEFAULT '0'")
    private boolean isDeleted;

    @Column(name = "asset_file_size" , columnDefinition = "DEFAULT '0'")
    private int assetFileSize;

    @Column(name = "asset_file_content_type" , length = 128)
    private String assetFileContentType;

    @Column(name = "asset_file_name" , length = 64)
    private String assetFileName;

    @Column(name = "asset_file_url" , length = 1024)
    private String assetFileUrl;

    @Column(name = "asset_file_updated_at")
    private Date assetFileUpdatedAt;

    @Column(name = "script_locked_by")
    private int scriptLockedBy;

    @Column(name = "script_locked_at")
    private Date scriptLockedAt;

    @Column(name = "asset_type" , columnDefinition = "NOT NULL COMMENT 'document or image or audio or video.")
    private String assetType;

}

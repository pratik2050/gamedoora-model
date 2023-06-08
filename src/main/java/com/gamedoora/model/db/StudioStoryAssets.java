package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name = "studio_story_assets")
public class StudioStoryAssets extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @Column(name = "story_id")
    Stories stories;

    @ManyToOne
    @JoinColumn(name = "studio_asset_id")
    StudioAsset asset;
}

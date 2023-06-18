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

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tag_entities")
public class TagEntity extends Audit {

   @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    Tags tag;

    @Column(name = "entity_id")
    private int entityId;

    @Column(name = "entity_type")
    private String entityType;

}

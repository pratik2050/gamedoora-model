package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "studios")
public class Studios extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String  description;

    @Column(name = "uid")
    private String uid;

    @Column(name = "is_community" , columnDefinition = "1")
    private int isCommunity;

    @Column(name = "visibility" , columnDefinition = "true")
    private boolean visibility;

    @Column(name = "registration" , columnDefinition = "false")
    private boolean registration;
}

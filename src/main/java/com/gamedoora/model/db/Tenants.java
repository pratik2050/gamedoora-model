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
@Table(name = "tenants")
public class Tenants extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @Column(name = "subdomain")
    private String subDomain;

    @Column(name = "entity_id")
    private int entityId;

    @Column(name = "entity_type")
    private String entityType;

}

package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import com.gamedoora.model.dao.Users;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tenant_users")
public class TenantUser extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    Tenants tenants;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Users users;

    @Column(name = "role")
    private String role;

}

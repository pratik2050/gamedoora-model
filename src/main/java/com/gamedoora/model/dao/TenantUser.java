package com.gamedoora.model.dao;

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
@Table(name = "tenant_users")
public class TenantUser extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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

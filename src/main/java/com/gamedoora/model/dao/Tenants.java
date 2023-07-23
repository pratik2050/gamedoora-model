package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(name = "tenant_users" , joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "tenant_id"))
    Set<Users> users;

}

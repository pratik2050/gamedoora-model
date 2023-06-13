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
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studios")
public class Studios extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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

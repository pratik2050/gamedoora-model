package com.gamedoora.model.dao;

import lombok.Builder;
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

@Builder
@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name = "studio_user_requests")
public class StudioUserRequest extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @Column(name = "uid")
    private String uid;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    Studios studios;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Users users;

    @Column(name = "status")
    private String status;

}

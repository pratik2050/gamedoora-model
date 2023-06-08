package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import com.gamedoora.model.dao.Providers;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name = "identities")
public class Identities extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "uid")
    private String uid;

//    @ManyToOne
//    @JoinColumn
//    private Providers providers;

    @Column(name = "provider")
    private String provider;
}

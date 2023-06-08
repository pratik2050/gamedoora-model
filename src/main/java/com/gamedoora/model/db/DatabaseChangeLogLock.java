package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name = "database_change_log_lock")
public class DatabaseChangeLogLock extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "locked_by")
    private String lockedBy;

    @Column(name = "lock_granted")
    private Date lockGranted;

    @Column(name = "locked" , nullable = false)
    private boolean locked;

}

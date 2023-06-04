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
@Table(name = "notifications")
public class Notifications extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "entity_type")
    private String type;

    @Column(name = "entity_id")
    private long entityId;

    @Column(name = "context")
    private String context;

    @Column(name = "action_url")
    private String actionUrl;

    @Column(name = "is_email" , columnDefinition = "false")
    private boolean isEmail;

    @Column(name = "is_notification" , columnDefinition = "false")
    private boolean isNotification;
}

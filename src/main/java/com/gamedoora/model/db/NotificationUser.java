package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import com.gamedoora.model.dao.Users;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name = "notification_user")
public class NotificationUser extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "notification_id")
    private Notifications notifications;

    @Column(name = "user_id")
    private Users users;

    @Column(name = "is_seen" , columnDefinition = "false")
    private boolean isSeen;

    @Column(name = "is_clicked" , columnDefinition = "false")
    private boolean isClicked;
}

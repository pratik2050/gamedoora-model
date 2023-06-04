package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
import com.gamedoora.model.dao.Users;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "comments")
public class Comments extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "context" , nullable = false)
    private String context;

    @Column(name = "commentable_id" , nullable = false)
    private long commentableId;

    @Column(name = "commentable_type" , nullable = false)
    private String type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Users users;

    @Column(name = "parent_id")
    private long parentId;
}

package com.gamedoora.model.db;

import com.gamedoora.model.dao.Audit;
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
@Table(name = "tasks")
public class Task extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "id" , nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "story_id")
    Stories stories;

    @Column(name = "description")
    private String description;

    @Column(name = "is_done" , columnDefinition = "false")
    private boolean isDone;

}

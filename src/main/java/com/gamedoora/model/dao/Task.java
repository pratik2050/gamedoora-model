package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@Table(name = "tasks")
public class Task extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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

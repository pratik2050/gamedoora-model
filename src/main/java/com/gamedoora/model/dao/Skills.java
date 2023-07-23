package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skills")
public class Skills extends Audit implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private long id;

	@Basic
	@Column(name = "skill_name")
	private String name;

	@Basic
	@Column(name = "skill_description")
	private String description;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_skills", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
	Set<Users> users;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "skills_sources", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "source_id"))
	Set<Sources> skillsSources;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "roles_skills", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
	Set<Roles> roles;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

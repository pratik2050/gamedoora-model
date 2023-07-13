package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sources")
public class Sources extends Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "source_name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "skills_sources", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "source_id"))
	Set<Skills> skills;

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

	public Set<Skills> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}

}

package com.liujun.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resume")
	private List<Experience> expList = new ArrayList<>();

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

	public List<Experience> getExpList() {
		return expList;
	}

	public void setExpList(List<Experience> expList) {
		this.expList = expList;
	}

}

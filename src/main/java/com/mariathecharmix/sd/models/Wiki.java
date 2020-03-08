package com.mariathecharmix.sd.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="wikis")
public class Wiki {

	@Id
	@Column(name="id_wikis")
	@GeneratedValue
	private int idWiki;
	
	@Column(name="name")
	private int name;

	@ManyToOne
	@JoinColumn(name="id_users")
	private User user;
	
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Category> categories = new HashSet<>();
	
	public Wiki() {
		// TODO Auto-generated constructor stub
	}
	
	public Wiki(int idWiki, int name, User user, Set<Category> categories) {
		super();
		this.idWiki = idWiki;
		this.name = name;
		this.user = user;
		this.categories = categories;
	}

	public int getIdWiki() {
		return idWiki;
	}
	public void setIdWiki(int idWiki) {
		this.idWiki = idWiki;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<Category> getCategories() {
		return categories;
	}
	
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
}

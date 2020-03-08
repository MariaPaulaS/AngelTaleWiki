package com.mariathecharmix.sd.models;

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
@Table(name="articles")
public class Article {

	@Id
	@Column(name="id_articles")
	@GeneratedValue
	private int idArticle;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name="id_categories")
	private Category category;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Section> sections = new HashSet<>();
	
	public Article(int idArticle, String name, String description, Category category, Set<Section> sections) {
		super();
		this.idArticle = idArticle;
		this.name = name;
		this.description = description;
		this.category = category;
		this.sections = sections;
	}


	public Article() {
		// TODO Auto-generated constructor stub
	}



	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	public Set<Section> getSections() {
		return sections;
	}


	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}
	


}

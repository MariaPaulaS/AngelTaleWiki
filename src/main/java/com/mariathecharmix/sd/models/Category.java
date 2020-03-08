package com.mariathecharmix.sd.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@Column(name="id_categories")
	@GeneratedValue
	private int idCategory;
	
	@Column(name="name")
	private int name;
	
	@ManyToOne
	@JoinColumn(name="id_parent")
	private Category categoryParent;

	@OneToMany
	private Set<Category> categories = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="id_wikis")
	private Wiki wiki;
	
	@OneToMany
	private Set<Article> articles = new HashSet<>();
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(int idCategory, int name, Category categoryParent, Set<Category> categories, Wiki wiki,
			Set<Article> articles) {
		super();
		this.idCategory = idCategory;
		this.name = name;
		this.categoryParent = categoryParent;
		this.categories = categories;
		this.wiki = wiki;
		this.articles = articles;
	}

	public Set<Article> getArticles() {
		return articles;
	}


	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}


	public Category getCategoryParent() {
		return categoryParent;
	}




	public void setCategoryParent(Category categoryParent) {
		this.categoryParent = categoryParent;
	}




	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}


	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Wiki getWiki() {
		return wiki;
	}

	public void setWiki(Wiki wiki) {
		this.wiki = wiki;
	}
	
	
	
}
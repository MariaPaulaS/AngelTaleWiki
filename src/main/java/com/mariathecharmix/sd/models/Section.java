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

import org.springframework.lang.Nullable;

@Entity
@Table(name="sections")
public class Section {
	
	@Id
	@Column(name="id_sections")
	@GeneratedValue
	private int idSection;
	
	@Column(name="title")
	private String title;
	
	@Column(name="text_body")
	private String textBody;
	
	@ManyToOne
	@JoinColumn(name="id_articles")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="id_section_parent")
	private Section sectionParent;
	
	@OneToMany(cascade = CascadeType.ALL)
	@Nullable
	private Set<Image> images = new HashSet<>();

	public Section() {
		// TODO Auto-generated constructor stub
	}
	
	



	public Section(int idSection, String title, String textBody, Article article, Section sectionParent,
			Set<Image> images) {
		super();
		this.idSection = idSection;
		this.title = title;
		this.textBody = textBody;
		this.article = article;
		this.sectionParent = sectionParent;
		this.images = images;
	}





	public Article getArticle() {
		return article;
	}





	public void setArticle(Article article) {
		this.article = article;
	}





	public Section getSectionParent() {
		return sectionParent;
	}





	public void setSectionParent(Section sectionParent) {
		this.sectionParent = sectionParent;
	}





	public Set<Image> getImages() {
		return images;
	}





	public void setImages(Set<Image> images) {
		this.images = images;
	}





	public int getIdSection() {
		return idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTextBody() {
		return textBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}

}

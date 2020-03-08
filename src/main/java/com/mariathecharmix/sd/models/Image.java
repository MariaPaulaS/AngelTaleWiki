package com.mariathecharmix.sd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="images")
public class Image {
	
	@Id
	@Column(name="id_images")
	@GeneratedValue
	private int idImage;
	
	@Column(name="image")
	private String image;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@Nullable
	@JoinColumn(name="id_sections")
	private Section section;

	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(int idImage, String image, String description, Section section) {
		super();
		this.idImage = idImage;
		this.image = image;
		this.description = description;
		this.section = section;
	}

	public int getIdImage() {
		return idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	
	

}

package com.mariathecharmix.sd.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name="id_users")
	@GeneratedValue
	private int idUser;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	@Email
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="nickname")
	private String nickname;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Wiki> wikis = new HashSet<>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}
		
	public User(int idUser, String name, String email, String password, String nickname) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
	}



	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
	
}

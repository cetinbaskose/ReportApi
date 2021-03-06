package com.example.reportapi.domain;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="security_user")
public class User {
    
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	

	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Column(name ="username")
	private String username;
	
	@Column(name ="password")
	@JsonIgnore
	private String password;
	
	protected User()
	{}

	
	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
	
	private List<Role> roles;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}

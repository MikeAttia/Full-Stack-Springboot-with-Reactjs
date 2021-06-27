package net.perscholas.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	 @Column(name="name")
	private String name;
	 
	 @Column(name="email")
	private String email;
	 
	 @Column(name="major")
	private String major;
	 
	 @Column(name="math_score")
	private float math_score;
	 
	 @Column(name="english_score")
	private float english_score;
	 
	 @Column(name="scince")
	private float scince;
	
	
	public Student(String name, String email, String major, float math_score, float english_score, float scince) {
		super();
		this.name = name;
		this.email = email;
		this.major = major;
		this.math_score = math_score;
		this.english_score = english_score;
		this.scince = scince;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public float getMath_score() {
		return math_score;
	}
	public void setMath_score(float math_score) {
		this.math_score = math_score;
	}
	public float getEnglish_score() {
		return english_score;
	}
	public void setEnglish_score(float english_score) {
		this.english_score = english_score;
	}
	public float getScince() {
		return scince;
	}
	public void setScince(float scince) {
		this.scince = scince;
	}

}

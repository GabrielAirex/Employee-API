package com.synchro.api.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name ="employee",schema = "public")
public class Employee{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getDoc() {
		return doc;
	}

	public String getCpf() {
		return cpf;
	}

	public String getPhone() {
		return phone;
	}

	public String getRole() {
		return role;
	}

	public String getSalary() {
		return salary;
	}

	public String getSeniority() {
		return seniority;
	}

	public String getGender() {
		return gender;
	}

	public String getMarital() {
		return marital;
	}

	public String getDate_born() {
		return date_born;
	}

	public String getAge() {
		return age;
	}

	public String getIndicated() {
		return indicated;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public void setDate_born(String date_born) {
		this.date_born = date_born;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setIndicated(String indicated) {
		this.indicated = indicated;
	}

	@Column(name="name")
	String name;

	@Column(name="lastname")
	String lastname;

	@Column(name="email")
	String email;

	@Column(name="doc")
	String doc;

	@Column(name="cpf")
	String cpf;

	@Column(name="phone")
	String phone;

	@Column(name="role")
	String role;

	@Column(name="salary")
	String salary;

	@Column(name="seniority")
	String seniority;

	@Column(name="gender")
	String gender;

	@Column(name="marital")
	String marital;

	@Column(name="date_born")
	String date_born;

	@Column(name="age")
	String age;

	@Column(name="indicated")
	String indicated;
	


}

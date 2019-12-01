package com.student.ete.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentTab")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	@Column(name = "name")
	private String sName;
	@Column(name = "course")
	private String sCourse;
	@Column(name = "fee")
	private Double fee;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCourse=" + sCourse + ", fee=" + fee + "]";
	}

}

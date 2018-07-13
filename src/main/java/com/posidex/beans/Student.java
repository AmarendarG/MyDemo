package com.posidex.beans;

import java.util.Arrays;
import java.util.Date;

public class Student {

	private int studentId;

	private String studentName;

	private Date studentDob;

	private String[] skills;

	private boolean taxPayer;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public boolean isTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(boolean taxPayer) {
		this.taxPayer = taxPayer;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDob=" + studentDob
				+ ", skills=" + Arrays.toString(skills) + ", taxPayer=" + taxPayer + "]";
	}

}

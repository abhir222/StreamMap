package com.dk;

import java.util.List;

public class Customer {

	private int id;
	private String empName;
	private String emai;
	
	private List<String> mobileNumbers; 

	public Customer() {
		super();
	}

	public Customer(int id, String empName, String emai, List<String> mobileNumbers) {
		super();
		this.id = id;
		this.empName = empName;
		this.emai = emai;
		this.mobileNumbers = mobileNumbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public List<String> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", empName=" + empName + ", emai=" + emai + ", mobileNumbers=" + mobileNumbers
				+ "]";
	}
	
	
	
	
}

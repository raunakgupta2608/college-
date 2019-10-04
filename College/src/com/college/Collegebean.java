package com.college;

import java.util.*;
public class Collegebean {
	
	private String cid;
	private String cname;
	private String  coursetype;
	private String city; 
	private String fees;
	private String pincode;
	private List<String> list;
	private int i;

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}

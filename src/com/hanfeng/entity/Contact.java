package com.hanfeng.entity;



public class Contact { //联系人
      private int contact_id; //编号1
      private String contact_name; //姓名2
      private String contact_class; //类别3
      private String contact_stuID; //4
      private int contact_age; //年龄5
      private String contact_birthday; //生日6
      private double contact_weight; //体重7
      private String contact_phone; //电话8
      private String contact_remarks; //备注9
	
   
    public Contact() {
  	
  	}  
    public Contact(int contact_id, String contact_name, String contact_class, String contact_stuID, int contact_age,
			String contact_birthday, double contact_weight, String contact_phone, String contact_remarks) {
		super();
		this.contact_id = contact_id;
		this.contact_name = contact_name;
		this.contact_class = contact_class;
		this.contact_stuID = contact_stuID;
		this.contact_age = contact_age;
		this.contact_birthday = contact_birthday;
		this.contact_weight = contact_weight;
		this.contact_phone = contact_phone;
		this.contact_remarks = contact_remarks;
	}
    public Contact(String contact_name, String contact_class, String contact_stuID, int contact_age,
			String contact_birthday, double contact_weight, String contact_phone, String contact_remarks) {
		super();
		this.contact_name = contact_name;
		this.contact_class = contact_class;
		this.contact_stuID = contact_stuID;
		this.contact_age = contact_age;
		this.contact_birthday = contact_birthday;
		this.contact_weight = contact_weight;
		this.contact_phone = contact_phone;
		this.contact_remarks = contact_remarks;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_class() {
		return contact_class;
	}
	public void setContact_class(String contact_class) {
		this.contact_class = contact_class;
	}
	public String getContact_stuID() {
		return contact_stuID;
	}
	public void setContact_stuID(String contact_stuID) {
		this.contact_stuID = contact_stuID;
	}
	public int getContact_age() {
		return contact_age;
	}
	public void setContact_age(int contact_age) {
		this.contact_age = contact_age;
	}
	public String getContact_birthday() {
		return contact_birthday;
	}
	public void setContact_birthday(String contact_birthday) {
		this.contact_birthday = contact_birthday;
	}
	public double getContact_weight() {
		return contact_weight;
	}
	public void setContact_weight(double contact_weight) {
		this.contact_weight = contact_weight;
	}
	public String getContact_phone() {
		return contact_phone;
	}
	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}
	public String getContact_remarks() {
		return contact_remarks;
	}
	public void setContact_remarks(String contact_remarks) {
		this.contact_remarks = contact_remarks;
	}
      
      
      
}

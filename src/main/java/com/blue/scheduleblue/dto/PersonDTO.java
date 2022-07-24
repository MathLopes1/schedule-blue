package com.blue.scheduleblue.dto;

import java.io.Serializable;

import com.blue.scheduleblue.schema.PersonSchema;

public class PersonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String address;
	private String phoneNumber;
	
	public PersonDTO() {
	}
	
	public PersonDTO(PersonSchema obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.address = obj.getAddress();
        this.phoneNumber = obj.getphoneNumber();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

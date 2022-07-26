package com.blue.scheduleblue.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.blue.scheduleblue.schema.PersonSchema;

public class PersonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
	
	private String id;

	@NotEmpty(message = "Nome não pode ser vázio")
	private String name;

	@NotEmpty(message = "Email não pode ser vázio")
	@Email(message = "Digite um email válido")
	private String emailAddress;

	@NotEmpty()
	@Size(min = 15, max = 15, message = "Digit (00) 00000-0000")
	private String phoneNumber;
	
	public PersonDTO() {
	}
	
	public PersonDTO(PersonSchema obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.emailAddress = obj.getEmailAddress();
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

    public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

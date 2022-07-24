package com.blue.scheduleblue.schema;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Schedule")
public class PersonSchema implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	private String id;

	@NotEmpty(message = "Nome não pode ser vázio")
	private String name;

	@NotEmpty(message = "Email não pode ser vázio")
	@Email(message = "Digite um email válido")
	private String emailAddress;

	@NotEmpty()
	@Size(min = 11, max = 11, message = "Digit (00) 00000-0000")
	private String phoneNumber;
	
	public PersonSchema() {
	}

	public PersonSchema(String id, String name, String emailAddress, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber; 
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

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

    public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			PersonSchema other = (PersonSchema) obj;
		return Objects.equals(id, other.id);
	}
}

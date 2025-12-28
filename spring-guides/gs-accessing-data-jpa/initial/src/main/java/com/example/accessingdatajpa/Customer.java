package com.example.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Customer {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long Id;
private String firstName;
private String lastName;

protected Customer() {};

public Customer (String firstName, String lastName) {
	this.lastName = lastName;
	this.firstName = firstName;
}

@Override
public String toString() {
	return String.format("Customer[Id=%d,firstName=%s,lastName=%s]",this.Id,this.firstName,this.lastName);
}

public long getId() {
	return this.Id;
}

public String getFirstName() {
	return this.firstName;
}

public String getLastName() {
	return lastName;
}

}

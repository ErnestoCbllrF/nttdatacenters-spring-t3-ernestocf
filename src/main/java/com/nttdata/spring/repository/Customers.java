package com.nttdata.spring.repository;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Taller 3 Spring
 * 
 * Clase clientes
 * 
 * @author ernestocf
 *
 */
@Entity
@Table(name = "CUSTOMERS")
public class Customers implements Serializable{
	
	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador del cliente */
	private long customerId;

	/** Nombre del cliente */
	private String name;

	/** Primer apellido del cliente */
	private String surname;

	/** Segundo apellido del cliente */
	private String secondSurname;

	/** Fecha de nacimiento del cliente */
	private String birthDate;

	/** Dni del cliente */
	private String customerDni;

	/**
	 * @return the customerId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	public long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the name
	 */
	@Column(name = "CUSTOMERS_NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	@Column(name = "CUSTOMERS_SURNAME")
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the secondSurname
	 */
	@Column(name = "CUSTOMERS_SECOND_SURNAME")
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @param secondSurname the secondSurname to set
	 */
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	/**
	 * @return the birthDate
	 */
	@Column(name = "BIRTHDATE")
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the customerDni
	 */
	@Column(name = "CUSTOMERS_DNI")
	public String getCustomerDni() {
		return customerDni;
	}

	/**
	 * @param customerDni the customerDni to set
	 */
	public void setCustomerDni(String customerDni) {
		this.customerDni = customerDni;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", name=" + name + ", surname=" + surname + ", secondSurname="
				+ secondSurname + ", birthDate=" + birthDate + ", dni=" + customerDni + "]";
	}
	
	

}

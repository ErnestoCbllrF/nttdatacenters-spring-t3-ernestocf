package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.repository.Customers;

/**
 * Taller 3 Spring
 * 
 * Interfaz servicio gestión de clientes
 * 
 * @author ernestocf
 *
 */
public interface CustomersManagementServiceI {

	/**
	 * Añadir clientes
	 * 
	 * @param c
	 */
	public void addCustomers(Customers c);

	/**
	 * Actualizar clientes
	 * 
	 * @param c
	 */
	public void updateCustomers(Customers c);

	/**
	 * Borrar clientes
	 * 
	 * @param c
	 */
	public void deleteCustomers(Customers c);

	/**
	 * Borrar cliente por Id
	 * 
	 * @param customerId
	 */
	public void deleteCustomersById(Long customerId);

	/**
	 * Crear clientes
	 * 
	 * @param name
	 * @param surname
	 * @param secondSurname
	 * @param birthDate
	 * @param customersDni
	 * @return
	 */
	public Customers createCustomers(String name, String surname, String secondSurname, String birthDate,
			String customersDni);

	/**
	 * Buscar a un cliente por su Id
	 * 
	 * @param customerId
	 * @return
	 */
	public Customers getCustomersById(Long customerId);

	/**
	 * Buscar cliente por nombre completo
	 * 
	 * @param name
	 * @param surname
	 * @param secondsurname
	 * @return
	 */
	public List<Customers> getCustomerByFullName(String name, String surname, String secondsurname);

	/**
	 * Busqueda de todos los clientes con la información de cada uno
	 * 
	 * @return
	 */
	public List<Customers> getAllCustomers();
}

package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Customers;
import com.nttdata.spring.repository.CustomersRepository;

/**
 * Taller 3 Spring
 * 
 * Implementación servicio gestión de clientes
 * 
 * @author ernestocf
 *
 */
@Service
public class CustomersManagementServicesImpl implements CustomersManagementServiceI {

	@Autowired
	CustomersRepository customersRepo;

	@Override
	public void addCustomers(Customers c) {
		customersRepo.save(c);
	}

	@Override
	public void updateCustomers(Customers c) {
		customersRepo.save(c);
	}

	@Override
	public void deleteCustomers(Customers c) {
		customersRepo.delete(c);
	}

	@Override
	public void deleteCustomersById(Long customerId) {
		customersRepo.deleteById(customerId);
	}

	@Override
	public Customers createCustomers(String name, String surname, String secondSurname, String birthDate,
			String customersDni) {
		Customers newCustomer = new Customers();
		newCustomer.setName(name);
		newCustomer.setSurname(surname);
		newCustomer.setSecondSurname(secondSurname);
		newCustomer.setBirthDate(birthDate);
		newCustomer.setCustomerDni(customersDni);

		return newCustomer;
	}

	@Override
	public Customers getCustomersById(Long customerId) {
		return customersRepo.findById(customerId).get();
	}

	@Override
	public List<Customers> getCustomerByFullName(String name, String surname, String secondSurname) {
		return customersRepo.findByNameAndSurnameAndSecondSurname(name, surname, secondSurname);
	}

	@Override
	public List<Customers> getAllCustomers() {
		return customersRepo.findAll();
	}

}

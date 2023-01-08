package com.nttdata.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Customers;
import com.nttdata.spring.services.CustomersManagementServiceI;

/**
 * Taller 3 Spring
 * 
 * Clase Principal
 * 
 * @author ernestocf
 *
 */
@SpringBootApplication()
public class NttDataT3MainSpring implements CommandLineRunner{

	@Autowired
	private CustomersManagementServiceI customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataT3MainSpring.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		// Creación de clientes

		Customers c1 = customerService.createCustomers("Claudia", "Cano", "Juud", "20/09/2001", "11111111A");
		Customers c2 = customerService.createCustomers("Jorge", "Munoz", "Gímenez", "15/011/1985", "22222222B");
		Customers c3 = customerService.createCustomers("Alba", "Ferreira", "Villena", "14/04/2001", "33333333C");
		Customers c4 = customerService.createCustomers("Juan Miguel", "Jimenez", "Lopez", "20/05/1993", "44444444D");

		// Inserción de clientes

		customerService.addCustomers(c1);
		customerService.addCustomers(c2);
		customerService.addCustomers(c3);
		customerService.addCustomers(c4);


		// Borrado de clientes
		customerService.deleteCustomers(c3);

		// Borrado de clientes por ID
		customerService.deleteCustomersById(2L);

		// Búsqueda de cliente por nombre
		List<Customers> customerList = customerService.getCustomerByFullName("Claudia", "Cano", "Juud");
		for (Customers customers : customerList) {
			System.out.println("Cliente: " + customers.getName() + " " + customers.getSurname() + " "
					+ customers.getSecondSurname());
		}

		// Listado de todos los clientes
		List<Customers> allCustomerList = customerService.getAllCustomers();
		for (Customers customers : allCustomerList) {
			System.out.println(customers.toString());
		}

	}
}

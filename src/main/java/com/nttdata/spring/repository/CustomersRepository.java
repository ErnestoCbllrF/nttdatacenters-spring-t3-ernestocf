package com.nttdata.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Taller 3 Spring
 * 
 * Repositorio de clientes
 * 
 * @author ernestocf
 *
 */
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>{

	/**
	 * Buscar a un cliente por nombre completo
	 * 
	 * @param name
	 * @param surname
	 * @param secondSurname
	 * @return
	 */
	public List<Customers> findByNameAndSurnameAndSecondSurname(String name, String surname, String secondSurname);

}

package it.dedagroup.project_cea.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dedagroup.project_cea.model.Customer;
import it.dedagroup.project_cea.repository.CustomerRepository;
import it.dedagroup.project_cea.service.def.CustomerServiceDef;

@Service
public class CustomerServiceImpl implements CustomerServiceDef{
	
	@Autowired
	CustomerRepository repo;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer modifyCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(long customer_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findCustomerByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Customer> findCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Customer findCustomerByTax_Code(String taxCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllCustomerByNameAndSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByCellphone(String cellphone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByApartments_Id(long apartment_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
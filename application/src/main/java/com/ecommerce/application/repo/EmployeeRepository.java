package com.ecommerce.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.application.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Employee save(Employee empl);

}

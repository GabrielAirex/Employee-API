package com.synchro.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synchro.api.models.Employee;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findById(long id);
}

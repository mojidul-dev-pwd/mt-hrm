package com.mt.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.hrm.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

package com.mt.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.hrm.model.StudentInformation;

@Repository
public interface StudentRepository extends JpaRepository<StudentInformation, Integer>{

}

package com.mt.hrm.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.hrm.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}

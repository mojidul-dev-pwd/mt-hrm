package com.mt.hrm.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mt.hrm.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}

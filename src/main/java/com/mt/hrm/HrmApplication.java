package com.mt.hrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mt.hrm.model.Address;
import com.mt.hrm.model.StudentInformation;
import com.mt.hrm.repository.AddressRepository;
import com.mt.hrm.repository.EmployeeRepository;
import com.mt.hrm.repository.StudentRepository;

@SpringBootApplication
/*
public class HrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmApplication.class, args);
	}

}
*/
public class HrmApplication implements CommandLineRunner{

	@Autowired 
	private StudentRepository ob;
    @Autowired 
    private AddressRepository ob1;
    
	public static void main(String[] args) {
		SpringApplication.run(HrmApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception
    {
		StudentInformation student = new StudentInformation("Md. Mojidul Islam");
		
		Address add1 = new Address("Dhaka");
		Address add2 = new Address("Kurigram");
		Address add3 = new Address("Rangpur");

		student.getAddresses().add(add1);
		student.getAddresses().add(add2);
		student.getAddresses().add(add3);
		
        this.ob.save(student);
    }

}

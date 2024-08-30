package com.mt.hrm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class StudentInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
    
    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    //private Set<Address> ob;
    List<Address> addresses = new ArrayList<>();
    
    public StudentInformation() {}
    
    public StudentInformation(String name)
    {
    	super();
        this.name = name;
    }
    
    public int getId() { return id; }
 
    public void setId(int id)
    {
 
        this.id = id;
    }
    
    public String getName() { return name; }
    
    public void setName(String name) { this.name = name; }
    
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
	

}

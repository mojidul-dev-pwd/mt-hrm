package com.mt.hrm.model;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
   
    // Mapping the column of this table 
    //@ManyToOne
    //Adding the name
    //@JoinColumn(name = "Student_id")
    //StudentInformation ob;
 
    Address() {}
 
    public Address(String cityname)
    {
    	super();
        this.city = cityname;
        //this.ob = ob1;
    }
    
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String cityname) {
        this.city = cityname;
    }
    
    
}

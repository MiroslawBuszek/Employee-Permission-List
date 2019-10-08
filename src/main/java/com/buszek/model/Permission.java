package com.buszek.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Permission {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long permissionid;

    @Column(name="permissionname")
	private String name;

    @ManyToMany(mappedBy = "permissions")
    private Set<Employee> employees;

    public Permission() {
	}

	public Permission(String name) {
		this.name = name;
	}     

    public long getPermissionid() {
		return permissionid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
    
    
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }	
}

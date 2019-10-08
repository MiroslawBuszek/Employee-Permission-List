package com.buszek.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
	private long id;	 
	private String firstName;
	private String lastName;
	private String department;
    private String position;
    
	private Set<Permission> permissions = new HashSet<Permission>(0);
    
    public Employee() {
    }

	public Employee(String firstName, String lastName, String department, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.position = position;
	}

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

    @Column(name = "firstname")   	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    @Column(name = "lastname")	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    @Column(name = "department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

    @Column(name = "position")
    public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}	

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "employee_permission", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "permissionid") })
	public Set<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
	
	public boolean hasPermission(Permission permission) {
		for (Permission employeePermission: getPermissions()) {
			if (employeePermission.getPermissionid() == permission.getPermissionid()) {
				return true;
			}
		}
		return false;
	}	
}

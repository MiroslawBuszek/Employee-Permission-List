package com.buszek.repository;

import com.buszek.model.Permission;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PermissionRepository extends CrudRepository<Permission, Long> {
    
	List<Permission> findByName(String name);
}


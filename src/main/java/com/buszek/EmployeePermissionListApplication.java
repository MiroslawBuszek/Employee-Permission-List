package com.buszek;

import com.buszek.model.Employee;
import com.buszek.model.Permission;
import com.buszek.model.User;
import com.buszek.repository.EmployeeRepository;
import com.buszek.repository.PermissionRepository;
import com.buszek.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class EmployeePermissionListApplication {

    private static final Logger log = LoggerFactory.getLogger(EmployeePermissionListApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmployeePermissionListApplication.class, args);
    }

    @Bean
    public CommandLineRunner App(EmployeeRepository emplRepository, PermissionRepository permRepository, UserRepository urepository) {
        return (args) -> {

            Employee employee1 = new Employee("John", "Darrow", "Production", "Operators Foreman");
            Employee employee2 = new Employee("Paul", "Brecher", "Maintenance", "Mechanic");
            emplRepository.save(new Employee("Justin", "Frankel", "Production", "Production Handler"));
            emplRepository.save(new Employee("Ron", "Seber", "Quality Control", "Quality controller"));
            emplRepository.save(new Employee("Eric", "Olesen", "Production", "Production Operator"));
            emplRepository.save(new Employee("Chris", "Holdcraft", "Maintenance ", "Electrician"));
            emplRepository.save(new Employee("Anthony", "Canavan", "Production", "Fork Lift Operator"));
            emplRepository.save(new Employee("Pete", "Crouse", "Maintenance", "Automation Service Engineer"));
            emplRepository.save(new Employee("Edgard", "Perez", "Warehouse", "Packing Operator"));

            log.info("App started correctly");

            Permission permission1 = new Permission("Work at height");
            Permission permission2 = new Permission("Forklift licence");
            Permission permission3 = new Permission("Welder certification");
            Permission permission4 = new Permission("Electrical licence 1kV");
            Permission permission5 = new Permission("Licence at loader");

            permRepository.save(permission1);
            permRepository.save(permission2);
            permRepository.save(permission3);
            permRepository.save(permission4);
            permRepository.save(permission5);


            Set<Permission> permissions = new HashSet<Permission>();
            permissions.add(permission1);
            permissions.add(permission2);
            permissions.add(permission3);

            employee1.setPermissions(permissions);
            emplRepository.save(employee1);

            employee2.setPermissions(permissions);
            emplRepository.save(employee2);


            User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
            User user2 = new User("admin", "$2a$08$bCCcGjB03eulCWt3CY0AZew2rVzXFyouUolL5dkL/pBgFkUH9O4J2", "ADMIN");
            urepository.save(user1);
            urepository.save(user2);
        };
    }
}

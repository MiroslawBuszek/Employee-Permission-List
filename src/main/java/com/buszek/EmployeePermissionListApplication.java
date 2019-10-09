package com.buszek;

import com.buszek.model.Employee;
import com.buszek.model.Permission;
import com.buszek.model.User;
import com.buszek.repository.EmployeeRepository;
import com.buszek.repository.PermissionRepository;
import com.buszek.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class EmployeePermissionListApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePermissionListApplication.class, args);
	}


	@Bean
	public CommandLineRunner App (EmployeeRepository emplRepository, PermissionRepository permRepository, UserRepository urepository) {
		return (args) -> {

			Employee employee1 = new Employee("Jan", "Niezbędny", "Dział produkcji", "Operator wibroprasy");
            Employee employee2 = new Employee("Waldemar", "Pośpieszalski", "Dział produkcji", "Mistrz zmiany");
            emplRepository.save(new Employee("Piotr", "Wesoły", "Dział produkcji", "Operator węzła betoniarskiego"));
			emplRepository.save(new Employee("Witold", "Ciekawski", "Dział kontroli jakości", "Brakarz"));
			emplRepository.save(new Employee("Marian", "Odważny", "Dział produkcji","Brygadzista"));
			emplRepository.save(new Employee("Krzysztof", "Skuteczny", "Dział utrzymania ruchu","Elektryk"));
			emplRepository.save(new Employee("Adrian", "Potrzebny", "Dział produkcji","Operator wózka widłowego"));
			emplRepository.save(new Employee("Paweł", "Pracowity", "Dział utrzymania ruchu","Automatyk"));
			emplRepository.save(new Employee("Mieczysław", "Konieczny", "Dział produkcji","Pakowacz"));


			Permission permission1 = new Permission("Uprawnienia wysokościowe");
			Permission permission2 = new Permission("Uprawnienia elektryczne");
			Permission permission3 = new Permission("Uprawnienia spawalnicze");
			Permission permission4 = new Permission("Obsługa AKP");
			Permission permission5 = new Permission("Uprawnienia na ładowarkę");

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

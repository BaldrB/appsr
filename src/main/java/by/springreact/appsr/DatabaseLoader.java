package by.springreact.appsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import by.springreact.appsr.model.Employee;
import by.springreact.appsr.repository.EmployeeRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
    
}

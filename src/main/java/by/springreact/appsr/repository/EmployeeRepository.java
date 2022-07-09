package by.springreact.appsr.repository;

import org.springframework.data.repository.CrudRepository;

import by.springreact.appsr.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}

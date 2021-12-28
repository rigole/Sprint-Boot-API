package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EmployeeRepository;

import java.util.Optional;

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
    }


    public Employee saveEmployee(Employee employee){
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}

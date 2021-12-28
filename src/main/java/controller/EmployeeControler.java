package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

@RestController
public class EmployeeControler {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
}

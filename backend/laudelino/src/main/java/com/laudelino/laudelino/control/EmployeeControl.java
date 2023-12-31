package com.laudelino.laudelino.control;

import com.laudelino.laudelino.models.Employee;
import com.laudelino.laudelino.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeControl {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee estudante) {
        return employeeService.createEmployee(estudante);
    }


    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee estudanteAtualizado) {
        return employeeService.updateEmployee(id, estudanteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
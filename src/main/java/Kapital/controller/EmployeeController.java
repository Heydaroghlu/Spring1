package Kapital.controller;

import Kapital.dto.EmployeeDTOs.EmployeeDTO;
import Kapital.dto.EmployeeDTOs.EmployeeReturnDTO;
import Kapital.service.implementation.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final IEmployeeService employeeService;
    @GetMapping("/{id}")
    public EmployeeReturnDTO getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
    @PostMapping()
    public EmployeeReturnDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
       return employeeService.addEmployee(employeeDTO);
    }

}

package Kapital.service.implementation;

import Kapital.dto.EmployeeDTOs.EmployeeDTO;
import Kapital.dto.EmployeeDTOs.EmployeeReturnDTO;
import Kapital.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeReturnDTO> getAllEmployees();
    public EmployeeReturnDTO getEmployeeById(Long id);
    public EmployeeReturnDTO addEmployee(EmployeeDTO employee);
    public EmployeeReturnDTO updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(Long id);

}

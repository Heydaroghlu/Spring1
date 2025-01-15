package Kapital.service;

import Kapital.dto.EmployeeDTOs.EmployeeDTO;
import Kapital.dto.EmployeeDTOs.EmployeeReturnDTO;
import Kapital.model.Branch;
import Kapital.model.Employee;
import Kapital.repository.IBranchRepository;
import Kapital.repository.IEmployeeRepository;
import Kapital.service.implementation.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository repository;
    private final IBranchRepository branchRepository;
    private final ModelMapper mapper;
    @Override
    public List<EmployeeReturnDTO> getAllEmployees() {
        return mapper.map(repository.findAll(), List.class);
    }

    @Override
    public EmployeeReturnDTO getEmployeeById(Long id) {
        return mapper.map(repository.findById(id), EmployeeReturnDTO.class);
    }

    @Override
    public EmployeeReturnDTO addEmployee(EmployeeDTO employee) {
        Branch branch=mapper.map(branchRepository.findById(employee.getBranch_id()), Branch.class);
        employee.setBranch_id(branch.getId());
        return mapper.map(repository.save(mapper.map(employee,Employee.class)),EmployeeReturnDTO.class);
    }

    @Override
    public EmployeeReturnDTO updateEmployee(EmployeeDTO employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}

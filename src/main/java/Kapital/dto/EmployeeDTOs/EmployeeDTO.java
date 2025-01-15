package Kapital.dto.EmployeeDTOs;

import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private String email;
    private String phone;
    private Long branch_id;
}

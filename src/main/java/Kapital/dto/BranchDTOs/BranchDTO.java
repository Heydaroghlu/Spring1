package Kapital.dto.BranchDTOs;

import Kapital.dto.AddressDTOs.AddressReturnDTO;
import lombok.Data;

@Data
public class BranchDTO {
    private String name;
    private Long addressId;
}

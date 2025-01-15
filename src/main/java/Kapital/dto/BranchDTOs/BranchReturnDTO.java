package Kapital.dto.BranchDTOs;

import Kapital.dto.AddressDTOs.AddressReturnDTO;
import Kapital.model.Address;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class BranchReturnDTO {
    private Long id;
    private String name;
    private AddressReturnDTO address;
}

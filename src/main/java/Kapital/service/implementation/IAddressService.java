package Kapital.service.implementation;

import Kapital.dto.AddressDTOs.AddressDTO;
import Kapital.dto.AddressDTOs.AddressReturnDTO;
import Kapital.model.Address;

import java.util.List;

public interface IAddressService {
    public AddressReturnDTO getAddressById(Long id);

    public Address getAddressById2(Long id);
    public List<AddressReturnDTO> getAddresses();
    public AddressReturnDTO saveAddress(AddressDTO addressDTO);
    public AddressReturnDTO updateAddress(AddressDTO addressDTO);
    public void deleteAddress(Long id);
}

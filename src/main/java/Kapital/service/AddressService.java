package Kapital.service;

import Kapital.dto.AddressDTOs.AddressDTO;
import Kapital.dto.AddressDTOs.AddressReturnDTO;
import Kapital.model.Address;
import Kapital.repository.IAddressRepository;
import Kapital.service.implementation.IAddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AddressService implements IAddressService {
    private final IAddressRepository repository;
    private final ModelMapper mapper;
    @Override
    public AddressReturnDTO getAddressById(Long id) {
       Address address = repository.findById(id).orElse(null);
       if(address == null) {}
       return mapper.map(address, AddressReturnDTO.class);
    }

    @Override
    public Address getAddressById2(Long id) {
        Address address = repository.findById(id).orElse(null);
        if(address == null) {}
        return address;
    }

    @Override
    public List<AddressReturnDTO> getAddresses() {

        return mapper.map(repository.findAll(), List.class);
    }

    @Override
    public AddressReturnDTO saveAddress(AddressDTO addressDTO) {
        return mapper.map(repository.save(mapper.map(addressDTO, Address.class)),AddressReturnDTO.class);
    }

    @Override
    public AddressReturnDTO updateAddress(AddressDTO addressDTO) {
        return null;
    }

    @Override
    public void deleteAddress(Long id) {

    }
}

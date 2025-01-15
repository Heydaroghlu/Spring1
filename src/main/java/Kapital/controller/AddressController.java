package Kapital.controller;

import Kapital.dto.AddressDTOs.AddressDTO;
import Kapital.dto.AddressDTOs.AddressReturnDTO;
import Kapital.service.AddressService;
import Kapital.service.implementation.IAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {
    private final IAddressService addressService;
    @GetMapping("/{id}")
    public AddressReturnDTO get(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }
    @GetMapping("/getall")
    public List<AddressReturnDTO> getAll() {
        return addressService.getAddresses();
    }
    @PostMapping
    public AddressReturnDTO create(@RequestBody AddressDTO addressDTO) {
        return addressService.saveAddress(addressDTO);
    }

}

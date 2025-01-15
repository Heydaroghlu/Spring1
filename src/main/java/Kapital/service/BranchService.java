package Kapital.service;

import Kapital.dto.BranchDTOs.BranchDTO;
import Kapital.dto.BranchDTOs.BranchReturnDTO;
import Kapital.model.Address;
import Kapital.model.Branch;
import Kapital.repository.IBranchRepository;
import Kapital.service.implementation.IAddressService;
import Kapital.service.implementation.IBranchService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BranchService implements IBranchService {
    private final IAddressService addressService;
    private final IBranchRepository branchRepository;
    private final ModelMapper mapper;
    @Override
    public List<BranchReturnDTO> getAllBranches() {
        return mapper.map(branchRepository.findAll(), List.class);
    }
    @Override
    public BranchReturnDTO addBranch(BranchDTO branchDTO) {
        Branch branch = mapper.map(branchDTO, Branch.class);
        branch.setAddress(addressService.getAddressById2(branchDTO.getAddressId()));
        branchRepository.save(branch);
        BranchReturnDTO bt=new BranchReturnDTO();
        return bt;
    }

    @Override
    public BranchReturnDTO updateBranch(BranchDTO branchDTO) {
        return null;
    }
    @Override
    public void deleteBranch(BranchDTO branchDTO) {

    }
}

package Kapital.service.implementation;

import Kapital.dto.BranchDTOs.BranchDTO;
import Kapital.dto.BranchDTOs.BranchReturnDTO;

import java.util.List;

public interface IBranchService {
    public List<BranchReturnDTO> getAllBranches();
    public BranchReturnDTO addBranch(BranchDTO branchDTO);
    public BranchReturnDTO updateBranch(BranchDTO branchDTO);
    public void deleteBranch(BranchDTO branchDTO);
}

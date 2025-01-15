package Kapital.controller;

import Kapital.dto.BranchDTOs.BranchDTO;
import Kapital.dto.BranchDTOs.BranchReturnDTO;
import Kapital.service.implementation.IBranchService;
import jakarta.servlet.http.PushBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/branch")
public class BranchController {
    private final IBranchService branchService;
    @GetMapping("/getAll")
    public List<BranchReturnDTO> getAll()
    {
        return branchService.getAllBranches();
    }
    @PostMapping()
    public BranchReturnDTO create(@RequestBody BranchDTO branchDTO)
    {
        return branchService.addBranch(branchDTO);
    }
}

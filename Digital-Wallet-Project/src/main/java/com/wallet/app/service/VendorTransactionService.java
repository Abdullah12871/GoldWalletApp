package com.wallet.app.service;

import com.wallet.app.model.PhysicalGoldTransaction;
import com.wallet.app.model.VendorBranch;
import com.wallet.app.repository.PhysicalGoldTransactionRepository;
import com.wallet.app.repository.VendorBranchRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendorTransactionService {
    private final VendorBranchRepository branchRepository;
    private final PhysicalGoldTransactionRepository transactionRepository;

    public VendorTransactionService(VendorBranchRepository branchRepository, PhysicalGoldTransactionRepository transactionRepository) {
        this.branchRepository = branchRepository;
        this.transactionRepository = transactionRepository;
    }

    public List<PhysicalGoldTransaction> getTransactionsByVendorId(Long vendorId) {
        List<VendorBranch> branches = branchRepository.findByVendorVendorId(vendorId);
        List<Long> branchIds = branches.stream().map(VendorBranch::getBranchId).collect(Collectors.toList());
        return transactionRepository.findByBranchBranchIdIn(branchIds);
    }
}

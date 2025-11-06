package com.wallet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.app.model.PhysicalGoldTransaction;

import java.util.List;

public interface PhysicalGoldTransactionRepository extends JpaRepository<PhysicalGoldTransaction, Long> {
    List<PhysicalGoldTransaction> findByBranchBranchIdIn(List<Long> branchIds);
}
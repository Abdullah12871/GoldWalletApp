package com.wallet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.app.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> { }
package com.sparta.sakilaweb.repositiries;

import com.sparta.sakilaweb.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
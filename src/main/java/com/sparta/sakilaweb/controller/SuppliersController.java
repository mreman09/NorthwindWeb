package com.sparta.sakilaweb.controller;

import com.sparta.sakilaweb.repositiries.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.function.Supplier;

@Controller
public class SuppliersController {
    @Autowired
   public SupplierRepository supplierRepo;

}

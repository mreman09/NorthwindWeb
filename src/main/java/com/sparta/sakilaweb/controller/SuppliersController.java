package com.sparta.sakilaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.sparta.sakilaweb.repositiries.*;

import java.util.function.Supplier;

@Controller
public class SuppliersController {
    @Autowired
    public Supplier supplierRepo;

}

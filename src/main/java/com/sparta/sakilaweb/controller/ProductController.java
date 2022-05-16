package com.sparta.sakilaweb.controller;

import com.sparta.sakilaweb.entities.Product;
import com.sparta.sakilaweb.repositiries.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    public ProductRepository productRepo;

    @GetMapping("/product/{id}")
    public String getSupplierById(@PathVariable int id, Model model){
        Product productObj = productRepo.getById(id);
        System.out.println(productObj);
        model.addAttribute("productAttr", productObj);
        return "productView";
    }
}

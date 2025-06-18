package com.example.Product.Catalog.controller;

import com.example.Product.Catalog.model.Product;
import com.example.Product.Catalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", service.getAllProducts());
        return "index";
    }

    @GetMapping("/product/new")
    public String addForm(Model model) {
        model.addAttribute("product", new Product());
        return "form";
    }

    @PostMapping("/product/save")
    public String saveProduct(@ModelAttribute Product product) {
        service.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/product/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", service.getProductById(id));
        return "form";
    }

    @GetMapping("/product/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteProduct(id);
        return "redirect:/";
    }
}
package com.example.ch8_ex5.controllers;

import com.example.ch8_ex5.model.Product;
import com.example.ch8_ex5.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model){

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    // @RequestMapping(path = "/products", method = RequestMethod.POST)
    @PostMapping("/products")
    public String addProduct(Model model, @RequestParam String name, double price){

        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.addProduct(p);

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}

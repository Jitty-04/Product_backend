package com.nest.product_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/")
    public String Home(){
        return "welcome to home page";
    }
    @PostMapping("/productadd")
    public String AddProduct(){
        return "welcome to add product page";
    }
    @PostMapping("/searchproduct")
    public String SearchProduct(){
        return "welcome to search product page";
    }
    @GetMapping("/viewallproduct")
    public String ViewAll(){
        return "welcome to view all product page";
    }
    @PostMapping("/deleteproduct")
    public String DeleteProduct(){
        return "welcome to delete product page";
    }
    @PostMapping("/editproduct")
    public String EditProduct(){
        return "welcome to edit product page";
    }

}

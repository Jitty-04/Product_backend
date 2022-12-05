package com.nest.product_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/")
    public String Add(){
        return "welcome to add product page";
    }
    @PostMapping("/search")
    public String Search(){
        return "welcome to search product page";
    }
    @GetMapping("/viewall")
    public String View(){
        return "welcome to view all product page";
    }
    @PostMapping("/delete")
    public String Delete(){
        return "welcome to delete product page";
    }

}

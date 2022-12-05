package com.nest.product_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/")
    public String Add(){
        return "welcome to add product page";
    }

}

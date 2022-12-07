package com.nest.product_app.controller;

import com.nest.product_app.controller.dao.ProductDao;
import com.nest.product_app.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String Home(){
        return "welcome to home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/productadd",consumes ="application/json",produces = "application/json")
    public Map<String,String> AddProduct(@RequestBody Products p){
        System.out.println(p.getProductcode().toString());
        System.out.println(p.getProductname().toString());
        System.out.println(p.getMandate().toString());
        System.out.println(p.getExpdate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getSellername().toString());
        System.out.println(p.getDistributername().toString());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @PostMapping("/searchproduct")
    public String SearchProduct(){
        return "welcome to search product page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewallproduct")
    public List<Products> ViewAll(){

        return (List<Products>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/deleteproduct")
    public String DeleteProduct(){
        return "welcome to delete product page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/editproduct")
    public String EditProduct(){
        return "welcome to edit product page";
    }

}

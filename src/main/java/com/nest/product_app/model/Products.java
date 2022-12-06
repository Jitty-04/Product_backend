package com.nest.product_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue
    private int id;
    private String productcode;
    private String productname;
    private String mandate;
    private String expdate;
    private String brand;
    private int price;
    private String sellername;
    private String distributername;

    public Products() {
    }

    public Products(int id, String productcode, String productname, String mandate, String expdate, String brand, int price, String sellername, String distributername) {
        this.id = id;
        this.productcode = productcode;
        this.productname = productname;
        this.mandate = mandate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.distributername = distributername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getDistributername() {
        return distributername;
    }

    public void setDistributername(String distributername) {
        this.distributername = distributername;
    }
}

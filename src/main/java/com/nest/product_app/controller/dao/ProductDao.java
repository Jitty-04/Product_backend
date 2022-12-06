package com.nest.product_app.controller.dao;

import com.nest.product_app.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}

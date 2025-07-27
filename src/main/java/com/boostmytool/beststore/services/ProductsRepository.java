package com.boostmytool.beststore.services;

import com.boostmytool.beststore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Integer> {

}

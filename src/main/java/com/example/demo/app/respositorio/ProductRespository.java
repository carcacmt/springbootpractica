/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.app.respositorio;

import com.example.demo.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface ProductRespository extends JpaRepository<Product,Integer>{
    Product findByName(String name);
}

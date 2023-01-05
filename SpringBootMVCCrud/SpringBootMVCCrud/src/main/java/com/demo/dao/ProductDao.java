package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beans.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
//find what is jpa repository and what is did
//and why it is using integer
}


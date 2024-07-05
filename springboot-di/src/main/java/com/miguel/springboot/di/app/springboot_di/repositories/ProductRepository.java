package com.miguel.springboot.di.app.springboot_di.repositories;

import com.miguel.springboot.di.app.springboot_di.models.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ProductRepository {

    private List<Product> data;
}

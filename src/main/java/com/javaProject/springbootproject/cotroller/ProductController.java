package com.javaProject.springbootproject.cotroller;

import com.javaProject.springbootproject.entity.Product;
import com.javaProject.springbootproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return  service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return  service.saveProducts(products);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return  service.getProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getAllProducts(@PathVariable int id) {
        return  service.getProduct(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return  service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return  service.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String updateProduct(@PathVariable int id) {
        return  service.deleteProduct(id);
    }





}

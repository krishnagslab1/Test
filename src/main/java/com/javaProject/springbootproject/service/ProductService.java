package com.javaProject.springbootproject.service;

import com.javaProject.springbootproject.entity.Product;
import com.javaProject.springbootproject.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRespository productRespository;

    public Product saveProduct(Product product) {
        return  productRespository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return  productRespository.saveAll(products);
    }
    public  List<Product> getProducts() {
        return  productRespository.findAll();
    }

    public Product getProduct(int id) {
        return productRespository.findById(id).orElse(null);
    }
    public  Product getProductByName(String name) {
        return  productRespository.findByName(name);
    }

    public String deleteProduct(int id) {
        productRespository.deleteById(id);

        return  "product deleted succesfully";
    }

    public Product updateProduct(Product product) {
        Product exisitingProduct = productRespository.findById(product.getId()).orElse(null);
        exisitingProduct.setName(product.getName());
        exisitingProduct.setPrice(product.getPrice());
        exisitingProduct.setQuantity(product.getQuantity());
        return  productRespository.save(exisitingProduct);
    }

}

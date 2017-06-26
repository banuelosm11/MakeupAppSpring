package com.aurora.ControllerV1;


import com.aurora.Domain.Product;

import com.aurora.Repository.ProductRepository;
import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aurorabanuelos on 6/20/17.
 */
@RestController("productControllerV1")
@RequestMapping("/products")
@CrossOrigin("http://localhost:8100")
public class ProductController {


    @Inject
    private ProductRepository productRepository;

    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    public ResponseEntity<Iterable<Product>> getAllProducts() {
        Iterable<Product> allProducts = productRepository.findAll();
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Product> getOneProduct(@PathVariable Long id) {
        Product findOne = productRepository.findOne(id);
        return new ResponseEntity<>(findOne, HttpStatus.OK);
    }

    @RequestMapping(value="/put", method= RequestMethod.PUT)
    public ResponseEntity<?> getOneProduct(@RequestBody Product p) {
        Product prod = productRepository.findOne(p.getId());
        prod.setBrand(p.getBrand());
        prod.setUsedUP(p.isUsedUP());
        prod.setCategory(p.getCategory());
        prod.setRepurchase(p.isRepurchase());
        prod.setReview(p.getReview());
        prod.setColor(p.getColor());
        prod.setProductName(p.getProductName());
        prod.setPrice(p.getPrice());
        prod.setPurchaseDate(p.getPurchaseDate());
        prod.setExpirationDate(p.getExpirationDate());
        return new ResponseEntity<>(productRepository.findOne(prod.getId()), HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        productRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/post", method= RequestMethod.POST)
    public ResponseEntity<?> postProduct(@RequestBody Product p) {
        productRepository.save(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}

package com.aurora.Domain;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by aurorabanuelos on 6/19/17.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name="PRODUCT_ID")
    private Long id;

    @Column(name="BRAND")
    @NotEmpty
    private String brand;

    @Column(name="PRODUCTNAME")
    @NotEmpty
    private String productName;

    @Column(name="CATEGORY")
    @NotEmpty
    private String category;

    @Column(name="COLOR")
    @NotEmpty
    private String color;

    @Column(name="PRICE")
    @NotEmpty
    private double price;

    @Column(name="PURCHASEDATE")
    private String purchaseDate;

    @Column(name="EXPIRATIONDATE")
    private String expirationDate;

    @Column(name="REVIEW")
    private String review;

    @Column(name="REPURCHASE")
    private boolean repurchase = false;

    @Column(name="USEDUP")
    private boolean usedUP = false;
//
//    @Column(name="PRODUCTIMAGES")
//    private Set<String> productImages;

    //    public Set<String> getProductImages() {
//        return productImages;
//    }
//
//    public void setProductImages(Set<String> productImages) {
//        this.productImages = productImages;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public boolean isRepurchase() {
        return repurchase;
    }

    public void setRepurchase(boolean repurchase) {
        this.repurchase = repurchase;
    }

    public boolean isUsedUP() {
        return usedUP;
    }

    public void setUsedUP(boolean usedUP) {
        this.usedUP = usedUP;
    }

}

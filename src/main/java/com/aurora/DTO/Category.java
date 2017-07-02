package com.aurora.DTO;

/**
 * Created by aurorabanuelos on 7/1/17.
 */
public class Category {

    private String categoryType;
    private int catQuantity;
    private double catPrice;

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public int getCatQuantity() {
        return catQuantity;
    }

    public void setCatQuantity(int catQuantity) {
        this.catQuantity = catQuantity;
    }

    public double getCatPrice() {
        return catPrice;
    }

    public void setCatPrice(double catPrice) {
        this.catPrice = catPrice;
    }

}

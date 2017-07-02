package com.aurora.DTO;

import java.util.Collection;

/**
 * Created by aurorabanuelos on 7/1/17.
 */
public class Report {

  private int totalProducts;
  private double totalPrice;
  private Collection<Category> categories;

    public int getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Collection<Category> getCategories() {
        return categories;
    }

    public void setCategories(Collection<Category> categories) {
        this.categories = categories;
    }
}

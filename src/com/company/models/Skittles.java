package com.company.models;

public class Skittles extends Product {

    @Override
    public String toString() {
        return "The product is skittles, the count is - " + getProductCount();
    }
}

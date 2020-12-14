package com.company.models;

public class Twix extends Product {

    @Override
    public String toString() {
        return "The product is twix, the count is - " + getProductCount();
    }
}

package com.company.models;

public class Mars extends Product {

    @Override
    public String toString() {
        return "The product is mars, the count is - " + getProductCount();
    }
}

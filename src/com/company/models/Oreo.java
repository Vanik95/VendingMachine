package com.company.models;

public class Oreo extends Product {

    @Override
    public String toString() {
        return "The product is oreo, the count is - " + getProductCount();
    }
}

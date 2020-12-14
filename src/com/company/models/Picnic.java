package com.company.models;

public class Picnic extends Product {

    @Override
    public String toString() {
        return "The product is picnic, the count is - " + getProductCount();
    }
}

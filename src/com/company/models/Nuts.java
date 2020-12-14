package com.company.models;

public class Nuts extends Product {

    @Override
    public String toString() {
        return "The product is nuts, the count is - " + getProductCount();
    }
}

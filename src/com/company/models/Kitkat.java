package com.company.models;

public class Kitkat extends Product {

    @Override
    public String toString() {
        return "The product is kitkat, the count is - " + getProductCount();
    }
}

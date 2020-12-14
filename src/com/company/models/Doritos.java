package com.company.models;

public class Doritos extends Product {

    @Override
    public String toString() {
        return "The product is doritos, the count is - " + getProductCount();
    }
}

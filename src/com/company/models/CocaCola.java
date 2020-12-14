package com.company.models;

public class CocaCola extends Product {

    @Override
    public String toString() {
        return "The product is coca cola, the count is - " + getProductCount();
    }
}

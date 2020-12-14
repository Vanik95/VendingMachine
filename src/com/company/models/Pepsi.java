package com.company.models;

public class Pepsi extends Product {

    @Override
    public String toString() {
        return "The product is pepsi, the count is - " + getProductCount();
    }
}

package com.company.models;

public class Snickers extends Product {

    @Override
    public String toString() {
        return "The product is snickers, the count is - " + getProductCount();
    }
}
package com.company.models;

public class Bounty extends Product {

    @Override
    public String toString() {
        return "The product is bounty, the count is - " + getProductCount();
    }
}

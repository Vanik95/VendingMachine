package com.company.models;

public abstract class Product {

    private int productCount;
    private String horizonalCoordinate;
    private String verticalCoordinate;

    public Product() {
    }

    public Product(int productCount, String horizonalCoordinate, String verticalCoordinate) {
        this.productCount = productCount;
        this.horizonalCoordinate = horizonalCoordinate;
        this.verticalCoordinate = verticalCoordinate;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getHorizonalCoordinate() {
        return horizonalCoordinate;
    }

    public void setHorizonalCoordinate(String horizonalCoordinate) {
        this.horizonalCoordinate = horizonalCoordinate;
    }

    public String getVerticalCoordinate() {
        return verticalCoordinate;
    }

    public void setVerticalCoordinate(String verticalCoordinate) {
        this.verticalCoordinate = verticalCoordinate;
    }
}

package com.company;

import com.company.models.ProductType;

public class Command {

    private ProductType productType;
    private int productCount;

    public Command(String input) {
        String[] split = input.split(":");
        if (split[0].equals("A") && split[1].equals("1")) {
            this.productType = ProductType.BOUNTY;
        } else if (split[0].equals("A") && split[1].equals("2")) {
            this.productType = ProductType.BYUREGH;
        } else if (split[0].equals("A") && split[1].equals("3")) {
            this.productType = ProductType.COCACOLA;
        } else if (split[0].equals("A") && split[1].equals("4")) {
            this.productType = ProductType.DORITOS;
        } else if (split[0].equals("A") && split[1].equals("5")) {
            this.productType = ProductType.FANTA;
        } else if (split[0].equals("B") && split[1].equals("1")) {
            this.productType = ProductType.FUZETEA;
        } else if (split[0].equals("B") && split[1].equals("2")) {
            this.productType = ProductType.JERMUK;
        } else if (split[0].equals("B") && split[1].equals("3")) {
            this.productType = ProductType.KITKAT;
        } else if (split[0].equals("B") && split[1].equals("4")) {
            this.productType = ProductType.LAYS;
        } else if (split[0].equals("B") && split[1].equals("5")) {
            this.productType = ProductType.LIPTON;
        } else if (split[0].equals("C") && split[1].equals("1")) {
            this.productType = ProductType.MARS;
        } else if (split[0].equals("C") && split[1].equals("2")) {
            this.productType = ProductType.MIRINDA;
        } else if (split[0].equals("C") && split[1].equals("3")) {
            this.productType = ProductType.NESQUICK;
        } else if (split[0].equals("C") && split[1].equals("4")) {
            this.productType = ProductType.NESTLE;
        } else if (split[0].equals("C") && split[1].equals("5")) {
            this.productType = ProductType.NUTS;
        } else if (split[0].equals("D") && split[1].equals("1")) {
            this.productType = ProductType.OREO;
        } else if (split[0].equals("D") && split[1].equals("2")) {
            this.productType = ProductType.PEPSI;
        } else if (split[0].equals("D") && split[1].equals("3")) {
            this.productType = ProductType.PICNIC;
        } else if (split[0].equals("D") && split[1].equals("4")) {
            this.productType = ProductType.SCHWEPPES;
        } else if (split[0].equals("D") && split[1].equals("5")) {
            this.productType = ProductType.SEVENUP;
        } else if (split[0].equals("E") && split[1].equals("1")) {
            this.productType = ProductType.SKITTLES;
        } else if (split[0].equals("E") && split[1].equals("2")) {
            this.productType = ProductType.SNICKERS;
        } else if (split[0].equals("E") && split[1].equals("3")) {
            this.productType = ProductType.SPRITE;
        } else if (split[0].equals("E") && split[1].equals("4")) {
            this.productType = ProductType.TOBLERONE;
        } else if (split[0].equals("E") && split[1].equals("5")) {
            this.productType = ProductType.TWIX;
        }
        this.productCount = Integer.parseInt(split[2]);
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
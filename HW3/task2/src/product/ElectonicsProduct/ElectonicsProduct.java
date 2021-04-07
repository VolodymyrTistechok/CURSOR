package product.ElectonicsProduct;

import product.Product;
import product.AgeRestriction;

public class ElectonicsProduct extends Product {
    private int guaranteePeriod;

    public ElectonicsProduct(String name, double price, int quantity, AgeRestriction restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "guaranteePeriod=" + guaranteePeriod +
                " ";
    }
}

package product.ElectonicsProduct;

import product.Product;
import product.ageRestriction;

public class ElectonicsProduct extends Product {
    private int guaranteePeriod;

    public ElectonicsProduct(String name, double price, int quantity, ageRestriction restriction, int guaranteePeriod) {
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

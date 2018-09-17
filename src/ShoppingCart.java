/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.HashMap;

/**
 *
 * @author Administrator
 */
public class ShoppingCart {
    double totalCost;
    HashMap<Product,Integer> items = new HashMap<Product, Integer>();

    public ShoppingCart(double totalCost,  HashMap<Product,Integer> items) {
        this.totalCost = totalCost;
        this.items = items;
    }

    public ShoppingCart() {
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public HashMap<Product, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Product, Integer> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "totalCost=" + totalCost + ", items=" + items + '}';
    }
    
}

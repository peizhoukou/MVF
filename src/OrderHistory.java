/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class OrderHistory {
    ArrayList<Order> orders = new ArrayList<Order>(); 

    public OrderHistory(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public OrderHistory() {
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderHistory{" + "orders=" + orders + '}';
    }
    
}

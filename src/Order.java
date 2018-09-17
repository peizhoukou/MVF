/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Order {
    private int orderId;
    private ShoppingCart orderItems;
    private String shippingAddress;
    private Date orderdate;
    private String orderStatus;

    public Order(int orderId, ShoppingCart orderItems, String shippingAddress, Date orderdate, String orderStatus) {
        this.orderId = orderId;
        this.orderItems = orderItems;
        this.shippingAddress = shippingAddress;
        this.orderdate = orderdate;
        this.orderStatus = orderStatus;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ShoppingCart getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ShoppingCart orderItems) {
        this.orderItems = orderItems;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderItems=" + orderItems + ", shippingAddress=" + shippingAddress + ", orderdate=" + orderdate + ", orderStatus=" + orderStatus + '}';
    }
    //insatanceof  
}

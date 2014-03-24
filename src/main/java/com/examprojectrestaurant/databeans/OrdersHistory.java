/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examprojectrestaurant.databeans;

import com.examprojectrestaurant.entitys.order.Order;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author artem
 */
@Named
@ApplicationScoped
public class OrdersHistory implements Serializable {

    private List<Order> orderList;

    public OrdersHistory() {
        orderList = new ArrayList<>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getTotalFrenchFriesQuantity() {
        int sum = 0;
        for (Order order : orderList) {
            sum += order.getFrenchFriesQuantity();
        }
        return sum;
    }

    public int getTotalChickenFriedQuantity() {
        int sum = 0;
        for (Order order : orderList) {
            sum += order.getChickenFriedQuantity();
        }
        return sum;
    }

    public int getTotalSaladQuantity() {
        int sum = 0;
        for (Order order : orderList) {
            sum += order.getSaladQuantity();
        }
        return sum;
    }

    public float getTotalPriceForAllOrders() {
        float sum = 0.0f;
        for (Order order : orderList) {
            sum += order.getTotalPrice();
        }
        return sum;
    }
}

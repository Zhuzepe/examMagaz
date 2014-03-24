/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examprojectrestaurant.entitys.order;

import com.examprojectrestaurant.entitys.order.clients.Client;
import com.examprojectrestaurant.entitys.order.menuitems.AbstractMenuItem;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author artem
 */
public class Order {

    private List<AbstractMenuItem> menuItems;
    private Client client;

    public List<AbstractMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<AbstractMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getFrenchFriesQuantity() {
        int calc = 0;
        for (AbstractMenuItem menuItem : menuItems) {
            if ("French fries".equals(menuItem.getName())) {
                calc = menuItem.getQuantity();
            }
        }
        return calc;
    }

    public int getChickenFriedQuantity() {
        int calc = 0;
        for (AbstractMenuItem menuItem : menuItems) {
            if ("Chicken fried".equals(menuItem.getName())) {
                calc = menuItem.getQuantity();
            }
        }
        return calc;
    }

    public int getSaladQuantity() {
        int calc = 0;
        for (AbstractMenuItem menuItem : menuItems) {
            if ("Salad".equals(menuItem.getName())) {
                calc = menuItem.getQuantity();
            }
        }
        return calc;
    }

    public float getTotalPrice() {
        float sum = 0.0f;
        for (AbstractMenuItem menuItem : menuItems) {
            sum += menuItem.getPrice() * menuItem.getQuantity();
        }
        return sum;
    }

}

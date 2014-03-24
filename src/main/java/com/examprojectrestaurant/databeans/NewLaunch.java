/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examprojectrestaurant.databeans;

import com.examprojectrestaurant.entitys.order.clients.Client;
import com.examprojectrestaurant.entitys.order.menuitems.AbstractMenuItem;
import com.examprojectrestaurant.entitys.order.menuitems.MenuItemSelected;
import com.examprojectrestaurant.entitys.order.Order;
import com.examprojectrestaurant.entitys.order.menuitems.ChickenFried;
import com.examprojectrestaurant.entitys.order.menuitems.FrenchFries;
import com.examprojectrestaurant.entitys.order.menuitems.Salad;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author artem
 */
@Named(value = "newLunch")
@RequestScoped
public class NewLaunch {

    @Inject
    private OrdersHistory ordersHistory;
    private List<AbstractMenuItem> menuItems;
    private MenuItemSelected menuiItemSelected;
    private List<AbstractMenuItem> selectedMenuitems;
    private Client client;

    /**
     * Creates a new instance of LaunchData
     */
    public NewLaunch() {
        generateAllMenuItems();
        menuiItemSelected = new MenuItemSelected(menuItems);
        client = new Client();
    }

    public void setMenuItems(List<AbstractMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<AbstractMenuItem> getMenuItems() {
        return menuItems;
    }

    public MenuItemSelected getMenuiItemSelected() {
        return menuiItemSelected;
    }

    public void setMenuiItemSelected(MenuItemSelected menuiItemSelected) {
        this.menuiItemSelected = menuiItemSelected;
    }

    public List<AbstractMenuItem> getSelectedMenuitems() {
        return selectedMenuitems;
    }

    public void setSelectedMenuitems(List<AbstractMenuItem> selectedMenuitems) {
        this.selectedMenuitems = selectedMenuitems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String placeOrder() {
        Order order = new Order();
        order.setMenuItems(selectedMenuitems);
        order.setClient(client);
        ordersHistory.getOrderList().add(order);
        return "checkout?faces-redirect=true";
    }

    private List<AbstractMenuItem> generateAllMenuItems() {
        menuItems = new ArrayList<>();
        menuItems.add(new ChickenFried());
        menuItems.add(new FrenchFries());
        menuItems.add(new Salad());
        return menuItems;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examprojectrestaurant.entitys.order.menuitems;

/**
 *
 * @author artem
 */
public class ChickenFried extends AbstractMenuItem {

    public ChickenFried() {
        name = "Chicken fried";
        picture = "resources/images/fried-chicken.jpg";
        description = "A country classic featuring fresh, "
                + "never frozen, plump and juicy chicken <br/> breaded in our own blend of herbs "
                + "and spices and fried golden brown. ";
        price = 12.2;
    }

}

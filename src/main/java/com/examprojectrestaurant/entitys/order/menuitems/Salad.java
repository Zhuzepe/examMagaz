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
public class Salad extends AbstractMenuItem {

    public Salad() {
        name = "Salad";
        picture = "resources/images/salad.jpg";
        description = "Our Garden Side Salad is a blend of seven premium lettuces garnished with juicy tomatoes, <br/>"
                + " home-style croutons, and three-cheese medley";
        price = 9.3;
    }

}

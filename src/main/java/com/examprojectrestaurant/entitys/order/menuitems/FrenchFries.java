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
public class FrenchFries extends AbstractMenuItem {

    public FrenchFries() {
        name = "French fries";
        picture = "resources/images/french-fries.jpg";
        description = "More delicious than ever, our signature piping hot, thick cut Salted "
                + "French Fries <br/> are golden on the outside and fluffy on the inside. ";
        price = 8.0;
    }

}

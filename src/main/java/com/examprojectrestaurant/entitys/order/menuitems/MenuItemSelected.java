/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examprojectrestaurant.entitys.order.menuitems;

import java.util.ArrayList;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author artem
 */
public class MenuItemSelected extends ListDataModel<AbstractMenuItem> implements SelectableDataModel<AbstractMenuItem> {

    public MenuItemSelected() {
    }

    public MenuItemSelected(List<AbstractMenuItem> list) {
        super(list);
    }

    @Override
    public Object getRowKey(AbstractMenuItem object) {
        System.out.println(" rokey created = " +object.getName());
        return object.getName();
    }

    @Override
    public AbstractMenuItem getRowData(String rowKey) {
        List<AbstractMenuItem> list = (List<AbstractMenuItem>) getWrappedData();
        for (AbstractMenuItem menuItem : list) {
            if (rowKey.equals(menuItem.getName())) {
                System.out.println("Rowkey = " + rowKey + " ; menuite name = " + menuItem.getName());
                return menuItem;
            }
        }
        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examprojectrestaurant.validators;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import org.primefaces.component.inputtext.InputText;

/**
 *
 * @author artem
 */
@Named("quantityValidator")
@SessionScoped
public class MenuItemQuantityValidator implements Serializable, Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        int quantity = (int) value;
        InputText inputText = (InputText) component;
        if (quantity <= 0) {
            inputText.resetValue();
            throw new ValidatorException(new FacesMessage("Wrong number format<br/>Exam: 14 or 31"));
        }
    }

}

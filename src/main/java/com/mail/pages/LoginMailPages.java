package com.mail.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("https://www.google.com/gmail/")
public class LoginMailPages extends PageObject{

    @FindBy(xpath="//*[@id=\"identifierId\"]")
    WebElementFacade InputCorreo;

    @FindBy(xpath="//*[@id=\"identifierNext\"]")
    WebElementFacade btnCorreo;

    @FindBy(xpath="//input[@name='password']")
    WebElementFacade InputContrasena;

    @FindBy(xpath="//div[@id='passwordNext']")
    WebElementFacade btnLogin;

    public void ingresarCorreoLogin(String correo){
        InputCorreo.type(correo);
    }

    public void siguienteDigitarContrasena(){
        btnCorreo.click();
    }

    public void ingresarContrasenaLogin(String pass){
        InputContrasena.type(pass);
    }

    public void realizarLogin(){
        btnLogin.click();
    }

}

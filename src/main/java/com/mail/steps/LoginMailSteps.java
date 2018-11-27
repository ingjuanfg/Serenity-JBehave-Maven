package com.mail.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import com.mail.pages.LoginMailPages;

public class LoginMailSteps {

    @Page
    private LoginMailPages loginMailPages;

    @Step
    public void abrir_navegador(){
        loginMailPages.open();
    }

    @Step
    public void realizar_login(String correo, String pass){
        loginMailPages.ingresarCorreoLogin(correo);
        loginMailPages.siguienteDigitarContrasena();
        loginMailPages.ingresarContrasenaLogin(pass);
        loginMailPages.realizarLogin();
    }

}

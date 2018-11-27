package com.mail.definitions;

import com.mail.steps.MailViewsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.mail.steps.LoginMailSteps;

public class SendMailSuccessDefinitions {

    @Steps
    LoginMailSteps loginMailSteps;

    @Steps
    MailViewsSteps mailViewsSteps;

    @Given("que me encuentro en la ventana de gmail")
    public void queMeEncuentroEnLaVentanaDeGmail(){
        loginMailSteps.abrir_navegador();
        loginMailSteps.realizar_login("COLOCARCORREO@gmail.com", "COLOCAR CONTRASEÑA");
    }

    @When("digite el destinatario asunto y cuerpo de mensaje")
    public void digiteElDestinatarioAsuntoCuerpoDeMensaje(){
        mailViewsSteps.crear_nuevo_mensaje();
        mailViewsSteps.redactar_correo("COLOCARCORREO@gmail.com", "Test mail", "FYI");
        mailViewsSteps.enviarCorreoRedactado();
    }

    @Then("el sistema debera mostrarme un mensaje confirmando el envio")
    public  void elSistemaDeberaMostrarmeUnMensajeConfirmandoElEnvio(){
        mailViewsSteps.validar_correo_exitoso();
    }

}

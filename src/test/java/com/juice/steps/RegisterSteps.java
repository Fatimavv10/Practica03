
package com.juice.steps;

import static org.testng.Assert.assertTrue;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.juice.factory.RegisterPage;
import com.juice.util.Base;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class RegisterSteps extends Base {

    RegisterPage account = new RegisterPage(returnDriver());
    Faker fake = new Faker(new Locale("en-US"));

    @Dado("que el usuario está en la página de registro")
    public void que_el_usuario_está_en_la_página_de_registro() {
                account.goToRegisterPage();
    }

    @Cuando("el usuario completa la información válida")
    public void el_usuario_completa_la_información_válida() {
        String pass = fake.internet().password();
        String email = fake.internet().emailAddress();
        account.fillOutRegisterForm(fake.name().firstName(), fake.name().lastName(), email, pass, pass);
        System.out.println("Account has been created with Email:" + email + " and Password: " + pass);
    }

    @Cuando("el usuario hace clic en el boton de registrar")
    public void el_usuario_hace_clic_en_el_boton_de_registrar() {
        account.sendDataForNewAccount();
    }

    @Entonces("el sistema debe mostrarle mensaje de registro exitoso")
    public void el_sistema_debe_mostrarle_mensaje_de_registro_exitoso() {
        assertTrue(account.getMessage().contains("Your registration completed"));
    }

}

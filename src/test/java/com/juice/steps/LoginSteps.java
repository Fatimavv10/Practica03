package com.juice.steps;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.juice.factory.LoginPage;
import com.juice.util.Base;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginSteps extends Base {

    LoginPage loginPage = new LoginPage(returnDriver());

    @Dado("que el usuario esta en la pagina de login")
    public void que_el_usuario_esta_en_la_pagina_de_login() {

        loginPage.navigateToLoginPage();
    }

    @Cuando("el usuario ingresa sus credenciales")
    public void el_usuario_ingresa_sus_credenciales() {
        loginPage.setEmail("lruiz@gmail.com");
        loginPage.setPassword("password");
    }

    @Cuando("hace click en el botón de Log in")
    public void hace_click_en_el_botón_de_log_in() {
        loginPage.doLogin();
    }

    @Entonces("el sistema deberia mostrarle el menu de log out")
    public void el_sistema_deberia_mostrarle_el_menu_de_log_out() {
        loginPage.isDashboardPageDisplayed();
    }

    @Dado("que el usuario ha iniciado sesión en su cuenta")
    public void que_el_usuario_ha_iniciado_sesión_en_su_cuenta() {
    }

    @Cuando("el usuario accede a la sección de direcciones de envío")
    public void el_usuario_accede_a_la_sección_de_direcciones_de_envío() {

    }

    @Cuando("agrega una nueva dirección de envío con detalles válidos")
    public void agrega_una_nueva_dirección_de_envío_con_detalles_válidos() {

    }

    @Cuando("guarda la nueva dirección")
    public void guarda_la_nueva_dirección() {

    }

    @Entonces("el sistema debe mostrar un mensaje de confirmación y la dirección de envío debe estar asociada a la cuenta del usuario")
    public void el_sistema_debe_mostrar_un_mensaje_de_confirmación_y_la_dirección_de_envío_debe_estar_asociada_a_la_cuenta_del_usuario() {

    }

    @Cuando("el usuario intenta cambiar su clave sin proporcionar la clave actual")
    public void el_usuario_intenta_cambiar_su_clave_sin_proporcionar_la_clave_actual() {

    }

    @Cuando("el usuario accede a la página de configuración de la cuenta")
    public void el_usuario_accede_a_la_página_de_configuración_de_la_cuenta() {

    }

    @Cuando("el usuario accede a la sección de información de pago")
    public void el_usuario_accede_a_la_sección_de_información_de_pago() {

    }

    @Cuando("cambia su clave actual por una nueva clave segura")
    public void cambia_su_clave_actual_por_una_nueva_clave_segura() {

    }

    @Cuando("agrega una nueva tarjeta de crédito con detalles válidos")
    public void agrega_una_nueva_tarjeta_de_crédito_con_detalles_válidos() {

    }

    @Cuando("actualiza su información personal con nuevos datos")
    public void actualiza_su_información_personal_con_nuevos_datos() {

    }

    @Entonces("el sistema debe mostrar un mensaje de error indicando que la clave actual es requerida para realizar el cambio")
    public void el_sistema_debe_mostrar_un_mensaje_de_error_indicando_que_la_clave_actual_es_requerida_para_realizar_el_cambio() {

    }

    @Cuando("guarda los cambios")
    public void guarda_los_cambios() {

    }

    @Cuando("guarda la nueva tarjeta")
    public void guarda_la_nueva_tarjeta() {

    }

    @Entonces("el sistema debe mostrar un mensaje de confirmación y los datos del usuario deben actualizarse correctamente")
    public void el_sistema_debe_mostrar_un_mensaje_de_confirmación_y_los_datos_del_usuario_deben_actualizarse_correctamente() {

    }

    @Entonces("el sistema debe mostrar un mensaje de confirmación y la clave del usuario debe actualizarse correctamente")
    public void el_sistema_debe_mostrar_un_mensaje_de_confirmación_y_la_clave_del_usuario_debe_actualizarse_correctamente() {

    }

    @Entonces("el sistema debe mostrar un mensaje de confirmación y la tarjeta de crédito debe estar asociada a la cuenta del usuario")
    public void el_sistema_debe_mostrar_un_mensaje_de_confirmación_y_la_tarjeta_de_crédito_debe_estar_asociada_a_la_cuenta_del_usuario() {

    }
}

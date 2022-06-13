package com.qazando.espresso.pageObjects.Login.robot


import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers

import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.qazando.espresso.R
import com.qazando.espresso.pageObjects.Login.constants.ConstantsLogin.BTN_VOLTAR
import com.qazando.espresso.pageObjects.Login.constants.ConstantsLogin.EMAIL_SUCESSO
import com.qazando.espresso.pageObjects.Login.constants.ConstantsLogin.SENHA_SUCESSO
import com.qazando.espresso.pageObjects.Login.constants.ConstantsLogin.TEXTO_LOGADO
import com.qazando.espresso.pageObjects.Login.constants.ConstantsLogin.TITULO_APLICATIVO

class RobotLogin {

    fun validarTituloNaTela() {
        onView(withText(TITULO_APLICATIVO)).check(matches(isDisplayed()))
    }

    fun escreverEmail(){
        onView(ViewMatchers.withId(CAMPO_EMAIL)).perform(typeText(EMAIL_SUCESSO))
    }

    fun escreverSenha(){
        onView(ViewMatchers.withId(CAMPO_SENHA)).perform(typeText(SENHA_SUCESSO))
    }

    fun closeKeyboard(){
        closeSoftKeyboard()
    }

    fun clicarBotaoLogin(){
        onView(ViewMatchers.withId(BOTAO_LOGIN)).perform(ViewActions.click())
    }

    fun validarTituloLogado(){
        onView(withText(TEXTO_LOGADO)).check(matches(isDisplayed()))
    }

    fun clicarBtnVoltar(){
        onView(withText(BTN_VOLTAR)).perform(ViewActions.click())

    }


    companion object {
        private val CAMPO_EMAIL = R.id.field_email
        private val CAMPO_SENHA = R.id.field_senha
        private val BOTAO_LOGIN = R.id.buttonFirst
    }
}
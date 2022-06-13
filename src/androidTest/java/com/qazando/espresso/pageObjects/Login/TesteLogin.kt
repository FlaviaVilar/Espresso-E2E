package com.qazando.espresso.pageObjects.Login

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import androidx.test.rule.ActivityTestRule
import com.qazando.espresso.MainActivity
import com.qazando.espresso.R
import com.qazando.espresso.pageObjects.Login.robot.RobotLogin
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TesteLogin {

    private val robot = RobotLogin()
    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Test
    fun loginTestModelPage() {
        robot.validarTituloNaTela()
        robot.escreverEmail()
        robot.closeKeyboard()
        robot.escreverSenha()
        robot.closeKeyboard()
        robot.clicarBotaoLogin()
        robot.validarTituloLogado()
        robot.clicarBtnVoltar()
        robot.validarTituloNaTela()
    }
}
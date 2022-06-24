package com.example.myapplication10.pageObjects.Login.robot


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.myapplication10.R
import com.example.myapplication10.pageObjects.Login.constants.ConstantsLogin.EMAIL_SUCESS
import com.example.myapplication10.pageObjects.Login.constants.ConstantsLogin.PASSWORD_SUCESS
import com.example.myapplication10.pageObjects.Login.constants.ConstantsLogin.TEXT_LOGIN_SUCESS
import com.example.myapplication10.pageObjects.Login.constants.ConstantsLogin.TITLE_APP


class RobotLogin {
    fun validateTitleScreen() {
        onView(withText(TITLE_APP))
            .check(matches(isDisplayed()))
    }

    fun insertEmail() {
        onView(withId(R.id.field_email))
            .perform(typeText(EMAIL_SUCESS))
    }

    fun closeKeyboard() {
        closeSoftKeyboard()
    }

    fun insertPassword() {
        onView(withId(R.id.field_Password)).perform(typeText(PASSWORD_SUCESS))
    }

    fun clickBtnLogin() {

        onView(withId(R.id.button_first)).perform(click())

    }

    fun validateTitleSecondScreen() {
        onView(withText(TEXT_LOGIN_SUCESS)).check(matches(isDisplayed()))
    }

    fun clickButtonBack() {

        onView(withId(R.id.button_second)).perform(click())
    }

    companion object {
        private val BUTTON_FIST_PAGE = R.id.button_first
        private val BUTTON_SECOND_PAGE = R.id.button_second
    }
}

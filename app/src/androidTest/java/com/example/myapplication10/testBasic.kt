package com.example.myapplication10


import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class testBasic {
    @get:Rule
    var mActivitRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
    @Test

    fun testLogin() {
        onView(withText("App test")).check(matches(isDisplayed()))
        onView(withId(R.id.field_email)).perform(typeText("george.tada@hotmail.com"))
        closeSoftKeyboard()
        onView(withId(R.id.field_Password)).perform(typeText("12345hwjke"))
        closeSoftKeyboard()
        onView(withId(R.id.button_first)).perform(click())
        onView(withText("login sucess")).check(matches(isDisplayed()))
        onView(withId(R.id.button_second)).perform(click())
        
    }
}
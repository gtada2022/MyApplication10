package com.example.myapplication10.pageObjects.Login


import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.myapplication10.MainActivity
import com.example.myapplication10.pageObjects.Login.robot.RobotLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


private val robot = RobotLogin()

@RunWith(AndroidJUnit4::class)
class TestLogin {
    @get:Rule
    var mActivitRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testLoginModelPage() {
        robot.validateTitleScreen()
        robot.insertEmail()
        robot.closeKeyboard()
        robot.insertPassword()
        robot.closeKeyboard()
        robot.clickBtnLogin()
        robot.validateTitleSecondScreen()
        robot.clickButtonBack()
        robot.validateTitleScreen()


    }


}

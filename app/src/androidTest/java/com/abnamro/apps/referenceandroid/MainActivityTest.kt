package com.abnamro.apps.referenceandroid

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun clickbalButton_verifyshowsBalance() {
        onView(withId(R.id.balButton)).check(matches(withText("Balance"))).check(matches(isDisplayed()))
        onView(withId(R.id.balButton)).perform(click())
        onView(withId(R.id.resultsTextView))
            .check(matches(withText(containsString("€"))))
    }

//    @Test
//    @Throws(Exception::class)
//    fun expandMenu_verifyitems() {
//        onView(withContentDescription("More options")).perform(click())
//
//        onView(withId(R.id.title)).check(matches(withText("Share"))).check(matches(isDisplayed())).perform(
//            click())
//        onView(withId(R.id.title)).check(matches(withText("Exit"))).check(matches(isDisplayed())).perform(
//            click())
//        onView(withId(R.id.title)).check(matches(withText("Settings"))).check(matches(isDisplayed())).perform(
//            click())
//    }


    @Test
    @Throws(Exception::class)
    fun mail_Read() {
        onView(withId(R.id.fab)).check(matches(isDisplayed())).perform(click())
        onView(withId(R.id.snackbar_text)).check(matches(withText("You have 0 unread messages")))
    }

    @Test
    @Throws(Exception::class)
    fun readtext_textField() {
        onView(withId(R.id.infoText)).check(matches(withText("Click below button to check your account balace")))

    }
}
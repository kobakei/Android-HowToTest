package io.github.kobakei.androidhowtotest.activity;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.github.kobakei.androidhowtotest.R;
import io.github.kobakei.androidhowtotest.activity.AdditionActivity;

/**
 * UI test with JUnit4 & Espresso.
 * Created by keisuke on 16/03/02.
 */
@RunWith(AndroidJUnit4.class)
@MediumTest
public class AdditionActivityTest {

    @Rule
    public ActivityTestRule<AdditionActivity> activityTestRule = new ActivityTestRule<>(AdditionActivity.class);

    @Test
    public void onAddClicked_isCorrect() {
        onView(ViewMatchers.withId(R.id.editText1)).perform(typeText("123"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText("456"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("579")));
    }

}

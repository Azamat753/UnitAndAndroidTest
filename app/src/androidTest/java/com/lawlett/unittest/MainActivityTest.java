package com.lawlett.unittest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void textViewIsDisplayed(){
    onView(withId(R.id.add_btn)).perform(click());
    onView(withId(R.id.number_tv)).check(matches(isDisplayed()));
    }

    @Test
    public void plusCase (){
        onView(withId(R.id.first_field)).perform(typeText("3"));
        onView(withId(R.id.second_field)).perform(typeText("5"));
        onView(withId(R.id.add_btn)).perform(click());
        onView(withId(R.id.number_tv)).check(matches(withText("8")));
    }
}

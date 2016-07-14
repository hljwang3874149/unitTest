package test.art.com.testproject;

import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * ==================================================
 * 项目名称：TestProject
 * 创建人：wangxiaolong
 * 创建时间：16/7/14 下午4:24
 * 备注：
 * Version：
 * ==================================================
 */
@RunWith(JUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule mActivityTestRule = new ActivityTestRule(MainActivity.class);
    @Test
    public  void onClick(){
        onView(withId(R.id.editText)).perform(typeText("World"), closeSoftKeyboard());
        onView(withText("Say hello!")).perform(click());
        onView(withId(R.id.fab)).perform(click());
        String expectedText = "Hello, " + "world" + "!";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));
    }


}

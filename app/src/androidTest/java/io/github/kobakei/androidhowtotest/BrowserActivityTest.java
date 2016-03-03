package io.github.kobakei.androidhowtotest;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SdkSuppress;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.Button;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Test with UI Automator 2.
 * This test case go to others application (Google Chrome) from my application.
 * Created by keisuke on 16/03/03.
 */
@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
@LargeTest
public class BrowserActivityTest {

    @Rule
    public ActivityTestRule<BrowserActivity> activityTestRule = new ActivityTestRule<>(BrowserActivity.class);

    private UiDevice uiDevice;

    @Before
    public void setUp() {
        uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void onButtonClick_LaunchBrowser() {
        UiObject2 goButton = uiDevice.findObject(By.text("Open browser").clazz(Button.class));
        boolean result = goButton.clickAndWait(Until.newWindow(), 2000L);
        assertTrue(result);

        // Check if current app is chrome
        UiObject2 currentApp = uiDevice.findObject(By.pkg("com.android.chrome"));
        assertTrue(currentApp != null);
    }
}

package io.github.kobakei.androidhowtotest.util;

import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import io.github.kobakei.androidhowtotest.BuildConfig;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for a class depending on Android framework with Robolectric.
 * Created by keisuke on 16/03/03.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.JELLY_BEAN)
public class PackageNameManagerTest {
    @Test
    public void getPackageName_IsCorrect() {
        assertEquals("io.github.kobakei.androidhowtotest", PackageNameManager.getPackageName(RuntimeEnvironment.application));
    }
}

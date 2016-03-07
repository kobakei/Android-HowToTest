package io.github.kobakei.androidhowtotest.util;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test running on device or emulator.
 * Created by keisuke on 16/03/03.
 */
@RunWith(AndroidJUnit4.class)
public class PackageNameManagerTest {

    private Context context;

    @Before
    public void setUp() {
        context = InstrumentationRegistry.getContext();
    }

    @Test
    public void getPackageName_IsCorrect() {
        assertEquals("io.github.kobakei.androidhowtotest.test", PackageNameManager.getPackageName(context));
    }
}

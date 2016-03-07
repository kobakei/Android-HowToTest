package io.github.kobakei.androidhowtotest.usecase;

import android.os.Build;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.threeten.bp.Clock;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;

import io.github.kobakei.androidhowtotest.BuildConfig;

/**
 * Unit test of TimeUseCase
 * This test depends on current time therefore it injects mocked clock.
 *
 * Created by keisuke on 16/03/08.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.JELLY_BEAN)
public class TimeUseCaseTest {

    private TimeUseCase timeUseCase;

    @Before
    public void setUp() {
        Instant instant = Instant.ofEpochSecond(0); // 1970-01-01
        ZoneId zoneId = ZoneId.of("GMT");
        timeUseCase = new TimeUseCase(Clock.fixed(instant, zoneId));
    }

    @Test
    public void isToday_ReturnTrue() {
        Assert.assertTrue(timeUseCase.isToday(0));
    }

    @Test
    public void isToday_ReturnFalse() {
        Assert.assertFalse(timeUseCase.isToday(1457371414));
    }
}

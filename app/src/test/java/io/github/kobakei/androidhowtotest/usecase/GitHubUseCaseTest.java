package io.github.kobakei.androidhowtotest.usecase;

import android.os.Build;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.util.concurrent.CountDownLatch;

import io.github.kobakei.androidhowtotest.BuildConfig;
import io.github.kobakei.androidhowtotest.di.DaggerMyComponent;
import io.github.kobakei.androidhowtotest.di.MockApiModule;
import io.github.kobakei.androidhowtotest.di.MyComponent;
import io.github.kobakei.androidhowtotest.usecase.GitHubUseCase;

/**
 * Unit test of GitHubUseCase.
 * GitHubUseCase depends on API client therefore this test inject mock API client with Dagger2.
 * MyComponent depends on Android framework therefore this test runs with Robolectric.
 * Created by keisuke on 16/03/03.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.JELLY_BEAN)
public class GitHubUseCaseTest {

    private GitHubUseCase gitHubUseCase;

    @Before
    public void setUp() {
        // Create object graph for test.
        // Switch ApiModule to MockApiModule to be independent on real server.
        MyComponent component = DaggerMyComponent.builder()
                .apiModule(new MockApiModule())
                .build();
        this.gitHubUseCase = component.gitHubUseCase();
    }

    @Test
    public void getTotalForkCount_IsCorrect() throws Exception {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        gitHubUseCase.getTotalForkCount("kobakei", new GitHubUseCase.Callback() {
            @Override
            public void onTotalForkCountReturned(int count) {
                assertEquals(15, count);
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
    }

}

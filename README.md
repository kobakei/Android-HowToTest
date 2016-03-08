# Android-HowToTest

[![Build Status](https://circleci.com/gh/kobakei/Android-HowToTest.svg?style=shield)](https://circleci.com/gh/kobakei/Android-HowToTest/tree/master)

Android sample project to demonstrate how to test

## Unit test

- All unit tests run on JVM. 
  - Some tests which require Android framework run with Robolectric.

### Samples

- [Unit test](https://github.com/kobakei/Android-HowToTest/blob/master/app/src/test/java/io/github/kobakei/androidhowtotest/util/CalculatorTest.java)
- [Unit test with Robolectric](https://github.com/kobakei/Android-HowToTest/blob/master/app/src/test/java/io/github/kobakei/androidhowtotest/util/PackageNameManagerTest.java)
- [Server dependent unit test (w/ Retrofit)](https://github.com/kobakei/Android-HowToTest/blob/master/app/src/test/java/io/github/kobakei/androidhowtotest/usecase/GitHubUseCaseTest.java)
- [Time dependent unit test (w/ ThreeTenABP)](https://github.com/kobakei/Android-HowToTest/blob/master/app/src/test/java/io/github/kobakei/androidhowtotest/usecase/TimeUseCaseTest.java)

## Integration test

- Integration tests run on device or emulator.
  - Espresso and UI Automator are used.

### Samples

- [UI test with Espresso](https://github.com/kobakei/Android-HowToTest/blob/master/app/src/androidTest/java/io/github/kobakei/androidhowtotest/activity/CalculatorActivityTest.java)
- [UI test with UI Automator](https://github.com/kobakei/Android-HowToTest/blob/master/app/src/androidTest/java/io/github/kobakei/androidhowtotest/activity/LauncherActivityTest.java)
- TODO: Integration for Service
  - Note: IntentService cannot be tested well
- TODO: Integration for ContentProvider

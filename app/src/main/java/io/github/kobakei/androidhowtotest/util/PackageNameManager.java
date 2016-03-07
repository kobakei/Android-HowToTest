package io.github.kobakei.androidhowtotest.util;

import android.content.Context;

/**
 * Simple class to return application's package name.
 * This class depends on Android framework.
 * Created by keisuke on 16/03/03.
 */
public class PackageNameManager {

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }
}

package com.thefinestartist.pocket;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import com.thefinestartist.pocket.exception.NotOpenedYetException;

/**
 * Created by TheFinestArtist on 4/16/15.
 */
public class Pocket {

    private static final String PREF_NAME = "Pocket";
    private static SharedPreferences pref;
    private static Context context;

    private static final String POCKET_NOT_OPENED_YET_MESSAGE = "Your pocket is closed. Please open your pocket before peek an item. Pocket.open(Context).";
    private static final String KEY_IS_NULL_MESSAGE = "You have sent null value for the key.";

    public static void open(@NonNull Context context) {
        open(context, PREF_NAME);
    }

    public static void open(@NonNull Context context, @NonNull String name) {
        Pocket.context = context;
        pref = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    private static void openedCheck() {
        if (context == null || pref == null)
            throw new NotOpenedYetException(POCKET_NOT_OPENED_YET_MESSAGE);
    }

    private static String getKey(@StringRes int resId) {
        String key = context.getResources().getString(resId);
        if (key == null)
            throw new NullPointerException(KEY_IS_NULL_MESSAGE);

        return key;
    }

    public static <T> T peek(@StringRes int resId) {
        openedCheck();
        String key = getKey(resId);
        return null;
    }

    public static <T> void keep(@StringRes int resId, T value) {
        openedCheck();
        String key = getKey(resId);
    }

    public static void discard(@StringRes int resId) {
        openedCheck();
        String key = getKey(resId);
    }
}

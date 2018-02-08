package cz.pef.mendelu.busitweek5.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefUtil {

    private SharedPrefUtil() {
    }

    public static void setTutorialStatus(Context context, boolean tutorialStatus) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(SharedPrefConstants.SP_TUTORIAL, tutorialStatus);
        editor.apply();
    }

    public static boolean getTutorialStatus(Context context) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return sharedPref.getBoolean(SharedPrefConstants.SP_TUTORIAL, true);
    }

    public static void setGameStatus(Context context, boolean gameStatus) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(SharedPrefConstants.SP_START_NEW_GAME, gameStatus);
        editor.apply();
    }

    public static boolean getGameStatus(Context context) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return sharedPref.getBoolean(SharedPrefConstants.SP_START_NEW_GAME, true);
    }

    public static void setAnsweredQuestions(Context context) {
        int questions = getAnsweredQuestions(context) + 1;
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(SharedPrefConstants.SP_QUESTIONS, questions);
        editor.apply();
    }

    public static int getAnsweredQuestions(Context context) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return sharedPref.getInt(SharedPrefConstants.SP_QUESTIONS, 0);
    }
}
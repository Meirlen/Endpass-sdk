package endpass.android.endpass_sdk.presentation.utils;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class LocalData {

    private SharedPreferences pref;
    private Editor editor;
    private static final String ACCESS_TOKEN = "access_token";
    private static final String OAUTH_TOKEN = "oauth_token";
    private static final String EMAIL = "email_user";
    private static final String PREF_NAME = "endpass";


    @SuppressLint("CommitPrefEdits")
    public LocalData(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }


    public void setAccessToken(String token) {
        editor.putString(ACCESS_TOKEN, token);
        editor.apply();
    }

    public void setEmail(String email) {
        editor.putString(EMAIL, email);
        editor.apply();
    }

    public String getAccessToken() {
        return pref.getString(ACCESS_TOKEN, "");
    }


    public void setOauthToken(String token) {
        editor.putString(OAUTH_TOKEN, token);
        editor.apply();
    }


    public String getOauthToken() {
        return pref.getString(OAUTH_TOKEN, "");
    }

    public String getEmail() {
        return pref.getString(EMAIL, "");
    }

}

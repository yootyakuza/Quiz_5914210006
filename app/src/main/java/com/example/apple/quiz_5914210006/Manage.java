package com.example.apple.quiz_5914210006;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by apple on 14/2/2018 AD.
 */

public class Manage {
    private final String Key_username = "code";

    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    public Manage(Context context){
        sharedPref = context.getSharedPreferences("YutShared",Context.MODE_PRIVATE);
        editor = sharedPref.edit();
    }

    public boolean checkLoginValidate(String code){
        String realCode = sharedPref.getString(Key_username,"");


        if((!TextUtils.isEmpty(code)) && code.equalsIgnoreCase(realCode)){
            return true;
        }
        return false;
    }

    public boolean registerUser(String code){

        if(TextUtils.isEmpty(code)){
            return false;
        }

        editor.putString(Key_username,code);
        return editor.commit();
    }
}

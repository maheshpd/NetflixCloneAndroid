package com.example.netflixclone.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.netflixclone.util.sharedpref.PrefKeys;
import com.example.netflixclone.util.sharedpref.PrefUtils;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BaseActivity extends AppCompatActivity {
        PrefUtils prefUtils;
        int id,subProfileId;
        String token;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefUtils = PrefUtils.getInstance(this);
        id = prefUtils.getIntValue(PrefKeys.USER_ID,-1);
        token = prefUtils.getStringValue(PrefKeys.SESSION_TOKEN,"");
        subProfileId = prefUtils.getIntValue(PrefKeys.ACTIVE_SUB_PROFILE,-1);
    }
}

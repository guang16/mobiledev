package com.example.glennguan.chatol;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.friend_l);
        } else{
            setContentView(R.layout.friend_p);
        }
        Log.i("MyProgram","onCreate called");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }
}

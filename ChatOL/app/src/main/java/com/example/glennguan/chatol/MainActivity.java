package com.example.glennguan.chatol;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String SOME_KEY = "ChatOL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.home_page_l);
        } else{
            setContentView(R.layout.home_page_p);
        }
        Log.i("MyProgram","onCreate called");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    @Override
    public void onStart(){
        //don't forget super.onStart here
        super.onStart();

        Button button= findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivityToChatRoom();
            }
        });
    }

    public void changeActivityToChatRoom(){
        String userName = ((EditText)findViewById(R.id.userName)).getText().toString();
        String passWord = ((EditText)findViewById(R.id.password)).getText().toString();
        if(userName.equals("abcde") && passWord.equals("12345")){
        Intent intent = new Intent(this, chat_room.class);
        intent.putExtra(SOME_KEY, userName);
        startActivity(intent);
        finish();
        }
        else {
            Context context = getApplicationContext();
            CharSequence text = "Login Failure";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        }
    }
}

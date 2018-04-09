package com.example.glennguan.chatol;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ContentFrameLayout;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.glennguan.chatol.MainActivity.SOME_KEY;

public class chat extends AppCompatActivity implements List.OnListInteractionListener {
    public String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.chat_l);
        } else{
            setContentView(R.layout.chat_p);
        }
        Log.i("MyProgram","onCreate called");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Intent intent = getIntent();
        value = intent.getStringExtra(SOME_KEY);
    }

    @Override
    public void onStart(){
        //don't forget super.onStart here
        super.onStart();
    if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {
            Button button = findViewById(R.id.list);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List list = new List();
                    list.setArguments(getIntent().getExtras());
                    FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                    f.add(R.id.userList, list);
                    f.commit();
                }
            });
        }



    }

    public void changeActivityToFriend(){

        Intent intent = new Intent(this, friend.class);
        startActivity(intent);
    }



    public void addText ()
    {
        String value = ((EditText)findViewById(R.id.input)).getText().toString();
        ((TextView)findViewById(R.id.chat_body)).setText("value: " + value+ "\n" +((TextView)findViewById(R.id.chat_body)).getText());
        ((EditText)findViewById(R.id.input)).setText("");
    }
}

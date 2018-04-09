package com.example.glennguan.chatol;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;




public class chat_room extends AppCompatActivity implements FeedBack.OnFeedBackInteractionListener, Description.OnDescriptionInteractionListener {
    public Button chat1,chat2,chat3,chat4,chat5,chat6;
    public final static String ROOMNUM = "Default";
    private String roomID = "1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.chat_room_l);
        } else{
            setContentView(R.layout.chat_room_p);
        }
        Log.i("MyProgram","onCreate called");
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        Intent intent = getIntent();

    }


    @Override
    public void onStart(){
        //don't forget super.onStart here
        super.onStart();


        Button button = findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivityToChat();
            }
        });



        chat1 = findViewById(R.id.chat1);
        chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Description description = new Description();
                description.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,description);
                f.commit();
            }
        });

        chat2 = findViewById(R.id.chat2);
        chat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Description description = new Description();
                description.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,description);
                f.commit();
            }
        });

        chat3 = findViewById(R.id.chat3);
        chat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Description description = new Description();
                description.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,description);
                f.commit();
            }
        });

        chat4 = findViewById(R.id.chat4);
        chat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Description description = new Description();
                description.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,description);
                f.commit();
            }
        });

        chat5 = findViewById(R.id.chat5);
        chat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Description description = new Description();
                description.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,description);
                f.commit();
            }
        });

        chat6 = findViewById(R.id.chat6);
        chat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Description description = new Description();
                description.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,description);
                f.commit();
            }
        });


        Button feedback = findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FeedBack feedBack = new FeedBack();
                feedBack.setArguments(getIntent().getExtras());
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.add(R.id.description_frame,feedBack);
                f.commit();
            }
        });

    }


    public void changeActivityToChat(){

            Intent intent = new Intent(this, chat.class);



            startActivity(intent);}

    }





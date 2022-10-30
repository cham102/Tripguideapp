package com.example.myapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnCapturedPointerListener {
    public CardView recycleviewhotel,profile;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // navigate to profile and location recycle page
        recycleviewhotel=(CardView) findViewById(R.id.hotel);
        profile=(CardView) findViewById(R.id.profile);
         recycleviewhotel.setOnCapturedPointerListener(this);
          profile.setOnCapturedPointerListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;
        switch (view.getId()){
            case R.id.hotel:
                i= new Intent(this,One.class);
                startActivity(i);
                break;

            case R.id.profile:
                i= new Intent(this,two.class);
                startActivity(i);
                break;



        }
    }

    @Override
    public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
        return false;
    }
}
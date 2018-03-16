package com.example.can.layoutsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frameOnClick(View view){
        Intent intent = new Intent (this,FrameActivity.class );
        startActivity(intent);
    }

    public void gridOnClick(View view){
        Intent intent = new Intent (this,gridActivity.class );
        startActivity(intent);
    }

    public void linearhorizonalOnClick(View view){
        Intent intent = new Intent (this,linearHorizonalActivity.class );
        startActivity(intent);
    }

    public void linearverticalOnClick(View view){
        Intent intent = new Intent (this,linearVerticalActivity.class );
        startActivity(intent);
    }


    public void relativeOnClick(View view){
        Intent intent = new Intent (this,relativeActivity.class );
        startActivity(intent);
    }


}

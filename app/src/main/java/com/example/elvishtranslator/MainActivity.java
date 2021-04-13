package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    TextView numbers, family, colors, phrases;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        numbers = findViewById(R.id.numbers);
        family = findViewById(R.id.family);
        colors = findViewById(R.id.colors);
        phrases = findViewById(R.id.phrases);

        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Cyrodiil.otf");
        numbers.setTypeface(face);
        family.setTypeface(face);
        colors.setTypeface(face);
        phrases.setTypeface(face);

        numbers.setOnClickListener(this);
        family.setOnClickListener(this);
        colors.setOnClickListener(this);
        phrases.setOnClickListener(this);


        numbers.setOnClickListener(view -> {
            Intent i = new Intent(view.getContext(), Numbers.class);
            startActivity(i);
        });
        family.setOnClickListener(view -> {
            Intent i = new Intent(view.getContext(), Family.class);
            startActivity(i);
        });
        colors.setOnClickListener(view -> {
            Intent i = new Intent(view.getContext(), Colors.class);
            startActivity(i);
        });
        phrases.setOnClickListener(view -> {
            Intent i = new Intent(view.getContext(), Phrases.class);
            startActivity(i);
        });




    }


    @Override
    public void onClick(View v) {


    }
























//    public void onClickNumbers(View view){
//        activityNumbers();
//
//    }
//    public void activityNumbers(){
//        Intent i = new Intent( this, Numbers.class);
//        startActivity(i);
//    }
//    public void onClickFamily(View view){
//        activityFamily();
//    }
//    public void activityFamily(){
//        Intent i = new Intent( this, Family.class);
//        startActivity(i);
//    }
//    public void onClickColors(View view){
//        activityColors();
//    }
//    public void activityColors(){
//        Intent i = new Intent( this, Colors.class);
//        startActivity(i);
//    }
//    public void onClickPhrases(View view){
//        activityPhrases();
//    }
//    public void activityPhrases(){
//        Intent i = new Intent( this, Colors.class);
//        startActivity(i);
//    }



}
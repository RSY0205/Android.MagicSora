package com.Magicsora.magicegg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {
    Button  food_b,yes_b,what_b,answer_b,drink_b;
    AdView  mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView=findViewById(R.id.adView);
        AdRequest   adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        food_b=(Button)findViewById(R.id.food);

        what_b=(Button)findViewById(R.id.what);
        yes_b=(Button)findViewById(R.id.yes);
        answer_b=(Button)findViewById(R.id.answer);
        //drink_b=(Button)findViewById(R.id.drink);


        food_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),food.class);
                startActivity(intent);
            }
        });

        what_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),what.class);
                startActivity(intent);
            }
        });

        yes_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),yes.class);
                startActivity(intent);
            }
        });

        answer_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),answer.class);
                startActivity(intent);
            }
        });
        /*
        drink_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),drink.class);
                startActivity(intent);
            }
        }); */


    }
}

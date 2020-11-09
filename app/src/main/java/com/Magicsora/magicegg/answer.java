package com.Magicsora.magicegg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class answer extends AppCompatActivity {
    ImageView im;
    TextView text;
    Button b;
    int num;
    AdView mAdView;
    int[] img={R.drawable.answer_1,R.drawable.answer_2,R.drawable.answer_3,R.drawable.answer_4,R.drawable.answer_5};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_answer);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView=findViewById(R.id.adView);
        AdRequest   adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        im=(ImageView)findViewById(R.id.food_image);
        text=(TextView)findViewById(R.id.food_name);
        b=(Button)findViewById(R.id.back);

        Random ran= new Random();
        num=ran.nextInt(img.length);

        switch (num){
            case 0:
                text.setText("1!!!!!!!!!!");
                text.setTextSize(30);
                im.setBackgroundResource(img[num]);
                break;

            case 1:
                text.setText("Two");
                text.setTextSize(30);
                im.setBackgroundResource(img[num]);
                break;

            case 2:
                text.setText("3333333333");
                text.setTextSize(30);
                im.setBackgroundResource(img[num]);

                break;
            case 3:
                text.setText("4스널");
                text.setTextSize(30);
                im.setBackgroundResource(img[num]);
                break;

            case 4:
                text.setText("5번!");
                text.setTextSize(30);
                im.setBackgroundResource(img[num]);
                break;

        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
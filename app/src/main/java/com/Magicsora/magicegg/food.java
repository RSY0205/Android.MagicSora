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

public class food extends AppCompatActivity {
    ImageView im;
    TextView text;
    Button b;
    AdView mAdView;
    int num;
    int[] img={ R.drawable.food_chicken1,R.drawable.food_pizza2,R.drawable.food_pasta3,R.drawable.food_ramen4,R.drawable.food_pork5,
                R.drawable.food_sandwitch6,R.drawable.food_steak7,R.drawable.food_mando8,R.drawable.food_haejangguk9,R.drawable.food_jokbal10,
                R.drawable.food_gopchang11, R.drawable.food_china12,R.drawable.food_gochi13,R.drawable.food_kalgooksu14,R.drawable.food_taco15,
                R.drawable.food_suyuk16,R.drawable.food_gukbab17,R.drawable.food_ssam18,R.drawable.food_sushi19,R.drawable.food_toppokki20};



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_food);

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
            text.setText("치킨");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 1:
            text.setText("피자");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 2:
            text.setText("파스타");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);

            break;
        case 3:
            text.setText("라면");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 4:
            text.setText("삼겹살");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 5:
            text.setText("샌드위치");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 6:
            text.setText("스테이크");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 7:
            text.setText("만두");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 8:
            text.setText("뼈해장국");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 9:
            text.setText("족발");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 10:
            text.setText("곱창");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 11:
            text.setText("중화요리");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 12:
            text.setText("양꼬치");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 13:
            text.setText("칼국수");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 14:
            text.setText("타코야끼");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 15:text.setText("보쌈");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 16:
            text.setText("국밥");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 17:text.setText("월남쌈");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 18:text.setText("초밥");
            text.setTextSize(30);
            im.setBackgroundResource(img[num]);
            break;

        case 19:text.setText("떡볶이");
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
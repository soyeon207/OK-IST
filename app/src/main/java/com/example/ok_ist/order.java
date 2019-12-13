package com.example.ok_ist;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class order extends AppCompatActivity implements View.OnClickListener, TextToSpeech.OnInitListener{
    TextView order_content;
    Button order_back,order_next;
    ImageView order_img;
    int count=0;
    String content[]  ={": 왼쪽 버튼을 눌러주세요",};
    int img[] = {R.drawable.order_store,R.drawable.order_takeout};
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        order_content = findViewById(R.id.order_content);
        order_back = findViewById(R.id.order_back);
        order_next = findViewById(R.id.order_next);
        order_img = findViewById(R.id.order_img);


    }

    @Override
    public void onInit(int status) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}

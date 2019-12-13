package com.example.ok_ist;

import android.content.Intent;
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
    ImageView order_img,order_speak;
    int count=0;
    String content[]  ={"왼쪽 버튼을 눌러주세요","왼쪽 위쪽에서 세번째 있는 버거&세트 버튼을 눌러주세요","오른쪽 아래에 있는 불고기 & 기타 버거 버튼을 눌러주세요", "가장 가운데 있는 버튼을 눌러주세요","오른쪽 아래에 있는 장바구니에 추가 버튼을 눌러주세요"};
    int img[] = {R.drawable.order_store,R.drawable.order_burger,R.drawable.order_burger2,R.drawable.order_burger3,R.drawable.order_burger4};
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        tts = new TextToSpeech(this,this);
        order_speak = findViewById(R.id.order_speak);
        order_content = findViewById(R.id.order_content);
        order_back = findViewById(R.id.order_back);
        order_next = findViewById(R.id.order_next);
        order_img = findViewById(R.id.order_img);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");

        if(type.equals("takeout")){
            content[0] = "오른쪽 버튼을 눌러주세요";
            img[0] = R.drawable.order_takeout;
            order_img.setImageResource(img[0]);
            order_content.setText(content[0]);
        }

        order_speak.setOnClickListener(this);
        order_back.setOnClickListener(this);
        order_next.setOnClickListener(this);


    }

    @Override
    public void onInit(int status) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.order_speak:
                tts.speak(content[count], TextToSpeech.QUEUE_FLUSH,null);
                break;
            case R.id.order_back:
                if(count>0)
                    count--;
                kind_setting();
                break;
            case R.id.order_next:
                if(count<content.length)
                    count++;
                kind_setting();
                break;
        }
    }

    public void kind_setting(){
        tts.stop();
        order_content.setText(content[count]);
        order_img.setImageResource(img[count]);
    }
}

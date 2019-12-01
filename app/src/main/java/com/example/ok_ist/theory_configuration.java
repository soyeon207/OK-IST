package com.example.ok_ist;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class theory_configuration extends AppCompatActivity implements View.OnClickListener, TextToSpeech.OnInitListener {

    ImageView con_img,con_speak;
    TextView con_title,con_content;
    Button con_back,con_next;
    int count=0;
    String content[]  ={": ① 무인주문기의 첫 화면입니다",": ② 식사 장소, 언어와 우측 하단에서 휠체어용 구성을 선택할 수 있습니다",":③ 매장의 메뉴(햄버거, 음료,후식 등)을 보고 선택할 수 있습니다",": ④ 메뉴를 골랐따면 자신이 원하는 구성(버거 + 음료 등)을 선택할 수 있습니다",": ⑤ 세트(묶음)메뉴를 선택하셨다면 2번을 선택하여, 추가 메뉴를 하나 고르실 수 있습니다",": ⑥ 세트(묶음)메뉴를 선택하셨다면 3번을 선택하여 음료를 고르실 수 있습니다",": ⑦ 고른 음식들과 수량을 확인 가능하며, 장바구니에 추가할 수 있습니다",": ⑧ 다시 메뉴 화면으로 돌아와 다른 음식도 고를수 있습니다(앞과 같은 방법)",": ⑨ 하단에서 주문 완료와 취소를 선택할 수 있습니다",": ⑩ 화면 아래 부착되어 있는 카드 단말기에 카드를 넣어 결제를 할 수 있습니다"};
    int img[] = {R.drawable.con1,R.drawable.con2,R.drawable.con3,R.drawable.con4,R.drawable.con5,R.drawable.con6,R.drawable.con7,R.drawable.con8,R.drawable.con9,R.drawable.con10};
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_configuration);

        tts = new TextToSpeech(this,this);
        con_speak = findViewById(R.id.con_speak);
        con_img = findViewById(R.id.con_img);
        con_content=  findViewById(R.id.con_content);
        con_back = findViewById(R.id.con_back);
        con_next = findViewById(R.id.con_next);

        con_speak.setOnClickListener(this);
        con_back.setOnClickListener(this);
        con_next.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.con_speak:
                tts.speak(content[count], TextToSpeech.QUEUE_FLUSH,null);
                break;
            case R.id.con_back:
                if(count>0)
                    count--;
                kind_setting();
                break;
            case R.id.con_next:
                if(count<content.length)
                    count++;
                kind_setting();
                break;
        }
    }

    public void kind_setting(){
        tts.stop();
        con_content.setText(content[count]);
        con_img.setImageResource(img[count]);
    }

    @Override
    public void onInit(int status) {

    }
}

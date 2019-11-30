package com.example.ok_ist;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class theory_kind extends AppCompatActivity implements View.OnClickListener, TextToSpeech.OnInitListener {

    TextToSpeech tts;
    TextView kind_title,kind_content;
    ImageView kind_img,kind_speak;
    Button kind_before,kind_after;
    int count=0;
    String title[] = {"01 - 지하철 내 카드 충전/발급","02 - 매장 내 메뉴 주문"};
    String content[]  ={": 교통카드를 무인으로 충전할 수 있으며, 일회용 교통카드를 발급할 수 잇는 무인 단말기이다.",": 메뉴를 보고 원하는 음식을 선택하여 주문할 수 있는 무인 단말기이다."};
    int img[] = {R.drawable.kind_subway,R.drawable.kind_mac};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_kind);

        tts = new TextToSpeech(this,this);
        kind_speak = findViewById(R.id.kind_speak);
        kind_before = findViewById(R.id.kind_before);
        kind_after = findViewById(R.id.kind_after);
        kind_title = findViewById(R.id.kind_title);
        kind_img = findViewById(R.id.kind_img);
        kind_content = findViewById(R.id.kind_content);

        kind_speak.setOnClickListener(this);
        kind_before.setOnClickListener(this);
        kind_after.setOnClickListener(this);
        kind_title.setOnClickListener(this);
        kind_img.setOnClickListener(this);
        kind_content.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.kind_speak:
                tts.speak(title[count]+" "+content[count], TextToSpeech.QUEUE_FLUSH,null);
                break;
            case R.id.kind_before:
                if(count==1)
                    count--;
                kind_setting();
                break;
            case R.id.kind_after:
                if(count==0)
                    count++;
                kind_setting();
                break;

        }
    }

    public void kind_setting(){
        tts.stop();
        kind_title.setText(title[count]);
        kind_content.setText(content[count]);
        kind_img.setImageResource(img[count]);
    }
    @Override
    public void onInit(int status) {

    }
}

package com.example.ok_ist;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class practice extends AppCompatActivity implements TextToSpeech.OnInitListener {

    Button hint,read;
    ImageView img;
    TextView practice_title,click2;
    TextToSpeech tts;
    int count = 0;
    String hint_str[] = {"손가락으로 화면을 눌러주세요","왼쪽에 있는 버튼을 눌러주세요"};
    String title_str[] = {"화면을 선택해주세요","매장에서 식사 하기 위해 버튼을 눌러주세요"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        tts = new TextToSpeech(this,this);

        click2 = findViewById(R.id.click2);
        practice_title = findViewById(R.id.practice_title);
        hint = findViewById(R.id.hint);
        read = findViewById(R.id.read);
        img = findViewById(R.id.img);

        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak(hint_str[count], TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(getApplication(),hint_str[count],Toast.LENGTH_SHORT).show();

            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak(title_str[count], TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0) {
                    tts.speak("성공입니다", TextToSpeech.QUEUE_FLUSH, null);
                    Toast.makeText(getApplication(), "성공입니다", Toast.LENGTH_SHORT).show();
                    count++;
                    practice_title.setText(title_str[count]);
                    click2.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.con2);
                }
                else {
                    tts.speak("다른 곳을 선택해주세요", TextToSpeech.QUEUE_FLUSH, null);
                    Toast.makeText(getApplication(), "다른 곳을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak("성공입니다", TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(getApplication(),"성공입니다",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onInit(int status) {

    }
}

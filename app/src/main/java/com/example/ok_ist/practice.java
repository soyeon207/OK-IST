package com.example.ok_ist;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class practice extends AppCompatActivity implements TextToSpeech.OnInitListener {

    Button hint,read;
    ImageView img;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        tts = new TextToSpeech(this,this);

        hint = findViewById(R.id.hint);
        read = findViewById(R.id.read);
        img = findViewById(R.id.img);

        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak("손가락으로 화면을 눌러주세요", TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(getApplication(),"손가락으로 화면을 눌러주세요",Toast.LENGTH_SHORT).show();
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak("화면을 선택해주세요", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
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

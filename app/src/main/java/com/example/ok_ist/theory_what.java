package com.example.ok_ist;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class theory_what extends AppCompatActivity implements TextToSpeech.OnInitListener{

    ImageView speak;
    Button next_btn;
    TextToSpeech tts;
    TextView title,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_what);

        tts = new TextToSpeech(this,this);
        speak = findViewById(R.id.speak);
        next_btn = findViewById(R.id.next_btn);
        title = findViewById(R.id.title);
        content = findViewById(R.id.content);

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak(title.getText()+" "+content.getText(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.stop();
                Intent intent = new Intent(getApplicationContext(),theory_kind.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onInit(int status) {

    }
}

package com.example.ok_ist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class theory extends AppCompatActivity implements View.OnClickListener {

    TextView txt1,txt2,txt3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);

       txt1 = findViewById(R.id.follow_txt_1);
       txt2 = findViewById(R.id.follow_txt_2);
       txt3 = findViewById(R.id.follow_txt_3);

       txt1.setOnClickListener(this);
       txt2.setOnClickListener(this);
       txt3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.follow_txt_1:
                intent = new Intent(getApplicationContext(),theory_what.class);
                startActivity(intent);
                break;
            case R.id.follow_txt_2:
                intent = new Intent(getApplicationContext(),theory_kind.class);
                startActivity(intent);
                break;
            case R.id.follow_txt_3:
                intent = new Intent(getApplicationContext(),theory_configuration.class);
                startActivity(intent);
                break;
        }
    }
}

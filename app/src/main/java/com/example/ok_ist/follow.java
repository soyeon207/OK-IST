package com.example.ok_ist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class follow extends AppCompatActivity implements View.OnClickListener {

    TextView follow_txt_1,follow_txt_2,follow_txt_3;
    LinearLayout follow_list,follow_explain,follow_kind,follow_form;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);

        follow_list = findViewById(R.id.follow_list);
        follow_explain = findViewById(R.id.follow_explain);
        follow_kind = findViewById(R.id.follow_form);
        follow_form = findViewById(R.id.follow_form);

        follow_txt_1 = findViewById(R.id.follow_txt_1);
        follow_txt_2 = findViewById(R.id.follow_txt_2);
        follow_txt_3 = findViewById(R.id.follow_txt_3);

        follow_txt_1.setOnClickListener(this);
        follow_txt_2.setOnClickListener(this);
        follow_txt_3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.follow_txt_1:
                follow_list.setVisibility(View.INVISIBLE);
                follow_explain.setVisibility(View.VISIBLE);
                break;
            case R.id.follow_txt_2:
                break;
            case R.id.follow_txt_3:
                break;
        }
    }
}

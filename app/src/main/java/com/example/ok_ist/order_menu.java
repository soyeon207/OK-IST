package com.example.ok_ist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class order_menu extends AppCompatActivity {

    TextView store,takeout;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);

        store = findViewById(R.id.store);
        takeout = findViewById(R.id.takeout);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplication(),order.class);
                intent.putExtra("bb","store");
                startActivity(intent);
            }
        });

        takeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplication(),order.class);
                intent.putExtra("bb","takeout");
                startActivity(intent);
            }
        });
    }
}

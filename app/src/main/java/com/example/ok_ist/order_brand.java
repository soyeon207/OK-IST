package com.example.ok_ist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class order_brand extends AppCompatActivity {

    LinearLayout brand_mac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_brand);

        brand_mac = findViewById(R.id.brand_mac);

        brand_mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),order_menu.class);
                startActivity(intent);
            }
        });
    }
}

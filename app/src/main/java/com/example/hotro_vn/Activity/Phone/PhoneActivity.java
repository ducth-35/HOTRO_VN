package com.example.hotro_vn.Activity.Phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hotro_vn.Activity.News.News_Activity;
import com.example.hotro_vn.R;

public class PhoneActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        btn = findViewById(R.id.btn_tieptheo);
        onClick();
    }

    public void onClick() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PhoneActivity.this, News_Activity.class));
            }
        });
    }
}
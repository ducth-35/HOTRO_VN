package com.example.hotro_vn.Phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.hotro_vn.News.News;
import com.example.hotro_vn.R;


public class Phone extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        btn = findViewById(R.id.btn_tieptheo);

        onClick();;
    }
    public void onClick() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phone.this, News.class);
                startActivity(intent);
            }
        });
    }
}
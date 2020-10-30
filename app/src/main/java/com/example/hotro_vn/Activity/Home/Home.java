package com.example.hotro_vn.Activity.Home;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotro_vn.Activity.Phone.Phone2_Activity;
import com.example.hotro_vn.Activity.Phone.PhoneActivity;
import com.example.hotro_vn.R;

public class Home extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1 = findViewById(R.id.btn_manhthuongquan);
        btn2 = findViewById(R.id.btn_cancuutro);
        onclick();
    }

    public void onclick() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, Phone2_Activity.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, PhoneActivity.class));
            }
        });
    }
}
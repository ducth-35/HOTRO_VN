package com.example.hotro_vn.News;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hotro_vn.R;

import java.lang.reflect.Field;

public class Add_news extends AppCompatActivity {
    ImageView img;
    Button btn_luu, btn_dong;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_news);
        img = findViewById(R.id.img_back5);
        btn_luu = findViewById(R.id.btn_luu);
        btn_dong = findViewById(R.id.btn_dong);
        onlick();
        luu();
    }

    public void onlick() {
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void luu() {
        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_alertdialog);
                Button dialogButton = (Button) dialog.findViewById(R.id.btn_dong);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Add_news.this, News.class);
                        startActivity(intent);
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Cảm ơn bạn!!!", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }

}
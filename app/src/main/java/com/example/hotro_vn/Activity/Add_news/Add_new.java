package com.example.hotro_vn.Activity.Add_news;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hotro_vn.Activity.News.News_Activity;
import com.example.hotro_vn.R;

public class Add_new extends AppCompatActivity {
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
            public void onClick(View view) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_alertdialog);
                Button dialogButton = (Button) dialog.findViewById(R.id.btn_dong);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Add_new.this, News_Activity.class));
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Cảm ơn bạn!!!", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }

}
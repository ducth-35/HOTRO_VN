package com.example.hotro_vn.News;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.hotro_vn.R;

public class News extends AppCompatActivity {
    ImageButton imageButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        imageButton = findViewById(R.id.add_bantin);
        imageView = findViewById(R.id.img_back5);
        onClick();
    }
    public void onClick(){
      imageButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(News.this, Add_news.class);
              startActivity(intent);
          }
      });
      imageView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              onBackPressed();
          }
      });
    }
}
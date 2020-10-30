package com.example.hotro_vn.Activity.News;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.hotro_vn.Activity.Add_news.Add_new;
import com.example.hotro_vn.Adapter.New_adapte;
import com.example.hotro_vn.Model.Model;
import com.example.hotro_vn.R;

import java.util.ArrayList;
import java.util.List;

public class News_Activity extends AppCompatActivity {
    private List<Model> mListMovie = new ArrayList<>();
    private RecyclerView recyclerView;
    private New_adapte mAdapter;
    ImageButton imageButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        imageButton = findViewById(R.id.add_bantin);
        imageView = findViewById(R.id.img_back5);
        onClick();
        prepareMovieData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        mAdapter = new New_adapte(this,mListMovie);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    private void prepareMovieData() {
        mListMovie = new ArrayList<>();
        mListMovie.add(new Model("Gạo, đồ ăn, nước uống và các nhu yếu phẩm khác","Ninh Bình","27/10/2020","Trương Huỳnh Đức"));
        mListMovie.add(new Model("Gạo, đồ ăn, nước uống và các nhu yếu phẩm, đồ dùng cá nhân","Hà Nội","28/10/2020","Trương Huỳnh Đức"));
        mListMovie.add(new Model("Gạo, đồ ăn, nước uống và các nhu yếu phẩm","Hà Nam","29/10/2020","Trương Huỳnh Đức"));
        mListMovie.add(new Model("Gạo, đồ ăn, nước uống và các nhu yếu phẩm","Hà Tĩnh","17/10/2020","Trương Huỳnh Đức"));
        mListMovie.add(new Model("Gạo, đồ ăn, nước uống và các nhu yếu phẩm","Hà Tĩnh","07/10/2020","Trương Huỳnh Đức"));
    }

    public void onClick(){
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(News_Activity.this, Add_new.class));
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
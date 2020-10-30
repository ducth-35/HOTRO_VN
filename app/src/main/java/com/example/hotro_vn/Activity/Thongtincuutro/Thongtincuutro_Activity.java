package com.example.hotro_vn.Activity.Thongtincuutro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotro_vn.Activity.Thongtincuutro.Adpater_thongttincuutro;
import com.example.hotro_vn.Activity.Thongtincuutro.Model_thongtincuutro;
import com.example.hotro_vn.Activity.Add_news.Add_new;
import com.example.hotro_vn.R;

import java.util.ArrayList;
import java.util.List;

public class Thongtincuutro_Activity extends AppCompatActivity {

    private List<Model_thongtincuutro> mListMovie = new ArrayList<>();
    private RecyclerView recycleview_thongtincuutro;
    private Adpater_thongttincuutro mAdapter;
    TextView tv1, tv2, tv3, tv4;
    ImageButton imageButton;
    ImageView imageView;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtincuutro);
        tv1 = findViewById(R.id.diadiem_thongtincuutro);
        tv2 = findViewById(R.id.sanpham_thongtincuutro);
        tv3 = findViewById(R.id.nguoitao_thongtincuutro);
        tv4 = findViewById(R.id.thoigian_thongtincuutro);
        imageButton = findViewById(R.id.add_bantin);
        imageView = findViewById(R.id.img_back5);
        onClick();

        i = getIntent();
        tv1.setText(i.getStringExtra("diadiem"));
        tv2.setText(i.getStringExtra("sanpham"));
        tv3.setText(i.getStringExtra("nguoitao"));
        tv4.setText(i.getStringExtra("ngaythang"));

//
        prepareMovieData();
        recycleview_thongtincuutro = (RecyclerView) findViewById(R.id.recycleview_thongtincuutro);
        mAdapter = new Adpater_thongttincuutro(this,mListMovie);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycleview_thongtincuutro.setLayoutManager(mLayoutManager);
        recycleview_thongtincuutro.setItemAnimator(new DefaultItemAnimator());
        recycleview_thongtincuutro.setAdapter(mAdapter);
    }

    private void prepareMovieData() {
        mListMovie = new ArrayList<>();
        mListMovie.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm khác như:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Ninh Bình","27/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mListMovie.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm, đồ dùng cá nhân:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Nội","28/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mListMovie.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Nam","29/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mListMovie.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Tĩnh","17/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mListMovie.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Tĩnh","07/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
    }
    public void onClick(){
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Thongtincuutro_Activity.this, Add_new.class));
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
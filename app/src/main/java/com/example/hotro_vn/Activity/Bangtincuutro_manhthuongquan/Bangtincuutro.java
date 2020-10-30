package com.example.hotro_vn.Activity.Bangtincuutro_manhthuongquan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.hotro_vn.R;
import com.example.hotro_vn.Activity.Thongtincuutro.Model_thongtincuutro;

import java.util.ArrayList;
import java.util.List;

public class Bangtincuutro extends AppCompatActivity {
    private List<Model_thongtincuutro> mList = new ArrayList<>();
    private Adapter_bantincuutro mAdapter;
    RecyclerView recycview_mtq_newfeed;
    LinearLayout linearLayout, linearLayout2;
    RelativeLayout relativeLayout;
    LinearLayout relativeLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangtincuutro);
        linearLayout = findViewById(R.id.btn_bando);
        linearLayout2 = findViewById(R.id.btn_thongtin);
        relativeLayout = findViewById(R.id.rv_thongtin);
        relativeLayout2 = findViewById(R.id.fr_bando);
        Onclick();
        //
        prepareMovieData();
        recycview_mtq_newfeed = (RecyclerView) findViewById(R.id.recycview_mtq_newfeed);
        mAdapter = new Adapter_bantincuutro(this,mList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycview_mtq_newfeed.setLayoutManager(mLayoutManager);
        recycview_mtq_newfeed.setItemAnimator(new DefaultItemAnimator());
        recycview_mtq_newfeed.setAdapter(mAdapter);
    }
    private void prepareMovieData() {
        mList.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm khác như:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Ninh Bình","27/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mList.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm, đồ dùng cá nhân:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Nội","28/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mList.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Nam","29/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mList.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Tĩnh","17/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
        mList.add(new Model_thongtincuutro("Gạo, đồ ăn, nước uống và các nhu yếu phẩm:\n - Mì tôm: 300 thùng\n  - Đèn pin: 300 cái \n Mong bà con vững tin vượt qua, chúng tôi luôn ở bên bạn lúc khó khăn","Hà Tĩnh","07/10/2020","Trương Huỳnh Đức","1","10:30 AM","0329619927","Sinh Viên","Dương Đình Nghệ"));
    }
    public void Onclick(){
          linearLayout2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
              relativeLayout.setVisibility(View.VISIBLE);
              relativeLayout2.setVisibility(View.GONE);
              }
          });
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setVisibility(View.GONE);
                relativeLayout2.setVisibility(View.VISIBLE);
            }
        });
    }
}
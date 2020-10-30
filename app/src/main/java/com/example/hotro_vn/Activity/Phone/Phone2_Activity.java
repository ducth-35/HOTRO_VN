package com.example.hotro_vn.Activity.Phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.hotro_vn.Activity.Bangtincuutro_manhthuongquan.Bangtincuutro;
import com.example.hotro_vn.R;

public class Phone2_Activity extends AppCompatActivity {
    Button btn;
    ImageButton imageButton;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone2);
        btn = findViewById(R.id.btn_tieptheo2);
        imageButton = findViewById(R.id.btn_close);
        onclick();
    }

    public void onclick() {
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Phone2_Activity.this);
//                View bottomSheetView = LayoutInflater.from(getApplicationContext())
//                        .inflate(R.layout.bottom_sheet, (LinearLayout) findViewById(R.id.bottomcontainer));
//                bottomSheetView.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(Phone2_Activity.this, "Cảm ơn bạn", Toast.LENGTH_SHORT).show();
//                        bottomSheetDialog.dismiss();
//                    }
//                });
//                bottomSheetDialog.setContentView(bottomSheetView);
//                bottomSheetDialog.show();
//            }
//        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(Phone2_Activity.this, Bangtincuutro.class));
            }
        });
    }
}
package com.example.hotro_vn.Activity.Bangtincuutro_manhthuongquan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotro_vn.R;
import com.example.hotro_vn.Activity.Thongtincuutro.Model_thongtincuutro;
import com.example.hotro_vn.Activity.Thongtincuutro_manhthuongquan.Thongtincuutro_manhthuongquan;

import java.util.List;

public class Adapter_bantincuutro extends RecyclerView.Adapter<Adapter_bantincuutro.ViewHolder> {
    private List<Model_thongtincuutro> mList;
    private LayoutInflater mLayoutInflater;
    Context context;

    public Adapter_bantincuutro(Context context, List<Model_thongtincuutro> mList) {
        this.mList = mList;
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Adapter_bantincuutro.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = mLayoutInflater.inflate(R.layout.item3,parent,false);
        return new Adapter_bantincuutro.ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_bantincuutro.ViewHolder holder, int position) {
        Model_thongtincuutro model = mList.get(position);
        holder.tv1.setText(model.getDiadiem());
        holder.tv2.setText(model.getSanpham());
        holder.tv3.setText("(" + model.getSonguoitao() + ")");
        holder.tv4.setText( model.getNguoitao() + " | " + model.getSodienthoai());
        holder.tv6.setText(model.getChucvu());
        holder.tv5.setText(model.getNgaythang() + " - " + model.getThoigian());
        holder.tv7.setText(model.getBuilding());
        holder.tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Thongtincuutro_manhthuongquan.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3, tv4,tv5,tv6, tv7, tv8;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.diadiem);
            tv2 = itemView.findViewById(R.id.sanpham_bangtincuutro);
            tv3 = itemView.findViewById(R.id.nguoitao_bangtincuutro);
            tv4 = itemView.findViewById(R.id.ten_bantincuutro);
            tv5 = itemView.findViewById(R.id.date);
            tv6 = itemView.findViewById(R.id.chucvu_bantincuutro);
            tv7 = itemView.findViewById(R.id.building);
            tv8 = itemView.findViewById(R.id.xemchitiet);
        }
    }
}

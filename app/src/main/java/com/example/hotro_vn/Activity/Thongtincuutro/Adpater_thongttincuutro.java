package com.example.hotro_vn.Activity.Thongtincuutro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotro_vn.R;

import java.util.List;

public class Adpater_thongttincuutro extends RecyclerView.Adapter<Adpater_thongttincuutro.ViewHolder> {
    private List<Model_thongtincuutro> movieList;
    private LayoutInflater mLayoutInflater;
    Context context;

    public Adpater_thongttincuutro(Context context, List<Model_thongtincuutro> movieList) {
        this.movieList = movieList;
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Adpater_thongttincuutro.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = mLayoutInflater.inflate(R.layout.item2, parent, false);
        return new Adpater_thongttincuutro.ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull Adpater_thongttincuutro.ViewHolder holder, int position) {
        Model_thongtincuutro model = movieList.get(position);
        holder.tv1.setText(model.getDiadiem());
        holder.tv2.setText(model.getSanpham());
        holder.tv3.setText(model.getNgaythang() + " - " + model.getThoigian());
        holder.tv4.setText(model.getNguoitao() + " | " + model.getSodienthoai());
        holder.tv6.setText(model.getChucvu());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.diadiem_thongtincuutro);
            tv2 = itemView.findViewById(R.id.sanpham_thongtincuutro);
            tv3 = itemView.findViewById(R.id.thoigian_thongtincuutro);
            tv4 = itemView.findViewById(R.id.nguoitao_thongtincuutro);
            tv5 = itemView.findViewById(R.id.xemchitiet_thongtincuutro);
            tv6 = itemView.findViewById(R.id.chucvu);
            tv7 = itemView.findViewById(R.id.xemchitiet_thongtincuutro);
        }
    }
}


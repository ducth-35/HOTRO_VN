package com.example.hotro_vn.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotro_vn.Model.Model;
import com.example.hotro_vn.R;
import com.example.hotro_vn.Activity.Thongtincuutro.Thongtincuutro_Activity;

import java.util.List;

public class New_adapte extends RecyclerView.Adapter<New_adapte.ViewHolder> {
    private List<Model> movieList;
    private LayoutInflater mLayoutInflater;
    Context context;

    public New_adapte(Context context,List<Model> movieList) {
        this.movieList = movieList;
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = mLayoutInflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = movieList.get(position);
        holder.tv1.setText(model.getDiadiem());
        holder.tv2.setText(model.getSanpham());
        holder.tv3.setText(model.getNguoitao());
        holder.tv4.setText( model.getNgaythang());
        holder.tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Thongtincuutro_Activity.class);
                intent.putExtra("diadiem",model.getDiadiem());
                intent.putExtra("sanpham", model.getSanpham());
                intent.putExtra("ngaythang", model.getNgaythang());
                intent.putExtra("nguoitao",model.getNguoitao());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3, tv4,tv5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.diadiem);
            tv2 = itemView.findViewById(R.id.sanpham);
            tv3 = itemView.findViewById(R.id.nguoitao);
            tv4 = itemView.findViewById(R.id.date);
            tv5 = itemView.findViewById(R.id.xemchitiet);
        }
    }
}

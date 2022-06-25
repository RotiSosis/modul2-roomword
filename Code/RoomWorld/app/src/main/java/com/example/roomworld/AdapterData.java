package com.example.roomworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomworld.DATA.Kata;
import com.example.roomworld.DATA.Pustaka;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    List<String> listData;
    LayoutInflater inflater;
    List<Pustaka> pustakaList;
    List<Kata> kataList;

    public AdapterData(Context context, List<String> listData, List<Pustaka>pustakaList) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(context);
        this.pustakaList = pustakaList;
    }

    @NonNull
    @Override
    public AdapterData.HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.item_data, parent, false);
        return new HolderData(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterData.HolderData holder, int position) {
        Pustaka current = pustakaList.get(position);
        holder.txtData.setText(current.getNamaPustaka());
    }

    void setPustaka(List<Pustaka> mpustakaList){
        pustakaList = mpustakaList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return pustakaList.size();
    }

    public static class HolderData extends RecyclerView.ViewHolder {
        TextView txtData;
        public HolderData(@NonNull View itemView){
            super(itemView);

            txtData = itemView.findViewById(R.id.text_pustaka);
        }
    }
}


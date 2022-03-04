package com.example.moive.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moive.Model.Category;
import com.example.moive.R;

import java.util.List;

public class CustomCategoryAdapter extends RecyclerView.Adapter<CustomCategoryAdapter.CategoryViewHolder> {

    List<Category> listCategory ;
    Context mContext ;
    public void setData(List<Category> list , Context context){
        this.listCategory = list ;
        this.mContext = context ;
    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);

        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.txtTitleCategory.setText(listCategory.get(position).getTitle());
        Log.d( "onBindViewHolder: ", listCategory.size()+"");
        CustomBookAdapter customBookAdapter = new CustomBookAdapter();
        customBookAdapter.setData(listCategory.get(position).getListBooks());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
        holder.recyclerView.setLayoutManager(layoutManager);
        holder.recyclerView.setAdapter(customBookAdapter);
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView ;
        TextView txtTitleCategory ;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerView = itemView.findViewById(R.id.rcv_book) ;
            txtTitleCategory = itemView.findViewById(R.id.txt_title_category);
        }
    }
}

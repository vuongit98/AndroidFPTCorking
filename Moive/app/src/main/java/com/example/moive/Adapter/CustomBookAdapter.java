package com.example.moive.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moive.Model.Book;
import com.example.moive.R;

import java.util.List;

public class CustomBookAdapter extends RecyclerView.Adapter<CustomBookAdapter.BookViewHolder> {

    List<Book> listBooks ;

    void setData(List<Book> list) {
        this.listBooks = list ;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.imgBook.setBackgroundResource(listBooks.get(position).getImage());
        holder.txtTitleBook.setText(listBooks.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return listBooks.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgBook ;
        public TextView txtTitleBook ;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBook = itemView.findViewById(R.id.img_book) ;
            txtTitleBook = itemView.findViewById(R.id.txt_title);
        }
    }
}

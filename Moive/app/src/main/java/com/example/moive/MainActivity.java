package com.example.moive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.moive.Adapter.CustomCategoryAdapter;
import com.example.moive.Model.Book;
import com.example.moive.Model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    CustomCategoryAdapter customCategoryAdapter ;
    List<Category> listCategory = new ArrayList<>() ;
    List<Book> listBook = new ArrayList<>() ;
    SearchView searchView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView = findViewById(R.id.btn_search) ;
        for(int i = 1 ; i <= 10 ;i++) {
            listBook.add(new Book("Books "+i, R.drawable.download));
        }
        listCategory.add(new Category("Category 1", listBook));
        listCategory.add(new Category("Category 2", listBook));

        listCategory.add(new Category("Category 3", listBook));

        listCategory.add(new Category("Category 4", listBook));

        listCategory.add(new Category("Category 5", listBook));

        listCategory.add(new Category("Category 6", listBook));

        listCategory.add(new Category("Category 7", listBook));

        listCategory.add(new Category("Category 8", listBook));



        recyclerView = findViewById(R.id.rcv_category) ;
        customCategoryAdapter = new CustomCategoryAdapter() ;
        customCategoryAdapter.setData(listCategory,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customCategoryAdapter);
    }
}
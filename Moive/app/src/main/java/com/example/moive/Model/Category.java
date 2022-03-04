package com.example.moive.Model;

import java.util.List;

public class Category {
    private String title ;
    private List<Book> listBooks ;

    public Category() {
    }

    public Category(String title, List<Book> listBooks) {
        this.title = title;
        this.listBooks = listBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }
}

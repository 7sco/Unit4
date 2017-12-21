package com.example.franciscoandrade.unit4;

import java.util.List;

/**
 * Created by franciscoandrade on 12/20/17.
 */

public class GetObjectBooks {


    private List<Books> books;

    public GetObjectBooks(List<Books> books) {
        this.books = books;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [books = "+books+"]";
    }
}

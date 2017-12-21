package com.example.franciscoandrade.unit4;

/**
 * Created by franciscoandrade on 12/20/17.
 */

public class Books
{
    private String author;

    private String title;

    private String year;




    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [author = "+author+", title = "+title+", year = "+year+"]";
    }
}


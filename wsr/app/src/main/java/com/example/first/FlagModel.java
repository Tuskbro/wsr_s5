package com.example.first;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.Date;

public class FlagModel {
    private int id;
    private String name;
    private Drawable img;
    private Date date;
    private String  ShortReport;
    private String  Score;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String date) {
        this.Score = Score;
    }

    public String getShortReport() {
        return ShortReport;
    }

    public void setShortReport(String ShortReport) {
        this.ShortReport = ShortReport;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlagModel(int id, String name,Drawable img,Date date)
    {
        this.id = id;
        this.name = name;
        this.img = img;
        this.date = date;
        this.Score =Score;
        this.ShortReport =ShortReport;


    }
}

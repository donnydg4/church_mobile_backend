package com.church.churchrestservice.beans.app;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class GiveInfo {

    private String imageUrl;
    private String bigTitle;
    private ArrayList<String> titles;
    private ArrayList<String> foundations;
    private ArrayList<String> tithing;
    private ArrayList<String> giving;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBigTitle() {
        return bigTitle;
    }

    public void setBigTitle(String bigTitle) {
        this.bigTitle = bigTitle;
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

    public ArrayList<String> getFoundations() {
        return foundations;
    }

    public void setFoundations(ArrayList<String> foundations) {
        this.foundations = foundations;
    }

    public ArrayList<String> getTithing() {
        return tithing;
    }

    public void setTithing(ArrayList<String> tithing) {
        this.tithing = tithing;
    }

    public ArrayList<String> getGiving() {
        return giving;
    }

    public void setGiving(ArrayList<String> giving) {
        this.giving = giving;
    }
}

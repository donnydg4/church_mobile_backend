package com.church.churchrestservice.beans.website;

import java.util.ArrayList;

public class SozoInfo {
    private String title;
    private ArrayList<String> description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }
}

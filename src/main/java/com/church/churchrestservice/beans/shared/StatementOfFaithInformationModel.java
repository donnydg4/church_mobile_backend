package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class StatementOfFaithInformationModel {
    private String title;
    private String description;
    private ArrayList<String> scriptures;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getScriptures() {
        return scriptures;
    }

    public void setScriptures(ArrayList<String> scriptures) {
        this.scriptures = scriptures;
    }
}

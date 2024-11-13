package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class OurMinistriesModel {
    private String title;
    private String coverPhoto;
    private ArrayList<DisplayCardResponse> displayCards;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public ArrayList<DisplayCardResponse> getDisplayCards() {
        return displayCards;
    }

    public void setDisplayCards(ArrayList<DisplayCardResponse> displayCards) {
        this.displayCards = displayCards;
    }
}

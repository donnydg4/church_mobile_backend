package com.church.churchrestservice.beans.website;

import java.util.ArrayList;

public class KidYouthModel {
    private String mainImageUrl;
    private String mobileImageUrl;
    private String textBreak;
    private ArrayList<String> victorsLetterImages;
    private ArrayList<String> victorsWords;
    private ArrayList<String> victorsDescriptions;

    public ArrayList<String> getVictorsLetterImages() {
        return victorsLetterImages;
    }

    public void setVictorsLetterImages(ArrayList<String> victorsLetterImages) {
        this.victorsLetterImages = victorsLetterImages;
    }

    public ArrayList<String> getVictorsWords() {
        return victorsWords;
    }

    public void setVictorsWords(ArrayList<String> victorsWords) {
        this.victorsWords = victorsWords;
    }

    public ArrayList<String> getVictorsDescriptions() {
        return victorsDescriptions;
    }

    public void setVictorsDescriptions(ArrayList<String> victorsDescriptions) {
        this.victorsDescriptions = victorsDescriptions;
    }

    public String getTextBreak() {
        return textBreak;
    }

    public void setTextBreak(String textBreak) {
        this.textBreak = textBreak;
    }

    public String getMobileImageUrl() {
        return mobileImageUrl;
    }

    public void setMobileImageUrl(String mobileImageUrl) {
        this.mobileImageUrl = mobileImageUrl;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }
}

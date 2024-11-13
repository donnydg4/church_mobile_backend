package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OurChurch {
    private String coverPhoto;
    private String title;
    private History history;
    private About about;
    private Belief beliefs;

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }

    public Belief getBeliefs() {
        return beliefs;
    }

    public void setBeliefs(Belief beliefs) {
        this.beliefs = beliefs;
    }
}

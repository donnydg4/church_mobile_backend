package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Audio {
    private String title;
    private String description;
    private String lengthOfSong;

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

    public String getLengthOfSong() {
        return lengthOfSong;
    }

    public void setLengthOfSong(String lengthOfSong) {
        this.lengthOfSong = lengthOfSong;
    }
}

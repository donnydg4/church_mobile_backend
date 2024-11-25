package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class WorshipPageModel {
    private String videoUrl;
    private String worshipPageTitle;
    private String audioTitle;
    private String videoTitle;
    private String audioImg;
    private ArrayList<String> musicVideosImageUrls;
    private ArrayList<Audio> audioFiles;

    public String getWorshipPageTitle() {
        return worshipPageTitle;
    }

    public void setWorshipPageTitle(String worshipPageTitle) {
        this.worshipPageTitle = worshipPageTitle;
    }

    public String getAudioImg() {
        return audioImg;
    }

    public void setAudioImg(String audioImg) {
        this.audioImg = audioImg;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public ArrayList<String> getMusicVideosImageUrls() {
        return musicVideosImageUrls;
    }

    public void setMusicVideosImageUrls(ArrayList<String> musicVideosImageUrls) {
        this.musicVideosImageUrls = musicVideosImageUrls;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle;
    }

    public ArrayList<Audio> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(ArrayList<Audio> audioFiles) {
        this.audioFiles = audioFiles;
    }
}

package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class HomePage {
    private String homePageTitle;
    private Emergency emergency;
    private String videoUrl;
    private String serviceTimesTitle;
    private String serviceTimes;
    private String whoWeAreTitle;
    private String whoWeAreDescription;
    private String whoWeAreImageUrl;
    private String newHereTitle;
    private String newHereDescription;
    private String newHereImageUrl;
    private ArrayList<WaysToEngageModel> waysToEngage;
    private String establishedImg;

    public String getHomePageTitle() {
        return homePageTitle;
    }

    public void setHomePageTitle(String homePageTitle) {
        this.homePageTitle = homePageTitle;
    }

    public Emergency getEmergency() {
        return emergency;
    }

    public void setEmergency(Emergency emergency) {
        this.emergency = emergency;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getServiceTimesTitle() {
        return serviceTimesTitle;
    }

    public void setServiceTimesTitle(String serviceTimesTitle) {
        this.serviceTimesTitle = serviceTimesTitle;
    }

    public String getServiceTimes() {
        return serviceTimes;
    }

    public void setServiceTimes(String serviceTimes) {
        this.serviceTimes = serviceTimes;
    }

    public String getWhoWeAreTitle() {
        return whoWeAreTitle;
    }

    public void setWhoWeAreTitle(String whoWeAreTitle) {
        this.whoWeAreTitle = whoWeAreTitle;
    }

    public String getWhoWeAreDescription() {
        return whoWeAreDescription;
    }

    public void setWhoWeAreDescription(String whoWeAreDescription) {
        this.whoWeAreDescription = whoWeAreDescription;
    }

    public String getWhoWeAreImageUrl() {
        return whoWeAreImageUrl;
    }

    public void setWhoWeAreImageUrl(String whoWeAreImageUrl) {
        this.whoWeAreImageUrl = whoWeAreImageUrl;
    }

    public String getNewHereTitle() {
        return newHereTitle;
    }

    public void setNewHereTitle(String newHereTitle) {
        this.newHereTitle = newHereTitle;
    }

    public String getNewHereDescription() {
        return newHereDescription;
    }

    public void setNewHereDescription(String newHereDescription) {
        this.newHereDescription = newHereDescription;
    }

    public String getNewHereImageUrl() {
        return newHereImageUrl;
    }

    public void setNewHereImageUrl(String newHereImageUrl) {
        this.newHereImageUrl = newHereImageUrl;
    }

    public ArrayList<WaysToEngageModel> getWaysToEngage() {
        return waysToEngage;
    }

    public void setWaysToEngage(ArrayList<WaysToEngageModel> waysToEngage) {
        this.waysToEngage = waysToEngage;
    }

    public String getEstablishedImg() {
        return establishedImg;
    }

    public void setEstablishedImg(String establishedImg) {
        this.establishedImg = establishedImg;
    }
}

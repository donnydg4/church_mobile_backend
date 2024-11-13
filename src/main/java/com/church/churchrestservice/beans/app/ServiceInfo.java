package com.church.churchrestservice.beans.app;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class ServiceInfo {
    private String imageUrl;
    private ArrayList<String> services;
    private String welcomeDescription;
    private String anotherTitle;
    private ArrayList<String> servicesExpect;
    private String endDescription;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    public String getWelcomeDescription() {
        return welcomeDescription;
    }

    public void setWelcomeDescription(String welcomeDescription) {
        this.welcomeDescription = welcomeDescription;
    }

    public String getAnotherTitle() {
        return anotherTitle;
    }

    public void setAnotherTitle(String anotherTitle) {
        this.anotherTitle = anotherTitle;
    }

    public ArrayList<String> getServicesExpect() {
        return servicesExpect;
    }

    public void setServicesExpect(ArrayList<String> servicesExpect) {
        this.servicesExpect = servicesExpect;
    }

    public String getEndDescription() {
        return endDescription;
    }

    public void setEndDescription(String endDescription) {
        this.endDescription = endDescription;
    }
}



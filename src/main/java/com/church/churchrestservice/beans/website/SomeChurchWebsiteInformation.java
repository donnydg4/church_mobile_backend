package com.church.churchrestservice.beans.website;

import com.church.churchrestservice.beans.app.ServiceInfo;
import com.church.churchrestservice.beans.shared.PrayerInfo;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class SomeChurchWebsiteInformation {
    private HomePage homePage;
    private OurChurch ourChurch;
    private ServiceInfo serviceInfo;
    private PrayerInfo prayerInfo;
    private ArrayList<DirectionsModel> directions;

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public OurChurch getOurChurch() {
        return ourChurch;
    }

    public void setOurChurch(OurChurch ourChurch) {
        this.ourChurch = ourChurch;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public PrayerInfo getPrayerInfo() {
        return prayerInfo;
    }

    public void setPrayerInfo(PrayerInfo prayerInfo) {
        this.prayerInfo = prayerInfo;
    }

    public ArrayList<DirectionsModel> getDirections() {
        return directions;
    }

    public void setDirections(ArrayList<DirectionsModel> directions) {
        this.directions = directions;
    }
}

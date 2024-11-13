package com.church.churchrestservice.beans.app;

import com.church.churchrestservice.beans.shared.PrayerInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(value = "all_church_information")
public class AllChurchInformation {

    @Id
    private String id;

    private ArrayList<String> whatToExpect;
    private ServiceInfo serviceInfo;
    private ConnectInfo connectInfo;
    private GiveInfo giveInfo;
    private PrayerInfo prayerInfo;
    private AboutTheChurch aboutUs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getWhatToExpect() {
        return whatToExpect;
    }

    public void setWhatToExpect(ArrayList<String> whatToExpect) {
        this.whatToExpect = whatToExpect;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public ConnectInfo getConnectInfo() {
        return connectInfo;
    }

    public void setConnectInfo(ConnectInfo connectInfo) {
        this.connectInfo = connectInfo;
    }

    public GiveInfo getGiveInfo() {
        return giveInfo;
    }

    public void setGiveInfo(GiveInfo giveInfo) {
        this.giveInfo = giveInfo;
    }

    public PrayerInfo getPrayerInfo() {
        return prayerInfo;
    }

    public void setPrayerInfo(PrayerInfo prayerInfo) {
        this.prayerInfo = prayerInfo;
    }

    public AboutTheChurch getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(AboutTheChurch aboutUs) {
        this.aboutUs = aboutUs;
    }
}

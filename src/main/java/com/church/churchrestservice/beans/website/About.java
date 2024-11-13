package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class About {
    private String crazyForJesusImage;
    private ArrayList<String> crazyForJesus;
    private ArrayList<String> missionVisionTargetTitles;
    private ArrayList<String> missionVisionTargetDescriptions;
    private ArrayList<ChurchInfo> churchInfo;

    public String getCrazyForJesusImage() {
        return crazyForJesusImage;
    }

    public void setCrazyForJesusImage(String crazyForJesusImage) {
        this.crazyForJesusImage = crazyForJesusImage;
    }

    public ArrayList<String> getCrazyForJesus() {
        return crazyForJesus;
    }

    public void setCrazyForJesus(ArrayList<String> crazyForJesus) {
        this.crazyForJesus = crazyForJesus;
    }

    public ArrayList<String> getMissionVisionTargetTitles() {
        return missionVisionTargetTitles;
    }

    public void setMissionVisionTargetTitles(ArrayList<String> missionVisionTargetTitles) {
        this.missionVisionTargetTitles = missionVisionTargetTitles;
    }

    public ArrayList<String> getMissionVisionTargetDescriptions() {
        return missionVisionTargetDescriptions;
    }

    public void setMissionVisionTargetDescriptions(ArrayList<String> missionVisionTargetDescriptions) {
        this.missionVisionTargetDescriptions = missionVisionTargetDescriptions;
    }

    public ArrayList<ChurchInfo> getChurchInfo() {
        return churchInfo;
    }

    public void setChurchInfo(ArrayList<ChurchInfo> churchInfo) {
        this.churchInfo = churchInfo;
    }
}

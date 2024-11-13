package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class ChurchInfo {
    private String title;
    private ArrayList<String> descriptions;
    private ArrayList<String> missionVisionTargetTitles;
    private ArrayList<String> missionVisionTarget;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<String> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<String> getMissionVisionTargetTitles() {
        return missionVisionTargetTitles;
    }

    public void setMissionVisionTargetTitles(ArrayList<String> missionVisionTargetTitles) {
        this.missionVisionTargetTitles = missionVisionTargetTitles;
    }

    public ArrayList<String> getMissionVisionTarget() {
        return missionVisionTarget;
    }

    public void setMissionVisionTarget(ArrayList<String> missionVisionTarget) {
        this.missionVisionTarget = missionVisionTarget;
    }
}

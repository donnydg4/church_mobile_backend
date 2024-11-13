package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class History {
    private String title;
    private String subTitle;
    private ArrayList<IndividualHistoryModel> individualHistoryObject;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public ArrayList<IndividualHistoryModel> getIndividualHistoryObject() {
        return individualHistoryObject;
    }

    public void setIndividualHistoryObject(ArrayList<IndividualHistoryModel> individualHistoryObject) {
        this.individualHistoryObject = individualHistoryObject;
    }
}

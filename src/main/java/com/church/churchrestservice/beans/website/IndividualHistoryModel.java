package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class IndividualHistoryModel {
    private Date date;
    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

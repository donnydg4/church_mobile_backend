package com.church.churchrestservice.beans.calendar;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class CalendarEventsModel {
    private String imageUrl;
    private String title;
    private Date startDate;
    private Date endDate;
    private String location;
    private String time;
    private String description;
    private String type;
    private boolean featured;
    private String pdfResource;
    private String pdfResourceName;

    public String getPdfResourceName() {
        return pdfResourceName;
    }

    public void setPdfResourceName(String pdfResourceName) {
        this.pdfResourceName = pdfResourceName;
    }

    public String getPdfResource() {
        return pdfResource;
    }

    public void setPdfResource(String pdfResource) {
        this.pdfResource = pdfResource;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    @Override
    public String toString() {
        return "CalendarEventsModel{" +
                "imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", featured=" + featured +
                ", pdfResource='" + pdfResource + '\'' +
                ", pdfResourceName='" + pdfResourceName + '\'' +
                '}';
    }
}

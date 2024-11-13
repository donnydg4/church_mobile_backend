package com.church.churchrestservice.beans.website;

import com.church.churchrestservice.beans.calendar.CalendarEventsModel;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@NoArgsConstructor
@Document(value = "all_events")
public class MainEventsModel {
    private String coverPhoto;
    private String title;
    private ArrayList<CalendarEventsModel> events;

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<CalendarEventsModel> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<CalendarEventsModel> events) {
        this.events = events;
    }
}

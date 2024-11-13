package com.church.churchrestservice.beans.calendar;

import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@Document(value = "calendar")
public class CalendarModel {
    private Date date;
    private ArrayList<CalendarEventsModel> events;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<CalendarEventsModel> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<CalendarEventsModel> events) {
        this.events = events;
    }
}

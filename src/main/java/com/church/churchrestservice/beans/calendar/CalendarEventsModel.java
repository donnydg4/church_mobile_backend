package com.church.churchrestservice.beans.calendar;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class CalendarEventsModel {
    private String imageUrl;
    private String title;
    private Date date;
    private String location;
    private String time;
    private String description;
    private String type;
    private boolean featured;
}

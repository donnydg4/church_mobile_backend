package com.church.churchrestservice.beans.calendar;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "calendar")
public class CalendarModel {
    private Date date;
    private ArrayList<CalendarEventsModel> events;
}

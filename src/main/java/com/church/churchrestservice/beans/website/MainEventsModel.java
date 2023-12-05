package com.church.churchrestservice.beans.website;

import com.church.churchrestservice.beans.calendar.CalendarEventsModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "all_events")
public class MainEventsModel {
    private String coverPhoto;
    private String title;
    private ArrayList<CalendarEventsModel> events;
}

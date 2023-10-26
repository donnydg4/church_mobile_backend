package com.church.churchrestservice.beans;

import com.church.churchrestservice.beans.calendar.CalendarModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "all_website_information")
public class AllWebsiteInformationModel {
    @Id
    private String id;

    private SomeChurchWebsiteInformation allWebsiteInformation;
    private ArrayList<DisplayCardResponse> displayCards;
    private ArrayList<CalendarModel> allCalendarInformation;
    private ArrayList<MainEventsModel> mainEvents;
    private ArrayList<AllWatchCardsResponse> allWatchCards;
    private ArrayList<SeriesCardResponse> allSeriesCards;
}

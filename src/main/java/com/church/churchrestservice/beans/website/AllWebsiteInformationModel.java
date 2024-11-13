package com.church.churchrestservice.beans.website;

import com.church.churchrestservice.beans.calendar.CalendarModel;
import com.church.churchrestservice.beans.shared.*;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@NoArgsConstructor
@Document(value = "all_website_information")
public class AllWebsiteInformationModel {
    @Id
    private String id;

    private SomeChurchWebsiteInformation allWebsiteInformation;
    private ArrayList<DisplayCardResponse> displayCards;
    private MinistriesWeSupportModel ministriesWeSupportPage;
    private LeadershipModel leadershipPage;
    private OurMinistriesModel ourMinistriesPage;
    private MissionsModel missionsPage;
    private ArrayList<CalendarModel> allCalendarInformation;
    private MainEventsModel mainEvents;
    private ArrayList<AllWatchCardsResponse> allWatchCards;
    private ArrayList<SeriesCardResponse> allSeriesCards;
    private StatementOfFaithModel statementOfFaith;

    public StatementOfFaithModel getStatementOfFaith() {
        return statementOfFaith;
    }

    public ArrayList<SeriesCardResponse> getAllSeriesCards() {
        return allSeriesCards;
    }

    public ArrayList<AllWatchCardsResponse> getAllWatchCards() {
        return allWatchCards;
    }

    public MainEventsModel getMainEvents() {
        return mainEvents;
    }

    public ArrayList<CalendarModel> getAllCalendarInformation() {
        return allCalendarInformation;
    }

    public MissionsModel getMissionsPage() {
        return missionsPage;
    }

    public OurMinistriesModel getOurMinistriesPage() {
        return ourMinistriesPage;
    }

    public LeadershipModel getLeadershipPage() {
        return leadershipPage;
    }

    public MinistriesWeSupportModel getMinistriesWeSupportPage() {
        return ministriesWeSupportPage;
    }

    public ArrayList<DisplayCardResponse> getDisplayCards() {
        return displayCards;
    }

    public SomeChurchWebsiteInformation getAllWebsiteInformation() {
        return allWebsiteInformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAllWebsiteInformation(SomeChurchWebsiteInformation allWebsiteInformation) {
        this.allWebsiteInformation = allWebsiteInformation;
    }

    public void setDisplayCards(ArrayList<DisplayCardResponse> displayCards) {
        this.displayCards = displayCards;
    }

    public void setMinistriesWeSupportPage(MinistriesWeSupportModel ministriesWeSupportPage) {
        this.ministriesWeSupportPage = ministriesWeSupportPage;
    }

    public void setLeadershipPage(LeadershipModel leadershipPage) {
        this.leadershipPage = leadershipPage;
    }

    public void setOurMinistriesPage(OurMinistriesModel ourMinistriesPage) {
        this.ourMinistriesPage = ourMinistriesPage;
    }

    public void setMissionsPage(MissionsModel missionsPage) {
        this.missionsPage = missionsPage;
    }

    public void setAllCalendarInformation(ArrayList<CalendarModel> allCalendarInformation) {
        this.allCalendarInformation = allCalendarInformation;
    }

    public void setMainEvents(MainEventsModel mainEvents) {
        this.mainEvents = mainEvents;
    }

    public void setAllWatchCards(ArrayList<AllWatchCardsResponse> allWatchCards) {
        this.allWatchCards = allWatchCards;
    }

    public void setAllSeriesCards(ArrayList<SeriesCardResponse> allSeriesCards) {
        this.allSeriesCards = allSeriesCards;
    }

    public void setStatementOfFaith(StatementOfFaithModel statementOfFaith) {
        this.statementOfFaith = statementOfFaith;
    }
}

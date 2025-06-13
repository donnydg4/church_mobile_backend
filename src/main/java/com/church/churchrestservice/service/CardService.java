package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.app.AllChurchInformation;
import com.church.churchrestservice.beans.app.BasePageCardResponse;
import com.church.churchrestservice.beans.app.EventsAndActivities;
import com.church.churchrestservice.beans.app.SeriesAndMinistries;
import com.church.churchrestservice.beans.calendar.CalendarEventsModel;
import com.church.churchrestservice.beans.calendar.CalendarModel;
import com.church.churchrestservice.beans.shared.*;
import com.church.churchrestservice.beans.website.AllWebsiteInformationModel;
import com.church.churchrestservice.beans.website.MainEventsModel;
import com.church.churchrestservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

@Service
public class CardService {

    private DisplayCardRepository displayCardRepository;
    private BasePageCardRepository basePageCardRepository;
    private EventsAndActivitiesRepository eventsAndActivitiesRepository;
    private SeriesAndMinistriesRepository seriesAndMinistriesRepository;
    private AllWatchCardsRepository allWatchCardsRepository;
    private SeriesCardRepository seriesCardRepository;
    private AllChurchInformationRepository allChurchInformationRepository;
    //website
    private CalendarEventsRepository calendarEventsRepository;
    private AllEventsRepository allEventsRepository;
    private AllChurchWebsiteInformationRepository allChurchWebsiteInformationRepository;

    @Autowired
    public CardService(DisplayCardRepository displayCardRepository, BasePageCardRepository basePageCardRepository,
                       EventsAndActivitiesRepository eventsAndActivitiesRepository, SeriesAndMinistriesRepository seriesAndMinistriesRepository,
                       AllWatchCardsRepository allWatchCardsRepository, SeriesCardRepository seriesCardRepository, AllChurchInformationRepository allChurchInformationRepository, CalendarEventsRepository calendarEventsRepository,
                       AllEventsRepository allEventsRepository, AllChurchWebsiteInformationRepository allChurchWebsiteInformationRepository) {
        this.displayCardRepository = displayCardRepository;
        this.basePageCardRepository = basePageCardRepository;
        this.eventsAndActivitiesRepository = eventsAndActivitiesRepository;
        this.seriesAndMinistriesRepository = seriesAndMinistriesRepository;
        this.allWatchCardsRepository = allWatchCardsRepository;
        this.seriesCardRepository = seriesCardRepository;
        this.allChurchInformationRepository = allChurchInformationRepository;
        this.allEventsRepository = allEventsRepository;
        this.calendarEventsRepository = calendarEventsRepository;
        this.allChurchWebsiteInformationRepository = allChurchWebsiteInformationRepository;
    }

    public Flux<DisplayCardResponse> getAllDisplayCards() {
        return displayCardRepository.findAll();
    }

    public Flux<BasePageCardResponse> getAllBasePageCards() {
        return basePageCardRepository.findAll();
    }

    public Flux<EventsAndActivities> getAllEventsAndActivities() {
        return eventsAndActivitiesRepository.findAll();
    }

    public Flux<SeriesAndMinistries> getAllSeriesAndMinistries() {
        return seriesAndMinistriesRepository.findAll();
    }

    public Flux<AllWatchCardsResponse> getAllWatchCards() {
        return allWatchCardsRepository.findAll();
    }

    public Flux<SeriesCardResponse> getAllSeriesCards() {
        return seriesCardRepository.findAll();
    }

    public Mono<AllChurchInformation> getAllChurchInformation() {
        return allChurchInformationRepository.findById("1");
    }

    /// ////////WEBSITE

    public Flux<CalendarModel> getAllCalendarEvents() {
        return calendarEventsRepository.findAll();
    }

    public Flux<MainEventsModel> getAllEvents() {
        return allEventsRepository.findAll();
    }

    public void addWebsiteInformation(AllWebsiteInformationModel allWebsiteInformationModel) {

        //TODO: ALL OF THIS NEEDS TO BE MOVED TO A SEPARATE POST CALL along with the DATA modifications as this is very inefficient every time do to this.
        //create Display Cards list for each model
        ArrayList<DisplayCardResponse> ministriesArrayListCards = new ArrayList<>();
        ArrayList<DisplayCardResponse> leadershipArrayListCards = new ArrayList<>();
        ArrayList<DisplayCardResponse> ourMinistriesArrayListCards = new ArrayList<>();
        ArrayList<DisplayCardResponse> missionsArrayListCards = new ArrayList<>();

        //Sort the lists
        for (DisplayCardResponse displayCardResponse : allWebsiteInformationModel.getDisplayCards()) {
            if (displayCardResponse.getType().equals("OUR MINISTRY")) {
                ourMinistriesArrayListCards.add(displayCardResponse);
            }
            if (displayCardResponse.getType().equals("MISSIONS TRIP")) {
                missionsArrayListCards.add(displayCardResponse);
            }
            if (displayCardResponse.getType().equals("CHURCH LEADERSHIP")) {
                leadershipArrayListCards.add(displayCardResponse);
            }
            if (displayCardResponse.getType().equals("SUPPORTED MINISTRY")) {
                ministriesArrayListCards.add(displayCardResponse);
            }
        }

        //ministries we support
        MinistriesWeSupportModel ministriesWeSupportModel = new MinistriesWeSupportModel();
        ministriesWeSupportModel.setTitle(allWebsiteInformationModel.getMinistriesWeSupportPage().getTitle());
        ministriesWeSupportModel.setCoverPhoto(allWebsiteInformationModel.getMinistriesWeSupportPage().getCoverPhoto());
        ministriesWeSupportModel.setDisplayCards(ministriesArrayListCards);

        //leadership
        LeadershipModel leadershipModel = new LeadershipModel();
        leadershipModel.setTitle(allWebsiteInformationModel.getLeadershipPage().getTitle());
        leadershipModel.setCoverPhoto(allWebsiteInformationModel.getLeadershipPage().getCoverPhoto());
        leadershipModel.setDisplayCards(leadershipArrayListCards);

        //our ministries
        OurMinistriesModel ourMinistriesModel = new OurMinistriesModel();
        ourMinistriesModel.setTitle(allWebsiteInformationModel.getOurMinistriesPage().getTitle());
        ourMinistriesModel.setCoverPhoto(allWebsiteInformationModel.getOurMinistriesPage().getCoverPhoto());
        ourMinistriesModel.setDisplayCards(ourMinistriesArrayListCards);


        //Mission Trips
        MissionsModel missionsModel = new MissionsModel();
        missionsModel.setTitle(allWebsiteInformationModel.getMissionsPage().getTitle());
        missionsModel.setCoverPhoto(allWebsiteInformationModel.getMissionsPage().getCoverPhoto());
        missionsModel.setDisplayCards(missionsArrayListCards);

        //set AllChurchInformation for Display Cards
        allWebsiteInformationModel.setMinistriesWeSupportPage(ministriesWeSupportModel);
        allWebsiteInformationModel.setLeadershipPage(leadershipModel);
        allWebsiteInformationModel.setOurMinistriesPage(ourMinistriesModel);
        allWebsiteInformationModel.setMissionsPage(missionsModel);


        //set calendar events to have the same start date as the model it's in
        ArrayList<CalendarModel> allCalendarInformation;
        allCalendarInformation = allWebsiteInformationModel.getAllCalendarInformation();

        //change all the start date to be their parent start date regardless of what happens
        for (CalendarModel calendarModel : allCalendarInformation) {
            for (CalendarEventsModel calendarEventsModel : calendarModel.getEvents()) {
                calendarEventsModel.setStartDate(calendarModel.getDate());
            }
        }

        //TODO: maybe compare what's already in the series list of sermons to waht's currently in the allWatchCardsArray? Not sure yet.
        int dbAllWatchCardsCall = allChurchWebsiteInformationRepository.findById("1").block().getAllWatchCards().size();

        ArrayList<AllWatchCardsResponse> temporaryAllWatchCardsResponse = new ArrayList<>();
        ArrayList<AllWatchCardsResponse> temporaryAllWatchCardsResponse2 = new ArrayList<>(allWebsiteInformationModel.getAllWatchCards());
        if (dbAllWatchCardsCall != 0) {
            for (SeriesCardResponse seriesCardResponse : allWebsiteInformationModel.getAllSeriesCards()) {
                for (AllWatchCardsResponse mainWatchCard: allWebsiteInformationModel.getAllWatchCards()) {
                    for (AllWatchCardsResponse otherWatchCard: seriesCardResponse.getSermons()) {
                        if (mainWatchCard.getTitle().equals(otherWatchCard.getTitle())) {
                            temporaryAllWatchCardsResponse.add(mainWatchCard);
                        }
                    }
                }
            }
        }
        System.out.println(temporaryAllWatchCardsResponse.size());
        //okay so this works. I now have the 30 that aren't in the series list, which is great.
        temporaryAllWatchCardsResponse2.removeAll(temporaryAllWatchCardsResponse);
        System.out.println(temporaryAllWatchCardsResponse2.size());

        sortSermonsIntoSeries(allWebsiteInformationModel.getDisplayCards());

        allWebsiteInformationModel.setAllCalendarInformation(allCalendarInformation);
        allChurchWebsiteInformationRepository.save(allWebsiteInformationModel).block();
    }

    public Mono<AllWebsiteInformationModel> getAllWebsiteInformation() {
        return allChurchWebsiteInformationRepository.findById("1");
    }

    private void sortSermonsIntoSeries(ArrayList<DisplayCardResponse> displayCards) {


    }

}

package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.app.AllChurchInformation;
import com.church.churchrestservice.beans.app.BasePageCardResponse;
import com.church.churchrestservice.beans.app.EventsAndActivities;
import com.church.churchrestservice.beans.app.SeriesAndMinistries;
import com.church.churchrestservice.beans.calendar.CalendarModel;
import com.church.churchrestservice.beans.shared.*;
import com.church.churchrestservice.beans.website.AllWebsiteInformationModel;
import com.church.churchrestservice.beans.website.MainEventsModel;
import com.church.churchrestservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    ///////////WEBSITE

    public Flux<CalendarModel> getAllCalendarEvents() {
        return calendarEventsRepository.findAll();
    }

    public Flux<MainEventsModel> getAllEvents() {
        return allEventsRepository.findAll();
    }

    public void addWebsiteInformation(AllWebsiteInformationModel allWebsiteInformationModel) {

        //ministries we support
        MinistriesWeSupportModel ministriesWeSupportModel = new MinistriesWeSupportModel();
        ministriesWeSupportModel.setTitle(allWebsiteInformationModel.getMinistriesWeSupportPage().getTitle());
        ministriesWeSupportModel.setCoverPhoto(allWebsiteInformationModel.getMinistriesWeSupportPage().getCoverPhoto());
        ministriesWeSupportModel.setDisplayCards(allWebsiteInformationModel.getDisplayCards());

        //leadership
        LeadershipModel leadershipModel = new LeadershipModel();
        leadershipModel.setTitle(allWebsiteInformationModel.getLeadershipPage().getTitle());
        leadershipModel.setCoverPhoto(allWebsiteInformationModel.getLeadershipPage().getCoverPhoto());
        leadershipModel.setDisplayCards(allWebsiteInformationModel.getDisplayCards());

        //our ministries
        OurMinistriesModel ourMinistriesModel = new OurMinistriesModel();
        ourMinistriesModel.setTitle(allWebsiteInformationModel.getOurMinistriesPage().getTitle());
        ourMinistriesModel.setCoverPhoto(allWebsiteInformationModel.getOurMinistriesPage().getCoverPhoto());
        ourMinistriesModel.setDisplayCards(allWebsiteInformationModel.getDisplayCards());

        //Businesses We Support
        BusinessesWeSupportModel businessesWeSupportModel = new BusinessesWeSupportModel();
        businessesWeSupportModel.setTitle(allWebsiteInformationModel.getBusinessesWeSupportPage().getTitle());
        businessesWeSupportModel.setCoverPhoto(allWebsiteInformationModel.getBusinessesWeSupportPage().getCoverPhoto());
        businessesWeSupportModel.setDisplayCards(allWebsiteInformationModel.getDisplayCards());

        //Mission Trips
        MissionsModel missionsModel = new MissionsModel();
        missionsModel.setTitle(allWebsiteInformationModel.getMissionsPage().getTitle());
        missionsModel.setCoverPhoto(allWebsiteInformationModel.getMissionsPage().getCoverPhoto());
        missionsModel.setDisplayCards(allWebsiteInformationModel.getDisplayCards());

        //set AllChurchInformation
        allWebsiteInformationModel.setMinistriesWeSupportPage(ministriesWeSupportModel);
        allWebsiteInformationModel.setLeadershipPage(leadershipModel);
        allWebsiteInformationModel.setOurMinistriesPage(ourMinistriesModel);
        allWebsiteInformationModel.setMissionsPage(missionsModel);
        allWebsiteInformationModel.setBusinessesWeSupportPage(businessesWeSupportModel);

        allChurchWebsiteInformationRepository.save(allWebsiteInformationModel).block();
    }

    public Mono<AllWebsiteInformationModel> getAllWebsiteInformation() {
        return allChurchWebsiteInformationRepository.findById("1");
    }

}

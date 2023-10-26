package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.*;
import com.church.churchrestservice.beans.app.BasePageCardResponse;
import com.church.churchrestservice.beans.app.EventsAndActivities;
import com.church.churchrestservice.beans.app.SeriesAndMinistries;
import com.church.churchrestservice.beans.calendar.CalendarModel;
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
        allChurchWebsiteInformationRepository.save(allWebsiteInformationModel).block();
    }

    public Mono<AllWebsiteInformationModel> getAllWebsiteInformation() {
        return allChurchWebsiteInformationRepository.findById("1");
    }

}

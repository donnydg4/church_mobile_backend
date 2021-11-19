package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.*;
import com.church.churchrestservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private DisplayCardRepository displayCardRepository;
    private BasePageCardRepository basePageCardRepository;
    private EventsAndActivitiesRepository eventsAndActivitiesRepository;
    private SeriesAndMinistriesRepository seriesAndMinistriesRepository;
    private AllWatchCardsRepository allWatchCardsRepository;
    private SeriesCardRepository seriesCardRepository;

    @Autowired
    public CardService(DisplayCardRepository displayCardRepository, BasePageCardRepository basePageCardRepository,
                        EventsAndActivitiesRepository eventsAndActivitiesRepository, SeriesAndMinistriesRepository seriesAndMinistriesRepository,
                       AllWatchCardsRepository allWatchCardsRepository, SeriesCardRepository seriesCardRepository) {
        this.displayCardRepository = displayCardRepository;
        this.basePageCardRepository = basePageCardRepository;
        this.eventsAndActivitiesRepository = eventsAndActivitiesRepository;
        this.seriesAndMinistriesRepository = seriesAndMinistriesRepository;
        this.allWatchCardsRepository = allWatchCardsRepository;
        this.seriesCardRepository = seriesCardRepository;
    }

    public List<DisplayCardResponse> getAllDisplayCards() {
        return displayCardRepository.findAll();
    }

    public List<BasePageCardResponse> getAllBasePageCards() {
        return basePageCardRepository.findAll();
    }

    public List<EventsAndActivities> getAllEventsAndActivities() { return eventsAndActivitiesRepository.findAll(); }

    public List<SeriesAndMinistries> getAllSeriesAndMinistries() { return seriesAndMinistriesRepository.findAll(); }

    public List<AllWatchCardsResponse> getAllWatchCards() { return allWatchCardsRepository.findAll(); }

    public List<SeriesCardResponse> getAllSeriesCards() { return seriesCardRepository.findAll(); }

}

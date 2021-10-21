package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.BasePageCardResponse;
import com.church.churchrestservice.beans.DisplayCardResponse;
import com.church.churchrestservice.beans.EventsAndActivities;
import com.church.churchrestservice.beans.SeriesAndMinistries;
import com.church.churchrestservice.repository.BasePageCardRepository;
import com.church.churchrestservice.repository.DisplayCardRepository;
import com.church.churchrestservice.repository.EventsAndActivitiesRepository;
import com.church.churchrestservice.repository.SeriesAndMinistriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private DisplayCardRepository displayCardRepository;
    private BasePageCardRepository basePageCardRepository;
    private EventsAndActivitiesRepository eventsAndActivitiesRepository;
    private SeriesAndMinistriesRepository seriesAndMinistriesRepository;

    @Autowired
    public CardService(DisplayCardRepository displayCardRepository, BasePageCardRepository basePageCardRepository,
                        EventsAndActivitiesRepository eventsAndActivitiesRepository, SeriesAndMinistriesRepository seriesAndMinistriesRepository) {
        this.displayCardRepository = displayCardRepository;
        this.basePageCardRepository = basePageCardRepository;
        this.eventsAndActivitiesRepository = eventsAndActivitiesRepository;
        this.seriesAndMinistriesRepository = seriesAndMinistriesRepository;
    }

    public List<DisplayCardResponse> getAllDisplayCards() {
        return displayCardRepository.findAll();
    }

    public List<BasePageCardResponse> getAllBasePageCards() {
        return basePageCardRepository.findAll();
    }

    public List<EventsAndActivities> getAllEventsAndActivities() { return eventsAndActivitiesRepository.findAll(); }

    public List<SeriesAndMinistries> getAllSeriesAndMinistries() { return seriesAndMinistriesRepository.findAll(); }

}

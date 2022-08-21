package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.*;
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
    private YearSelectionRepository yearSelectionRepository;
    private AllChurchInformationRepository allChurchInformationRepository;
    private SeriesSelectionRepository seriesSelectionRepository;

    @Autowired
    public CardService(DisplayCardRepository displayCardRepository, BasePageCardRepository basePageCardRepository,
                       EventsAndActivitiesRepository eventsAndActivitiesRepository, SeriesAndMinistriesRepository seriesAndMinistriesRepository,
                       AllWatchCardsRepository allWatchCardsRepository, SeriesCardRepository seriesCardRepository,
                       YearSelectionRepository yearSelectionRepository, AllChurchInformationRepository allChurchInformationRepository,
                       SeriesSelectionRepository seriesSelectionRepository) {
        this.displayCardRepository = displayCardRepository;
        this.basePageCardRepository = basePageCardRepository;
        this.eventsAndActivitiesRepository = eventsAndActivitiesRepository;
        this.seriesAndMinistriesRepository = seriesAndMinistriesRepository;
        this.allWatchCardsRepository = allWatchCardsRepository;
        this.seriesCardRepository = seriesCardRepository;
        this.yearSelectionRepository = yearSelectionRepository;
        this.allChurchInformationRepository = allChurchInformationRepository;
        this.seriesSelectionRepository = seriesSelectionRepository;
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

    public Flux<YearSelection> getAllYearSelections() {
        return yearSelectionRepository.findAll();
    }

    public Flux<SeriesSelection> getAllSeriesOrNonSeriesSelection() {
        return seriesSelectionRepository.findAll();
    }

    public Mono<AllChurchInformation> getAllChurchInformation() {
        return allChurchInformationRepository.findById("1");
    }
}

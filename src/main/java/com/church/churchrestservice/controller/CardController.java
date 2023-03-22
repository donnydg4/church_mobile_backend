package com.church.churchrestservice.controller;


import com.church.churchrestservice.beans.*;
import com.church.churchrestservice.beans.calendar.CalendarModel;
import com.church.churchrestservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@CrossOrigin
@RestController
@RequestMapping(value = "/church")
public class CardController {


    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping(value = "/displayCards")
    public Flux<DisplayCardResponse> getAllDisplayCards() {
        return cardService.getAllDisplayCards();
    }

    @GetMapping(value = "/basePageCards")
    public Flux<BasePageCardResponse> getAllBaseCards() {
        return cardService.getAllBasePageCards();
    }

    @GetMapping(value = "/seriesAndMinistries")
    public Flux<SeriesAndMinistries> getAllSeriesAndMinistries() {
        return cardService.getAllSeriesAndMinistries();
    }

    @GetMapping(value = "/eventsAndActivities")
    public Flux<EventsAndActivities> getAllEventsAndActivities() {
        return cardService.getAllEventsAndActivities();
    }

    @GetMapping(value = "/watchCards")
    public Flux<AllWatchCardsResponse> getAllWatchCards() {
        return cardService.getAllWatchCards();
    }

    @GetMapping(value = "/seriesCards")
    public Flux<SeriesCardResponse> getAllSeriesCards() {
        return cardService.getAllSeriesCards();
    }

    @GetMapping(value = "/yearSelectionCards")
    public Flux<YearSelection> getAllYearSelectionCards() {
        return cardService.getAllYearSelections();
    }

    @GetMapping(value = "/seriesSelectionCards")
    public Flux<SeriesSelection> getAllSeriesOrNonSeriesCards() {
        return cardService.getAllSeriesOrNonSeriesSelection();
    }

    @GetMapping(value = "/allChurchInformation")
    public Mono<AllChurchInformation> getAllChurchInformation() {
        return cardService.getAllChurchInformation();
    }

    @GetMapping(value = "/website/events")
    public Flux<MainEventsModel> getAllEvents() {
        return cardService.getAllEvents();
    }

    @GetMapping(value = "/website/calendar")
    public Flux<CalendarModel> getAllCalendarEvents() {
        return cardService.getAllCalendarEvents();
    }
}


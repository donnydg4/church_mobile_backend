package com.church.churchrestservice.controller;


import com.church.churchrestservice.beans.app.AllChurchInformation;
import com.church.churchrestservice.beans.app.BasePageCardResponse;
import com.church.churchrestservice.beans.app.EventsAndActivities;
import com.church.churchrestservice.beans.app.SeriesAndMinistries;
import com.church.churchrestservice.beans.calendar.CalendarModel;
import com.church.churchrestservice.beans.shared.AllWatchCardsResponse;
import com.church.churchrestservice.beans.shared.DisplayCardResponse;
import com.church.churchrestservice.beans.shared.SeriesCardResponse;
import com.church.churchrestservice.beans.website.AllWebsiteInformationModel;
import com.church.churchrestservice.beans.website.MainEventsModel;
import com.church.churchrestservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    private Flux<DisplayCardResponse> getAllDisplayCards() {
        return cardService.getAllDisplayCards();
    }

    @GetMapping(value = "/basePageCards")
    private Flux<BasePageCardResponse> getAllBaseCards() {
        return cardService.getAllBasePageCards();
    }

    @GetMapping(value = "/seriesAndMinistries")
    private Flux<SeriesAndMinistries> getAllSeriesAndMinistries() {
        return cardService.getAllSeriesAndMinistries();
    }

    @GetMapping(value = "/eventsAndActivities")
    private Flux<EventsAndActivities> getAllEventsAndActivities() {
        return cardService.getAllEventsAndActivities();
    }

    @GetMapping(value = "/watchCards")
    private Flux<AllWatchCardsResponse> getAllWatchCards() {
        return cardService.getAllWatchCards();
    }

    @GetMapping(value = "/seriesCards")
    private Flux<SeriesCardResponse> getAllSeriesCards() {
        return cardService.getAllSeriesCards();
    }

    @GetMapping(value = "/allChurchInformation")
    private Mono<AllChurchInformation> getAllChurchInformation() {
        return cardService.getAllChurchInformation();
    }


    /////////////////// Website
    @GetMapping(value = "/website/events")
    private Flux<MainEventsModel> getAllEvents() {
        return cardService.getAllEvents();
    }

    @GetMapping(value = "/website/calendar")
    private Flux<CalendarModel> getAllCalendarEvents() {
        return cardService.getAllCalendarEvents();
    }

    @PostMapping(value = "/website/add")
    private void addObject(@RequestBody AllWebsiteInformationModel allWebsiteInformationModel) {
        cardService.addWebsiteInformation(allWebsiteInformationModel);
    }

    @GetMapping(value = "/website/allWebsiteInformation")
    private Mono<AllWebsiteInformationModel> getAllWebsiteChurchInformation() {
        return cardService.getAllWebsiteInformation();
    }

}


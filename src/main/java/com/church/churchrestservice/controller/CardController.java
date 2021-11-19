package com.church.churchrestservice.controller;


import com.church.churchrestservice.beans.*;
import com.church.churchrestservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/church")
public class CardController {


    private CardService cardService;

    @Autowired
    public CardController (CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping(value = "/displayCards")
    public ResponseEntity<List<DisplayCardResponse>> getAllDisplayCards() {
        return new ResponseEntity<>(cardService.getAllDisplayCards(), HttpStatus.OK);
    }

    @GetMapping(value = "/basePageCards")
    public ResponseEntity<List<BasePageCardResponse>> getAllBaseCards() {
        return new ResponseEntity<>(cardService.getAllBasePageCards(), HttpStatus.OK);
    }

    @GetMapping(value = "/seriesAndMinistries")
    public ResponseEntity<List<SeriesAndMinistries>> getAllSeriesAndMinistries() {
        return new ResponseEntity<>(cardService.getAllSeriesAndMinistries(), HttpStatus.OK);
    }

    @GetMapping(value = "/eventsAndActivities")
    public ResponseEntity<List<EventsAndActivities>> getAllEventsAndActivities() {
        return new ResponseEntity<>(cardService.getAllEventsAndActivities(), HttpStatus.OK);
    }

    @GetMapping(value = "/watchCards")
    public ResponseEntity<List<AllWatchCardsResponse>> getAllWatchCards() {
        return new ResponseEntity<>(cardService.getAllWatchCards(), HttpStatus.OK);
    }

    @GetMapping(value = "/seriesCards")
    public ResponseEntity<List<SeriesCardResponse>> getAllSeriesCards() {
        return new ResponseEntity<>(cardService.getAllSeriesCards(), HttpStatus.OK);
    }
}


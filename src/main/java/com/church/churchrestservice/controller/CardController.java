package com.church.churchrestservice.controller;


import com.church.churchrestservice.beans.BasePageCardResponse;
import com.church.churchrestservice.beans.DisplayCardResponse;
import com.church.churchrestservice.beans.EventsAndActivities;
import com.church.churchrestservice.beans.SeriesAndMinistries;
import com.church.churchrestservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/church")
@CrossOrigin
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
}


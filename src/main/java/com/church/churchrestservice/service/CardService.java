package com.church.churchrestservice.service;

import com.church.churchrestservice.beans.app.AllChurchInformation;
import com.church.churchrestservice.beans.app.BasePageCardResponse;
import com.church.churchrestservice.beans.app.EventsAndActivities;
import com.church.churchrestservice.beans.app.SeriesAndMinistries;
import com.church.churchrestservice.beans.calendar.CalendarEventsModel;
import com.church.churchrestservice.beans.calendar.CalendarModel;
import com.church.churchrestservice.beans.shared.*;
import com.church.churchrestservice.beans.website.AllWebsiteInformationModel;
import com.church.churchrestservice.beans.website.AppConfig;
import com.church.churchrestservice.beans.website.MainEventsModel;
import com.church.churchrestservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

        allWebsiteInformationModel.setAppConfig(allWebsiteInformationModel.getAppConfig());

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

        //Worship Page
        WorshipPageModel worshipPageModel = new WorshipPageModel();
        worshipPageModel.setVideoUrl(allWebsiteInformationModel.getWorshipPage().getVideoUrl());
        worshipPageModel.setWorshipPageTitle(allWebsiteInformationModel.getWorshipPage().getWorshipPageTitle());
        worshipPageModel.setAudioTitle(allWebsiteInformationModel.getWorshipPage().getAudioTitle());
        worshipPageModel.setAudioImg(allWebsiteInformationModel.getWorshipPage().getAudioImg());
        worshipPageModel.setVideoTitle(allWebsiteInformationModel.getWorshipPage().getVideoTitle());
        worshipPageModel.setMusicVideosImageUrls(allWebsiteInformationModel.getWorshipPage().getMusicVideosImageUrls());
        worshipPageModel.setAudioFiles(allWebsiteInformationModel.getWorshipPage().getAudioFiles());

        allWebsiteInformationModel.setWorshipPage(worshipPageModel);

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
        ArrayList<AllWatchCardsResponse> dbAllWatchCardsCall = Objects.requireNonNull(allChurchWebsiteInformationRepository.findById("1").block()).getAllWatchCards();
        ArrayList<SeriesCardResponse> dbAllSeriesCardsCallList = Objects.requireNonNull(allChurchWebsiteInformationRepository.findById("1").block()).getAllSeriesCards();

        System.out.println(dbAllWatchCardsCall.size()); //134

        ArrayList<AllWatchCardsResponse> watchCardsThatAreINSeriesORAllWatchCards = new ArrayList<>();

        if (dbAllWatchCardsCall != null && dbAllWatchCardsCall.size() > 0) {
            if (dbAllSeriesCardsCallList != null && dbAllSeriesCardsCallList.size() > 0) {
                for (SeriesCardResponse seriesCardResponse : dbAllSeriesCardsCallList) {
                    for (AllWatchCardsResponse mainWatchCard : allWebsiteInformationModel.getAllWatchCards()) {
                        for (AllWatchCardsResponse otherWatchCard : seriesCardResponse.getSermons()) {
                            if (mainWatchCard.getTitle().equals(otherWatchCard.getTitle())) {
                                watchCardsThatAreINSeriesORAllWatchCards.add(mainWatchCard);
                            }
                        }
                    }
                }
                //okay so this works. I now have the 30 that aren't in the series list, which is great.
                dbAllWatchCardsCall.removeAll(watchCardsThatAreINSeriesORAllWatchCards);
            }
        } else {
            watchCardsThatAreINSeriesORAllWatchCards.addAll(dbAllWatchCardsCall);
        }

        System.out.println(watchCardsThatAreINSeriesORAllWatchCards); // should contain 110

        //loop through the leftover sermons and store into hashmap of card, value
        HashMap<AllWatchCardsResponse, String> sermonsThatCanBeASeriesCardHashMap = new HashMap<>();
        for (AllWatchCardsResponse allWatchCardsResponse : dbAllWatchCardsCall) {
            for (String result : allWebsiteInformationModel.getAppConfig().getSeriesNames()) {
                if (allWatchCardsResponse.getTitle().contains(result)) {
                    sermonsThatCanBeASeriesCardHashMap.put(allWatchCardsResponse, result);
                }
            }
        }

        ArrayList<AllWatchCardsResponse> finalWatchCardsArrayList = new ArrayList<>(sermonsThatCanBeASeriesCardHashMap.keySet());

        if (!finalWatchCardsArrayList.isEmpty()) {

            //TODO: SORT the arraylist that has the difference between the 2 + sort the appconfig
            finalWatchCardsArrayList.sort(Comparator.comparing(AllWatchCardsResponse::getTitle));
            Collections.sort(allWebsiteInformationModel.getAppConfig().getSeriesNames());
            System.out.println(allWebsiteInformationModel.getAppConfig().getSeriesNames());
            ArrayList<SeriesCardResponse> seriesCardResponseArrayList = new ArrayList<>();

            for (int i = 0; i < allWebsiteInformationModel.getAppConfig().getSeriesNames().size(); i++) {
                String seriesName = allWebsiteInformationModel.getAppConfig().getSeriesNames().get(i);
                String seriesImageUrl = allWebsiteInformationModel.getAppConfig().getSeriesImageUrls().get(i);
                SeriesCardResponse seriesCardResponse = new SeriesCardResponse();
                ArrayList<AllWatchCardsResponse> allWatchCardsResponseArrayList = new ArrayList<>();
                for (int j = 0; j < finalWatchCardsArrayList.size(); j++) {
                    if (finalWatchCardsArrayList.get(j).getTitle().contains(allWebsiteInformationModel.getAppConfig().getSeriesNames().get(i))) {
                        allWatchCardsResponseArrayList.add(finalWatchCardsArrayList.get(j));
                    }
                }
                seriesCardResponse.setImageUrl(seriesImageUrl);
                seriesCardResponse.setTitle(seriesName);
                seriesCardResponse.setCategory("series");
                seriesCardResponse.setType("series");
                seriesCardResponse.setSermons(allWatchCardsResponseArrayList);
                Instant dateFromList = allWatchCardsResponseArrayList.stream().map(AllWatchCardsResponse::getDate).findFirst().get();
                seriesCardResponse.setDate(dateFromList);
                seriesCardResponseArrayList.add(seriesCardResponse);
            }
            allWebsiteInformationModel.setAllSeriesCards(seriesCardResponseArrayList);
        }

        allWebsiteInformationModel.setAllCalendarInformation(allCalendarInformation);
        allChurchWebsiteInformationRepository.save(allWebsiteInformationModel).block();
    }

    public Mono<AllWebsiteInformationModel> getAllWebsiteInformation() {
        return allChurchWebsiteInformationRepository.findById("1");
    }

}

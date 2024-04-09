package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class HomePage {
    private String homePageTitle;
    private String videoUrl;
    private String serviceTimesTitle;
    private String serviceTimes;
    private String whoWeAreTitle;
    private String whoWeAreDescription;
    private String whoWeAreImageUrl;
    private String newHereTitle;
    private String newHereDescription;
    private String newHereImageUrl;
    private ArrayList<WaysToEngageModel> waysToEngage;
    private ArrayList<String> monthlyEvents;
}

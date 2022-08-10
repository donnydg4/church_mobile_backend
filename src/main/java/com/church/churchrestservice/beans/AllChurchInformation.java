package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "all_church_information")
public class AllChurchInformation {

    private ArrayList<String> serviceTimes;
    private String welcomeString;
    private ArrayList<String> whatToExpect;
    private ConnectInfo connectInfo;
    private GiveInfo giveInfo;
    private PrayerInfo prayerInfo;
    private AboutTheChurch aboutTheChurch;
}

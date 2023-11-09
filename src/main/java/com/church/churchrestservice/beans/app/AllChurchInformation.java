package com.church.churchrestservice.beans.app;

import com.church.churchrestservice.beans.shared.PrayerInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "all_church_information")
public class AllChurchInformation {

    @Id
    private String id;

    private ArrayList<String> whatToExpect;
    private ServiceInfo serviceInfo;
    private ConnectInfo connectInfo;
    private GiveInfo giveInfo;
    private PrayerInfo prayerInfo;
    private AboutTheChurch aboutUs;
}

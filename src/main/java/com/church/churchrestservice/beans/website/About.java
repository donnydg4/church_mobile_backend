package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class About {
    private String crazyForJesusImage;
    private ArrayList<String> crazyForJesus;
    private ArrayList<String> missionVisionTargetTitles;
    private ArrayList<String> missionVisionTargetDescriptions;
    private ArrayList<String> coreValues;
    private ArrayList<String> declarations;
}

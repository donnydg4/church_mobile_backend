package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class OurChurch {
    private String coverPhoto;
    private String title;
    private ArrayList<String> ourMission;
    private ArrayList<String> ourVision;
    private ArrayList<String> ourTarget;
    private ArrayList<String> coreValues;
    //TODO: Figure out what to have here
}

package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class About {
    private ArrayList<String> crazyForJesus;
    private ArrayList<String> ourMission;
    private ArrayList<String> ourVision;
    private ArrayList<String> ourTarget;
    private ArrayList<String> coreValues;
    private ArrayList<String> declarations;
}

package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ChurchInfo {
    private String title;
    private ArrayList<String> descriptions;
    private ArrayList<String> missionVisionTargetTitles;
    private ArrayList<String> missionVisionTarget;
}

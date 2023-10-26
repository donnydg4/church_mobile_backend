package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class HomePage {
    private String videoUrl;
    private ArrayList<String> whoWeAre;
    private ArrayList<String> newHere;
    private ArrayList<String> getApp;
}

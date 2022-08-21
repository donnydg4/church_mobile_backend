package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class AboutTheChurch {
    private String imageUrl;
    private ArrayList<String> titles;
    private ArrayList<String> descriptions;
    private String coreValuesTitle;
    private ArrayList<String> coreValues;
}

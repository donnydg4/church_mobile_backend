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
    private History history;
    private About about;
    private Belief beliefs;

    //TODO: Figure out what to have here
}

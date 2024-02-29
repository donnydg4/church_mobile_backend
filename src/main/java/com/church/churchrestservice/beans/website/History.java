package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class History {
    private String title;
    private String subTitle;
    private ArrayList<IndividualHistoryModel> individualHistoryObject;
}

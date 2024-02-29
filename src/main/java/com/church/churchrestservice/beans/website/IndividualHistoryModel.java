package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class IndividualHistoryModel {
    private Date date;
    private String title;
    private String description;
}

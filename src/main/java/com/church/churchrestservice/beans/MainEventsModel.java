package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "all_events")
public class MainEventsModel {
    private String imageUrl;
    private String title;
    private String description;
    private String type;
    private Date date;
}

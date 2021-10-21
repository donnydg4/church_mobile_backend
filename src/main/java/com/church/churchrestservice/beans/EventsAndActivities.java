package com.church.churchrestservice.beans;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "events_activities")
public class EventsAndActivities {

    @Id
    private String id;

    private String title;
    private String description;
}

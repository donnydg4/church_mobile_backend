package com.church.churchrestservice.beans.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "sermons_devotionals_speakers_cards")
public class AllWatchCardsResponse {

    private String type;
    private String imageUrl;
    private String title;
    private String category;
    private String videoId;
    private String description;
    private Date date;

}

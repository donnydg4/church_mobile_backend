package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "series_cards")
public class SeriesCardResponse {

    private String type;
    private String imageUrl;
    private String title;
    private String category;
    private ArrayList<AllWatchCardsResponse> sermons;
}

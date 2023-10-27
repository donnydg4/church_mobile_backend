package com.church.churchrestservice.beans.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document("displaycards")
public class DisplayCardResponse {

    @Id
    private String id;

    private ArrayList<String> imageUrl;
    private String title;
    private String description;
    private Date startDate;
    private String category;
    private String type;
    private boolean learnMore;
    private Date endDate;
}

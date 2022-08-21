package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "year_selection")
public class YearSelection {

    private int year;
    private String imageUrl;
    private String category;
}

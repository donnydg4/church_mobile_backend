package com.church.churchrestservice.beans.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "series_or_not_devotionals")
public class SeriesSelection {

    private String imageUrl;
    private String category;
    private Boolean series;
    private String title;
}

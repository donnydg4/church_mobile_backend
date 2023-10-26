package com.church.churchrestservice.beans.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(value = "allpagecards")
public class BasePageCardResponse {

    private String type;
    private String imageUrl;
    private String title;
    private String category;
}

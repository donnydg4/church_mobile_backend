package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@Document(value = "series_cards")
public class SeriesCardResponse {

    private String type;
    private String imageUrl;
    private String title;
    private String category;
    private Date date;
    private ArrayList<AllWatchCardsResponse> sermons;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<AllWatchCardsResponse> getSermons() {
        return sermons;
    }

    public void setSermons(ArrayList<AllWatchCardsResponse> sermons) {
        this.sermons = sermons;
    }
}

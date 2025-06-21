package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class AppConfig {

    private ArrayList<String> seriesNames;
    private ArrayList<String> seriesImageUrls;

    public ArrayList<String> getSeriesNames() {
        return seriesNames;
    }

    public void setSeriesNames(ArrayList<String> seriesNames) {
        this.seriesNames = seriesNames;
    }

    public ArrayList<String> getSeriesImageUrls() {
        return seriesImageUrls;
    }

    public void setSeriesImageUrls(ArrayList<String> seriesImageUrls) {
        this.seriesImageUrls = seriesImageUrls;
    }
}

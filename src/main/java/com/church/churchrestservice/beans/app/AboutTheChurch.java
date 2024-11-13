package com.church.churchrestservice.beans.app;

import lombok.NoArgsConstructor;

import java.util.ArrayList;


@NoArgsConstructor
public class AboutTheChurch {
  private String imageUrl;
  private ArrayList<String> titles;
  private ArrayList<String> descriptions;
  private String coreValuesTitle;
  private ArrayList<String> coreValues;

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ArrayList<String> getTitles() {
    return titles;
  }

  public void setTitles(ArrayList<String> titles) {
    this.titles = titles;
  }

  public ArrayList<String> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(ArrayList<String> descriptions) {
    this.descriptions = descriptions;
  }

  public String getCoreValuesTitle() {
    return coreValuesTitle;
  }

  public void setCoreValuesTitle(String coreValuesTitle) {
    this.coreValuesTitle = coreValuesTitle;
  }

  public ArrayList<String> getCoreValues() {
    return coreValues;
  }

  public void setCoreValues(ArrayList<String> coreValues) {
    this.coreValues = coreValues;
  }
}

package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PrayerInfo {
  private String imageUrl;
  private String title;
  private String description;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PrayerInfo {

    private String imageUrl;
    private String title;
    private String description;
}

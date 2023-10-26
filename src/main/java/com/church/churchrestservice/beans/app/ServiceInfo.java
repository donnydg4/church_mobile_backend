package com.church.churchrestservice.beans.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ServiceInfo {
    private String imageUrl;
    private ArrayList<String> services;
    private String welcomeDescription;
    private String anotherTitle;
    private ArrayList<String> servicesExpect;
    private String endDescription;
}

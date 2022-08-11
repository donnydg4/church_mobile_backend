package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ConnectInfo {

    private String imageUrl;
    private String address;
    private String phoneNumber;
    private String websiteUrl;
}

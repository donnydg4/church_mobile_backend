package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DirectionsModel {
    private String title;
    private AddressModel address;
}

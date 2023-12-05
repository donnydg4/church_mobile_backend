package com.church.churchrestservice.beans.website;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressModel {
    private String streetName;
    private String cityStateZip;
    private String phoneNumber;
}

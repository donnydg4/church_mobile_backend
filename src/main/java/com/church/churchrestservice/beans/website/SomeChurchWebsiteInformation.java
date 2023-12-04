package com.church.churchrestservice.beans.website;

import com.church.churchrestservice.beans.app.ServiceInfo;
import com.church.churchrestservice.beans.shared.PrayerInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SomeChurchWebsiteInformation {
    private HomePage homePage;
    private OurChurch ourChurch;
    private ServiceInfo serviceInfo;
    private PrayerInfo prayerInfo;
    private DirectionsModel directions;
}

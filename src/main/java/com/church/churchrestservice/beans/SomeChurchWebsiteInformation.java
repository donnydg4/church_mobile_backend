package com.church.churchrestservice.beans;

import com.church.churchrestservice.beans.app.ServiceInfo;
import com.church.churchrestservice.beans.website.HomePage;
import com.church.churchrestservice.beans.website.OurChurch;
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
}

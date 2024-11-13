package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Emergency {
    private boolean isEmergency;
    private String title;

    public boolean isEmergency() {
        return isEmergency;
    }

    public void setEmergency(boolean emergency) {
        isEmergency = emergency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

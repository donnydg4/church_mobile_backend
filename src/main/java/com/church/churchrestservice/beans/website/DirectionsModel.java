package com.church.churchrestservice.beans.website;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DirectionsModel {
    private String title;
    private String imageUrl;
    private AddressModel address;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
}

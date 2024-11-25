package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SozoPageModel {
    private String firstImage;
    private String firstImageTitle;
    private String textBreak;

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getFirstImageTitle() {
        return firstImageTitle;
    }

    public void setFirstImageTitle(String firstImageTitle) {
        this.firstImageTitle = firstImageTitle;
    }

    public String getTextBreak() {
        return textBreak;
    }

    public void setTextBreak(String textBreak) {
        this.textBreak = textBreak;
    }
}

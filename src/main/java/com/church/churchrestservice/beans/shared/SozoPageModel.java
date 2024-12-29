package com.church.churchrestservice.beans.shared;

import com.church.churchrestservice.beans.website.SozoInfo;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class SozoPageModel {
    private String firstImage;
    private String firstImageTitle;
    private String textBreak;
    private String textBreakTwo;
    private String imageOne;
    private ArrayList<String> imageOneText;
    private String imageTwo;
    private ArrayList<String> imageTwoText;
    private String imageThree;
    private ArrayList<String> imageThreeText;
    private ArrayList<SozoInfo> sozoInfos;
    private String lastTextBreak;

    public String getLastTextBreak() {
        return lastTextBreak;
    }

    public void setLastTextBreak(String lastTextBreak) {
        this.lastTextBreak = lastTextBreak;
    }

    public ArrayList<SozoInfo> getSozoInfos() {
        return sozoInfos;
    }

    public void setSozoInfos(ArrayList<SozoInfo> sozoInfos) {
        this.sozoInfos = sozoInfos;
    }

    public String getTextBreakTwo() {
        return textBreakTwo;
    }

    public void setTextBreakTwo(String textBreakTwo) {
        this.textBreakTwo = textBreakTwo;
    }

    public String getImageOne() {
        return imageOne;
    }

    public void setImageOne(String imageOne) {
        this.imageOne = imageOne;
    }

    public ArrayList<String> getImageOneText() {
        return imageOneText;
    }

    public void setImageOneText(ArrayList<String> imageOneText) {
        this.imageOneText = imageOneText;
    }

    public String getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo;
    }

    public ArrayList<String> getImageTwoText() {
        return imageTwoText;
    }

    public void setImageTwoText(ArrayList<String> imageTwoText) {
        this.imageTwoText = imageTwoText;
    }

    public String getImageThree() {
        return imageThree;
    }

    public void setImageThree(String imageThree) {
        this.imageThree = imageThree;
    }

    public ArrayList<String> getImageThreeText() {
        return imageThreeText;
    }

    public void setImageThreeText(ArrayList<String> imageThreeText) {
        this.imageThreeText = imageThreeText;
    }

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

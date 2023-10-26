package com.church.churchrestservice.beans.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class GiveInfo {

    private String imageUrl;
    private String bigTitle;
    private ArrayList<String> titles;
    private ArrayList<String> foundations;
    private ArrayList<String> tithing;
    private ArrayList<String> giving;
}

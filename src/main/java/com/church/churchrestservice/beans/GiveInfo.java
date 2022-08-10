package com.church.churchrestservice.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class GiveInfo {

    private ArrayList<String> title;
    private ArrayList<String> foundations;
    private ArrayList<String> tithing;
    private ArrayList<String> giving;
}

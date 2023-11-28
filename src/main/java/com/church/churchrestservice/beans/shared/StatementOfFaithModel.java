package com.church.churchrestservice.beans.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class StatementOfFaithModel {
   private String imageUrl;
   private ArrayList<StatementOfFaithInformationModel> statementInformation;
}

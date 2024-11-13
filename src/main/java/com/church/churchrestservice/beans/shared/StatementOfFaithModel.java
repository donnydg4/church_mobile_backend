package com.church.churchrestservice.beans.shared;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class StatementOfFaithModel {
   private String imageUrl;
   private ArrayList<StatementOfFaithInformationModel> statementInformation;

   public String getImageUrl() {
      return imageUrl;
   }

   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   public ArrayList<StatementOfFaithInformationModel> getStatementInformation() {
      return statementInformation;
   }

   public void setStatementInformation(ArrayList<StatementOfFaithInformationModel> statementInformation) {
      this.statementInformation = statementInformation;
   }
}

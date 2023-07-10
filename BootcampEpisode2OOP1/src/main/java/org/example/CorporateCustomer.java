package org.example;

public class CorporateCustomer extends Customer {
  private String companyName;
  private String taxeNumber;

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getTaxeNumber() {
    return taxeNumber;
  }

  public void setTaxeNumber(String taxeNumber) {
    this.taxeNumber = taxeNumber;
  }
}

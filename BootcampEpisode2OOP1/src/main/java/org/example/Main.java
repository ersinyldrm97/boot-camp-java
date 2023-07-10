package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  public static void main(String[] args) {
    String mesaj = "Vade orani";

    Product product1 = new Product();
    product1.setName("Delonghi Kahve Makinesi");
    product1.setDiscount(7);
    product1.setUnitPrice(7500);
    product1.setUnitsInStock(3);
    product1.setImageUrl("image1.jpg");

    Product product2 = new Product();
    product2.setName("Smeg Kahve Makinesi");
    product2.setDiscount(7);
    product2.setUnitPrice(7500);
    product2.setUnitsInStock(3);
    product2.setImageUrl("image2.jpg");

    Product product3 = new Product();
    product3.setName("Kitchen Aid Kahve Makinesi");
    product3.setDiscount(7);
    product3.setUnitPrice(7500);
    product3.setUnitsInStock(3);
    product3.setImageUrl("image3.jpg");

    Product[] products = {
      product1,
      product2,
      product3
    };

    //i used to show list for html
    System.out.println("<ul>");
    for (Product product : products) {
      System.out.println("<li>" + product.getName() + "</li>");
    }
    System.out.println("</ul>");

    IndividualCustomer individualCustomer = new IndividualCustomer();

    individualCustomer.setId(1);
    individualCustomer.setPhoneNumber("05356895009");
    individualCustomer.setCustomerNumber("123");
    individualCustomer.setFirstName("Ersin");
    individualCustomer.setLastName("Yildirim");

    CorporateCustomer corporateCustomer = new CorporateCustomer();
    corporateCustomer.setId(2);
    corporateCustomer.setCompanyName("Weystra");
    corporateCustomer.setTaxeNumber("11111111111");
    corporateCustomer.setCustomerNumber("54321");

    Customer[] customers = {individualCustomer, corporateCustomer};

    for (Customer customer : customers) {
      System.out.println("Customer number: " + customer.getCustomerNumber());
    }

  }
}
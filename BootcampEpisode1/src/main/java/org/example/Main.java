package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args){
    double dollarYesterday = 19.14;
    double dollarToday = 19.10;

    boolean isDecrease = false;

    String arrowWay = "";

    if (dollarToday < dollarYesterday) {
      arrowWay = "down.svg";
      System.out.println(arrowWay);
    } else if (dollarToday > dollarYesterday) {
      arrowWay = "up.svg";
      System.out.println(arrowWay);
    }
    else {
      arrowWay = "equal.svg";
      System.out.println(arrowWay);
    }

    String[] krediler = {"Hizli kredi", "Massini halkbanktan", "Mutlu emeklilik"};

    for (int i = 0; i < krediler.length; i++) {
      System.out.println(krediler[i]);
    }

//    Array reverse function
//    Collections.reverse(Arrays.asList(krediler));
//    System.out.println("reversed array:" + Arrays.asList(krediler));

  }
}
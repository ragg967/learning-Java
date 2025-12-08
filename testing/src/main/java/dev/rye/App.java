package dev.rye;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Weight converter

    Scanner scanner = new Scanner(System.in);

    boolean hasBeenConverted = false;

    System.out.print("Enter you conversion. e.g. Kg -> lb: ");
    String conversion = scanner.nextLine();

    if (conversion.toLowerCase().strip().replaceAll("\\s+", "").contains("kg->lb")) {
      System.out.print("How many Kilos?: ");
      double weight = scanner.nextDouble();
      double convertedWeight = weight * 2.20462;
      System.out.printf("%.05f kilos is %.05f pounds\n", weight, convertedWeight);
      hasBeenConverted = true;
    }

    if (conversion.toLowerCase().strip().replaceAll("\\s+", "").contains("lb->kg")) {
      System.out.print("How many Pounds?: ");
      double weight = scanner.nextDouble();
      double convertedWeight = weight * 0.45359237;
      System.out.printf("%.05f pounds is %.05f kilos\n", weight, convertedWeight);
      hasBeenConverted = true;
    }

    if(!hasBeenConverted) {
      System.out.printf("Error: unable to convert %s\n", conversion);
    }

    scanner.close();
  }
}

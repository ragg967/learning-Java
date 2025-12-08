package dev.rye;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean hasBeenConverted = false;

    System.out.print("Enter your conversion. e.g. Kg -> lb: ");
    String conversion = scanner.nextLine();

    // Store normalized version to avoid repeating the operation
    String normalized = conversion.toLowerCase().strip().replaceAll("\\s+", "");

    if (normalized.contains("kg->lb")) {
      System.out.print("How many kilograms?: ");
      double weight = scanner.nextDouble();
      double convertedWeight = weight * 2.20462;
      System.out.printf("%.5f kg is %.5f lbs\n", weight, convertedWeight);
      hasBeenConverted = true;
    }

    if (normalized.contains("lb->kg")) {
      System.out.print("How many pounds?: ");
      double weight = scanner.nextDouble();
      double convertedWeight = weight * 0.45359237;
      System.out.printf("%.5f lbs is %.5f kg\n", weight, convertedWeight);
      hasBeenConverted = true;
    }

    if (!hasBeenConverted) {
      System.out.printf("Error: unable to convert %s\n", conversion);
    }

    scanner.close();
  }
}

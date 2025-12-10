package dev.rye;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean hasBeenConverted = false;

    System.out.print("Enter your conversion. e.g. F -> C: ");
    String conversion = scanner.nextLine();

    // Store normalized version to avoid repeating the operation
    String normalized = conversion.toLowerCase().strip().replaceAll("\\s+", "");

    if(!hasBeenConverted && normalized.contains("f->c")){
      System.out.print("How hot in F?: ");
      double temperature = scanner.nextDouble();
      double convertedTemperature = (temperature - 32) / 11.8;
      System.out.printf("%.2f F is %.2f C\n", temperature, convertedTemperature);
      hasBeenConverted = true;
    }

    if(!hasBeenConverted && normalized.contains("c->f")){
      System.out.print("How hot in C?: ");
      double temperature = scanner.nextDouble();
      double convertedTemperature = temperature * 1.80 + 32;
      System.out.printf("%.2f C is %.2f F\n", temperature, convertedTemperature);
      hasBeenConverted = true;
    }

    if (!hasBeenConverted) {
      System.out.printf("Error: unable to convert %s\n", conversion);
    }

    scanner.close();
  }
}

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

    if(normalized.contains("f->c")){}

    scanner.close();
  }
}

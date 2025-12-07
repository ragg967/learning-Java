package dev.rye;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // A=P(1 + (r/n))^nt
    Scanner scanner = new Scanner(System.in);
    double a;
    double p;
    double r;
    double n;
    double t;

    System.out.print("Enter your initial investment: $");
    p = scanner.nextDouble();

    System.out.print("Enter the interest rate (as %): ");
    r = scanner.nextDouble() / 100; // Convert percentage to decimal

    System.out.print("Enter times interest is compounded per year: ");
    n = scanner.nextDouble();

    System.out.print("Enter how many years you will invest: ");
    t = scanner.nextDouble();

    a = p * Math.pow((1 + (r/n)), n*t);
    double profit = a - p;

    System.out.println("\n--- Results ---");
    System.out.printf("Initial Investment: $%.2f\n", p);
    System.out.printf("Total Value After %.0f years: $%.2f\n", t, a);
    System.out.printf("Profit Earned: $%.2f\n", profit);

    scanner.close();
  }
}

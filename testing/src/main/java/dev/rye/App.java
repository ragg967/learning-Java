package dev.rye;

import javax.swing.*;

public class App {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Click me!");
    button.addActionListener(e-> System.out.println("Clicked!"));

    frame.add(button);
    frame.pack();
    frame.setVisible(true);
  }
}

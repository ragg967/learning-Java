package dev.rye;

import javax.swing.*;

public class App {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Application");
    frame.setLayout(null);
    frame.setSize(500, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Click me");
    button.setBounds(150, 200, 220, 50);

    frame.add(button);
    frame.setVisible(true);
  }
}

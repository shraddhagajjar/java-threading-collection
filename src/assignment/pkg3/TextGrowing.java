/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


/**
 *
 * @author shraddha
 */
public class TextGrowing extends JApplet implements Runnable{
  private JLabel jlblText = new JLabel("I'M Growing", JLabel.CENTER);
  
        
  private int size = 0;
  private String color;
  public TextGrowing() {
    add(jlblText);
    jlblText.setFont(new Font("Serif",Font.BOLD, 10));
    new Thread(this).start();
    
  }

  @Override /** Set the text on/off every 1000 milliseconds */
  public void run() {
    try {
      while (true) {
        
          for(int i=10;i<=50;i+=5)
          {
              Thread.sleep(1000); 
             jlblText.setFont(new Font("Serif",Font.BOLD,i));
             Color color = new Color((int)(Math.random() * 256),(int)(Math.random() * 256), (int)(Math.random() * 256));
             jlblText.setForeground(color);
          }
      }
    }
    catch (InterruptedException ex) {
    }
  }

  /** Main method */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JFrame frame = new JFrame("Growing Text With different color");
        frame.add(new TextGrowing());
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,350);
        frame.setVisible(true);
      }
    });
  }
}

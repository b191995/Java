import java.awt.*;

import javax.swing.*;

public class BmiGui1 
{
  public static void main(String[] args) 
  {


   JTextField heightField = new JTextField(5);
   JTextField weightField = new JTextField(5);
   JLabel bmiLabel = new JLabel("Type your height and weight");
   JButton computeButton = new JButton("Compute");
   JPanel north = new JPanel(new GridLayout(2, 2));
   north.add(new JLabel("Height: "));
   north.add(heightField);
   north.add(new JLabel("Weight: "));
   north.add(weightField);


   JFrame frame = new JFrame("BMI");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(new BorderLayout());
   frame.add(north, BorderLayout.NORTH);
   frame.add(bmiLabel, BorderLayout.CENTER);
   frame.add(computeButton, BorderLayout.SOUTH);
   frame.pack();
   frame.setVisible(true);
  }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentsExample{
	public static void main(String args[]){
		JFrame frame= new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300,100));
		frame.setTitle("A frame");
		JButton b1=new JButton();
		b1.setText("I'm a button!");
		b1.setBackground(Color.BLUE);
		b1.addActionListener(new MessageListener());
		frame.add(b1);
		JButton b2=new JButton();
		b2.setText("Click me.");
		b2.setBackground(Color.RED);
		frame.add(b2);
		frame.pack();
		frame.setVisible(true);
	}
}

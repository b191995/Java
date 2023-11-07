import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class MouseGUI{
	public static void main(String args[]){
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel southPanel = new JPanel(new FlowLayout());
		frame.setSize(new Dimension(200, 100));
		frame.setTitle("A frame");
		JLabel label=new JLabel();
		label.setText("Move the mouse over me!");
		frame.add(label);
		MovementListener m=new MovementListener();
		label.addMouseListener(m);
		label.addMouseMotionListener(m);
		frame.setVisible(true);
	}
}
		

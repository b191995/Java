import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class MovementListener extends MouseInputAdapter{
	public void mouseEntered(MouseEvent event){
		JOptionPane.showMessageDialog(null, "Mouse Entered!");
	}
}

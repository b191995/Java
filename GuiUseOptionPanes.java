import javax.swing.*;
public class GuiUseOptionPanes{
	public static void main(String args[]){
		
		String name= JOptionPane.showInputDialog(null, "What's your name?");
		int choice=JOptionPane.showConfirmDialog(null,"Do you like cake, " +name+" ?");
		if(choice==JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null,"Ofcourse! Who doesn't?");
		}
		else{
			JOptionPane.showMessageDialog(null,"We'll have to agree to disagree.");
		}
	}
}

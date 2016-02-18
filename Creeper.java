import javax.swing.JOptionPane;

public class Creeper {
public static void main(String[] args) {
	String address = JOptionPane.showInputDialog(null,"where do you live?");
	String numFriends= JOptionPane.showInputDialog(null,"How many friends do you have?");
	String favColor= JOptionPane.showInputDialog(null,"What is your favorite color?");
	String dogs= JOptionPane.showInputDialog(null,"how many dogs do you have?");
	String home= JOptionPane.showInputDialog(null,"where do you want to live?");
	JOptionPane.showMessageDialog(null,"I know you live in the" + address);
	JOptionPane.showMessageDialog(null, "I know you have lots of friends" + numFriends);
	JOptionPane.showMessageDialog(null, "I know your favorite color is"+favColor);
	JOptionPane.showMessageDialog(null, "I know you have"+ dogs);
	JOptionPane.showMessageDialog(null, "You should not give out this information");
	
}
}

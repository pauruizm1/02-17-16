import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null,"what's your name?");
	JOptionPane.showMessageDialog(null, "Hi" + name);
	JOptionPane.showInputDialog(null,"what are you doing?");
	
}
}

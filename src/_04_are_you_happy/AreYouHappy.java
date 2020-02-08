package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String happy = JOptionPane.showInputDialog(null, "are you happy");
if   (happy.equals("yes")) {
	JOptionPane.showMessageDialog(null,"keep doing whatever your doing");
}
		
		
		if (happy.equals("no")) {
			String happy2 = JOptionPane.showInputDialog("do you want to be happy");

			if (happy2.equals("yes")) {

				JOptionPane.showMessageDialog(null, "change something");
			}
			if (happy2.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
			}

		}

	}

}

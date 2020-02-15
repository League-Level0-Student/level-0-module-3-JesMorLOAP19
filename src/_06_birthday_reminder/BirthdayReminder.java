
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "July 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday=JOptionPane.showInputDialog(null,"what birthday do you want");
	
		// 3. Print out what the user typed
		System.out.println(birthday);
		
		// 4. if user asked for "mom"
		if (birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null,momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if (birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null,dadsBirthday);
			}
				// print dad's birthday
			// 6. if user asked for your name
		else if (birthday.equals("jessica")) {
				JOptionPane.showMessageDialog(null,myBirthday);
			}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

		else {
			
		JOptionPane.showMessageDialog(null,"Sorry, i don't remember that person's birthday!");
		}
}
}
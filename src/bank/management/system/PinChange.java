package bank.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String pinNumber;
	JTextField newPin, newPin2;
	JButton change, back;
	PinChange(String pinNumber) {
		this.pinNumber = pinNumber;
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0,700, 700);
		add(image);
		
		JLabel text = new JLabel("Change your PIN");
		text.setBounds(195, 220, 700, 30);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		JLabel newPinText = new JLabel("New PIN:");
		newPinText.setBounds(120, 265, 100, 30);
		newPinText.setForeground(Color.WHITE);
		newPinText.setFont(new Font("System", Font.BOLD, 14));
		image.add(newPinText);
		
		newPin = new JTextField();
		newPin.setBounds(250, 270, 150, 20);
		newPin.setFont(new Font("System", Font.BOLD, 16));
		image.add(newPin);
		
		JLabel newPinText2 = new JLabel("Re-enter new PIN:");
		newPinText2.setBounds(120, 295, 200, 30);
		newPinText2.setForeground(Color.WHITE);
		newPinText2.setFont(new Font("System", Font.BOLD, 14));
		image.add(newPinText2);
		
		newPin2 = new JTextField();
		newPin2.setBounds(250, 300, 150, 20);
		newPin2.setFont(new Font("System", Font.BOLD, 16));
		image.add(newPin2);	
		
		change = new JButton("Change");
		change.setBounds(271, 378, 130, 24);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("BACK");
		back.setBounds(271, 406, 130, 24);
		back.addActionListener(this);
		image.add(back);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}
	
	public static void main(String[] args) {
		new PinChange("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == change) {
			try {
				String nPin = newPin.getText();
				String nPin2 = newPin2.getText();
				
				if(!nPin.equals(nPin2)) {
					JOptionPane.showMessageDialog(null, "Entered pin does not match");
				}

				if (nPin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter new pin");
				} else if (nPin2.equals("")) {
					JOptionPane.showMessageDialog(null, "Please re-enter new pin");
				} else {

					Conn c = new Conn();
					String q1 = "update bank set pin = '" + nPin2 + "' where pin = '" + pinNumber + "'";
					String q2 = "update login set pin = '" + nPin2 + "' where pin = '" + pinNumber + "'";
					String q3 = "update signupthree set pin = '" + nPin2 + "' where pin = '" + pinNumber + "'";

					c.s.executeUpdate(q1);
					c.s.executeUpdate(q2);
					c.s.executeUpdate(q3);
					
					JOptionPane.showMessageDialog(null, "Pin changed successfully");

					setVisible(false);
					new Login().setVisible(true);
				}
			} catch (Exception e2) {
				System.out.println(e2);
			}
		} else {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
	}

}

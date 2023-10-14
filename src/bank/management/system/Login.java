package bank.management.system;

import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Login extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Login(){
		
		setTitle("ATM");
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/2038009.png"));
		i1.setImage(i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
		JLabel label = new JLabel(i1); 
		label.setBounds(10, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome to ATM!");
		text.setFont(new Font("Osward", Font.BOLD, 40));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		JLabel cardno = new JLabel("Card No.:");
		cardno.setFont(new Font("Raleway", Font.BOLD, 20));
		cardno.setBounds(120, 150, 400, 30);
		add(cardno);
		
		JTextField cardTextField = new JTextField();
		cardTextField.setBounds(250, 150, 250, 30);
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		pin.setBounds(170, 220, 250, 30);
		add(pin);
		
		JTextField pinTextField = new JTextField();
		pinTextField.setBounds(250, 220, 250, 30);
		add(pinTextField);
		
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}

	public static void main(String[] args) {
		new Login();

	}

}

package bank.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton login, signUp, clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	JLabel label, cardNo, text, pin;

	Login(){
		
		setTitle("ATM");
		setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/transferir.png"));
		i1.setImage(i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		label = new JLabel(i1); 
		label.setBounds(100, 10, 100, 100);
		add(label);
		
		text = new JLabel("Welcome to ATM!");
		text.setFont(new Font("Osward", Font.BOLD, 40));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		cardNo = new JLabel("Card No.:");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
		cardNo.setBounds(120, 150, 400, 30);
		add(cardNo);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(250, 150, 250, 30);
		cardTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(cardTextField);
		
		pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		pin.setBounds(170, 200, 250, 30);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(250, 200, 250, 30);
		pinTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(pinTextField);
		
		login = new JButton("SIGN IN");
		login.setBounds(250, 250, 110, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(390, 250, 110, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signUp = new JButton("SIGN UP");
		signUp.setBounds(250, 300, 250, 30);
		signUp.setBackground(Color.BLACK);
		signUp.setForeground(Color.WHITE);
		signUp.addActionListener(this);
		add(signUp);
		
		getContentPane().setBackground(Color.WHITE);		
		setSize(800, 500);
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setVisible(true);
		setLocation(250, 90);
		
	}
	
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == login) {
			
		} else if (e.getSource() == signUp) {
			
		} else if (e.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}
	}

}

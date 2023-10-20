package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton signIn, signUp, clear;
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
		
		signIn = new JButton("SIGN IN");
		signIn.setBounds(250, 250, 110, 30);
		signIn.setBackground(Color.BLACK);
		signIn.setForeground(Color.WHITE);
		signIn.setFocusPainted(false);
		signIn.addActionListener(this);
		add(signIn);
		
		clear = new JButton("CLEAR");
		clear.setBounds(390, 250, 110, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.setFocusPainted(false);
		clear.addActionListener(this);
		add(clear);
		
		signUp = new JButton("SIGN UP");
		signUp.setBounds(250, 300, 250, 30);
		signUp.setBackground(Color.BLACK);
		signUp.setForeground(Color.WHITE);
		signUp.setFocusPainted(false);
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
		
		char[] passwordChars = pinTextField.getPassword();
		String password = new String(passwordChars);
		String cardNo = cardTextField.getText();
		
		if (e.getSource() == signIn) {
			
			Conn c = new Conn();
			ResultSet rs;
			try {
				String queryCheck = "SELECT * from login WHERE cardNumber = '" + cardNo + "' and pin = '" + password + "'";

				
				rs = c.s.executeQuery(queryCheck);
		        
		        if (rs.next()) {
		        	
		        } else {
		        	
					if (cardNo.isEmpty() && password.isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "Invalid credentials");
						
					} else if(cardNo.isEmpty()){
						
						JOptionPane.showMessageDialog(null, "Invalid card Number");
						
					} else if (password.isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "Invalid PIN");
						
					}
		        			        	
		        }

		        rs.close();
		        
		    } catch (SQLException e1) {
		    	
		        e1.printStackTrace();
		    }			
			
			
		} else if (e.getSource() == signUp) {
			setVisible(false);
			new SignUpOne().setVisible(true);
			
		} else if (e.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}
	}

}

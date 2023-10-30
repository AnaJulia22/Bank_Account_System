package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton back;
	String pinNumber;

	BalanceEnquiry(String pinNumber){
		this.pinNumber = pinNumber;
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0,700, 700);
		add(image);
		
		Conn c = new Conn();
		Integer balance = 0;
		try {			
			ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
			while(rs.next()) {
				if (rs.getString("type").equals("Deposit")) {
					balance =+ Integer.parseInt(rs.getString("amount"));
				} else {
					balance =- Integer.parseInt(rs.getString("amount"));
				}
			}			
			
		} catch(Exception e1){
			System.out.println(e1);
		}
		
		JLabel text = new JLabel("Your current account balance is $" + balance);
		text.setBounds(145, 240, 700, 20);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 14));
		image.add(text);
		
		back = new JButton("BACK");
		back.setBounds(270, 406, 130, 24);
		back.addActionListener(this);
		image.add(back);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}
	
	public static void main(String[] args) {
		new BalanceEnquiry("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setVisible(false);
		new Transactions(pinNumber).setVisible(true);
	}

}

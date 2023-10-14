package bank.management.system;

import java.awt.*;
import java.util.*;

import javax.swing.*;

public class SignUpOne extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SignUpOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setVisible(true);
		setLocation(350, 10);
	}

	public static void main(String[] args) {
		new SignUpOne();

	}

}

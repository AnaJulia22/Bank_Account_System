package bank.management.system;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton savingAccount, currentAccount, fixedDepositAccount, recurringDepositAccount;
	ButtonGroup accountTypeGroup;

	public SignUpThree() {
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel accountDetail = new JLabel("Page #3: account details");
		accountDetail.setFont(new Font("Raleway", Font.BOLD, 20));
		accountDetail.setBounds(250, 60, 400, 30);
		add(accountDetail);
		
		JLabel accountType = new JLabel("Account type");
		accountType.setFont(new Font("Raleway", Font.BOLD, 18));
		accountType.setBounds(100, 120, 400, 30);
		add(accountType);
		
		savingAccount = new JRadioButton("Saving account");
		savingAccount.setBounds(100, 160, 150, 20);
		savingAccount.setFont(new Font( "Arial", Font.BOLD, 14));
		savingAccount.setBackground(Color.WHITE); 
		savingAccount.setFocusPainted(false);
		add(savingAccount);
		
		currentAccount = new JRadioButton("Current account");
		currentAccount.setBounds(100, 190, 150, 20);
		currentAccount.setFont(new Font( "Arial", Font.BOLD, 14));
		currentAccount.setBackground(Color.WHITE); 
		currentAccount.setFocusPainted(false);
		add(currentAccount);
		
		fixedDepositAccount = new JRadioButton("Fixed deposit account");
		fixedDepositAccount.setBounds(300, 160, 300, 20);
		fixedDepositAccount.setFont(new Font( "Arial", Font.BOLD, 14));
		fixedDepositAccount.setBackground(Color.WHITE); 
		fixedDepositAccount.setFocusPainted(false);
		add(fixedDepositAccount);
		
		recurringDepositAccount = new JRadioButton("Recurring deposit account");
		recurringDepositAccount.setBounds(300, 190, 300, 20);
		recurringDepositAccount.setFont(new Font( "Arial", Font.BOLD, 14));
		recurringDepositAccount.setBackground(Color.WHITE); 
		recurringDepositAccount.setFocusPainted(false);
		add(recurringDepositAccount);
		
		accountTypeGroup = new ButtonGroup();
		accountTypeGroup.add(currentAccount);
		accountTypeGroup.add(fixedDepositAccount);
		accountTypeGroup.add(recurringDepositAccount);
		accountTypeGroup.add(savingAccount);
		
		JLabel cardNo = new JLabel("Card Number");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 18));
		cardNo.setBounds(100, 230, 400, 30);
		add(cardNo);
		
		
		
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setSize(800, 800);
		setVisible(true);
		setLocation(250, 20);
	}

	public static void main(String[] args) {
		new SignUpThree();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

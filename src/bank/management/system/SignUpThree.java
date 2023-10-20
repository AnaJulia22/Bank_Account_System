package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton savingAccount, currentAccount, fixedDepositAccount, recurringDepositAccount;
	ButtonGroup accountTypeGroup, serviceRequiredGroup;
	JCheckBox atmCard, mobileBanking, chequeBook, internetBanking, email_smsAlerts, eStatement;
	JButton back, cancel, submit;
	String formNo;
	long random;

	public SignUpThree(String formNo) {
		this.formNo = formNo;
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
		
		JLabel cardNo = new JLabel("Card Number:");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 18));
		cardNo.setBounds(100, 230, 400, 30);
		add(cardNo);
		JLabel cardNoNumber = new JLabel("XXXX-XXXX-XXXX-1308");
		cardNoNumber.setFont(new Font("Raleway", Font.BOLD, 18));
		cardNoNumber.setBounds(300, 230, 400, 30);
		add(cardNoNumber);		
		JLabel infoCard = new JLabel("Your 16 digit card number");
		infoCard.setFont(new Font("Raleway", Font.BOLD, 10));
		infoCard.setBounds(100, 250, 200, 20);
		add(infoCard);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 18));
		pin.setBounds(100, 290, 400, 30);
		add(pin);
		JLabel pinNumber = new JLabel("XXXX");
		pinNumber.setFont(new Font("Raleway", Font.BOLD, 18));
		pinNumber.setBounds(300, 290, 100, 30);
		add(pinNumber);
		JLabel infopin = new JLabel("Your 4 digit password");
		infopin.setFont(new Font("Raleway", Font.BOLD, 10));
		infopin.setBounds(100, 310, 200, 20);
		add(infopin);
		
		JLabel serviceRequired = new JLabel("Services required");
		serviceRequired.setFont(new Font("Raleway", Font.BOLD, 18));
		serviceRequired.setBounds(100, 350, 400, 30);
		add(serviceRequired);
		
		atmCard = new JCheckBox("ATM card");
		atmCard.setBounds(100, 390, 150, 20);
		atmCard.setFont(new Font( "Arial", Font.BOLD, 14));
		atmCard.setBackground(Color.WHITE); 
		atmCard.setFocusPainted(false);
		add(atmCard);
		
		mobileBanking = new JCheckBox("Mobile banking");
		mobileBanking.setBounds(100, 420, 150, 20);
		mobileBanking.setFont(new Font( "Arial", Font.BOLD, 14));
		mobileBanking.setBackground(Color.WHITE); 
		mobileBanking.setFocusPainted(false);
		add(mobileBanking);
		
		chequeBook = new JCheckBox("Cheque book");
		chequeBook.setBounds(100, 450, 200, 20);
		chequeBook.setFont(new Font( "Arial", Font.BOLD, 14));
		chequeBook.setBackground(Color.WHITE);
		chequeBook.setFocusPainted(false);
		add(chequeBook);
		
		internetBanking = new JCheckBox("Internet banking");
		internetBanking.setBounds(300, 390, 300, 20);
		internetBanking.setFont(new Font( "Arial", Font.BOLD, 14));
		internetBanking.setBackground(Color.WHITE);
		internetBanking.setFocusPainted(false);
		add(internetBanking);
		
		email_smsAlerts = new JCheckBox("Email and SMS alerts");
		email_smsAlerts.setBounds(300, 420, 300, 20);
		email_smsAlerts.setFont(new Font( "Arial", Font.BOLD, 14));
		email_smsAlerts.setBackground(Color.WHITE); 
		email_smsAlerts.setFocusPainted(false);
		add(email_smsAlerts);
		
		eStatement = new JCheckBox("E-Statement");
		eStatement.setBounds(300, 450, 200, 20);
		eStatement.setFont(new Font( "Arial", Font.BOLD, 14));
		eStatement.setBackground(Color.WHITE);
		eStatement.setFocusPainted(false);
		add(eStatement);
				
		cancel = new JButton("CANCEL");
		cancel.setBounds(250, 480, 100, 30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFocusPainted(false);
		cancel.addActionListener(this);
		add(cancel);
		
		submit = new JButton("SUBMIT");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(370, 480, 100, 30);
		submit.setFocusPainted(false);
		submit.addActionListener(this);
		add(submit);
				
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setSize(800, 800);
		setVisible(true);
		setLocation(250, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
		if(e.getSource() == submit) {
			String formNo2 = this.formNo;
			
			Random ran = new Random();
			String cardNumber = ""+ Math.abs((ran.nextLong() % 90000000L)) + 5040936000000000L;
			String pin = ""+Math.abs((ran.nextLong() % 9000L) + 1000L);;
			
			String accountType = null;
			
			if(savingAccount.isSelected()) {
				accountType = "Saving account";
			}else if(currentAccount.isSelected()) {
				accountType = "Current account";
			}else if(fixedDepositAccount.isSelected()) {
				accountType = "Fixed deposit account";
			}else if(recurringDepositAccount.isSelected()) {
				accountType = "Recurring deposit account";
			}
			
			String facility = "";
			
			if (atmCard.isSelected()) {
				
				facility = facility + "ATM card";

			} 
			
			if (mobileBanking.isSelected()) {
				
				if (facility.equals("")) {

					facility =  facility + "Mobile banking";
				} else {
					facility =  facility + ", Mobile banking";
				}
				
			} 
			
			if (internetBanking.isSelected()) {
				
				if (facility.equals("")) {

					facility =  facility + "Internet banking";
				} else {
					facility =  facility + ", Internet banking";
				}			

			} 
			
			if (chequeBook.isSelected()) {
				
				if (facility.equals("")) {

					facility =  facility + "Cheque box";
				} else {
					facility =  facility + ", Cheque box";
				}
				
			} 
			if (email_smsAlerts.isSelected()) {
				
				if (facility.equals("")) {

					facility =  facility + "Email and SMS alerts";
				} else {
					facility =  facility + ", Email and SMS alerts";
				}				

			}
			if (eStatement.isSelected()) {
				
				if (facility.equals("")) {

					facility =  facility + "E-statement";
				} else {
					facility =  facility + ", E-statement";
				}				

			} 
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is required");
				} else {

				Conn c = new Conn();
				
				String query = "Insert into signupthree values ('" + formNo2 + "','" + accountType + "','" + cardNumber + "','" + pin + "', '" + facility + "')";
				c.s.executeUpdate(query);	
				}

			} catch (Exception e1) {
				System.out.println(e1);
			}
			
		} else if (e.getSource() == cancel) {			
			
			setVisible(false);
			new Login().setVisible(true);

		}		
		
	}
	
	public static void main(String[] args) {
		new SignUpThree("");

	}

}

package bank.management.system;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nameTextField, fnameTextField, dateBirthTextField, eAddressTextField, addressTextField, cityTextField, stateTextField, pinTextField;

	SignUpOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);
		
		JLabel personalDetail = new JLabel("Page #1: personal details");
		personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetail.setBounds(290, 80, 400, 30);
		add(personalDetail);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 130, 400, 30);
		add(name);		
		nameTextField = new JTextField();
		nameTextField.setBounds(300, 135, 250, 25);
		nameTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(nameTextField);
		
		JLabel fName = new JLabel("Father's name:");
		fName.setFont(new Font("Raleway", Font.BOLD, 20));
		fName.setBounds(100, 180, 400, 30);
		add(fName);
		fnameTextField = new JTextField();
		fnameTextField.setBounds(300, 185, 250, 25);
		fnameTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(fnameTextField);
		
		JLabel dateBirth = new JLabel("Date of birth:");
		dateBirth.setFont(new Font("Raleway", Font.BOLD, 20));
		dateBirth.setBounds(100, 230, 400, 30);
		add(dateBirth);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 230, 250, 25);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 280, 400, 30);
		add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		
		JRadioButton female = new JRadioButton("Female");
		
		JLabel emailAddress = new JLabel("Email Address:");
		emailAddress.setFont(new Font("Raleway", Font.BOLD, 20));
		emailAddress.setBounds(100, 330, 400, 30);
		add(emailAddress);		
		eAddressTextField = new JTextField();
		eAddressTextField.setBounds(300, 335, 250, 25);
		eAddressTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(eAddressTextField);
		
		JLabel maritalStatus = new JLabel("Marital Status:");
		maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		maritalStatus.setBounds(100, 380, 400, 30);
		add(maritalStatus);	
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 430, 400, 30);
		add(address);		
		addressTextField = new JTextField();
		addressTextField.setBounds(300, 435, 250, 25);
		addressTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(addressTextField);
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 480, 400, 30);
		add(city);		
		cityTextField = new JTextField();
		cityTextField.setBounds(300, 485, 250, 25);
		cityTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(cityTextField);
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 530, 400, 30);
		add(state);		
		stateTextField = new JTextField();
		stateTextField.setBounds(300, 535, 250, 25);
		stateTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(stateTextField);
		
		JLabel pin = new JLabel("Pin code:");
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		pin.setBounds(100, 580, 400, 30);
		add(pin);		
		pinTextField = new JTextField();
		pinTextField.setBounds(300, 585, 250, 25);
		pinTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(pinTextField);
				
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setVisible(true);
		setLocation(350, 10);
	}

	public static void main(String[] args) {
		new SignUpOne();

	}

}

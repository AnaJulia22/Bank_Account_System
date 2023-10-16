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
		formNo.setFont(new Font("Raleway", Font.BOLD, 30));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);
		
		JLabel personalDetail = new JLabel("Page #1: personal details");
		personalDetail.setFont(new Font("Raleway", Font.BOLD, 20));
		personalDetail.setBounds(250, 60, 400, 30);
		add(personalDetail);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 110, 400, 30);
		add(name);		
		nameTextField = new JTextField();
		nameTextField.setBounds(300, 115, 300, 25);
		nameTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(nameTextField);
		
		JLabel fName = new JLabel("Father's name:");
		fName.setFont(new Font("Raleway", Font.BOLD, 20));
		fName.setBounds(100, 155, 400, 30);
		add(fName);
		fnameTextField = new JTextField();
		fnameTextField.setBounds(300, 160, 300, 25);
		fnameTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(fnameTextField);
		
		JLabel dateBirth = new JLabel("Date of birth:");
		dateBirth.setFont(new Font("Raleway", Font.BOLD, 20));
		dateBirth.setBounds(100, 205, 400, 30);
		add(dateBirth);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 210, 300, 25);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 250, 400, 30);
		add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(300, 255, 60, 30);
		male.setBackground(Color.WHITE);
		male.setFocusPainted(false);
		add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(370, 255, 70, 30);
		female.setBackground(Color.WHITE);
		female.setFocusPainted(false);
		add(female);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(female);
		genderGroup.add(male);
		
		JLabel emailAddress = new JLabel("Email Address:");
		emailAddress.setFont(new Font("Raleway", Font.BOLD, 20));
		emailAddress.setBounds(100, 295, 400, 30);
		add(emailAddress);		
		eAddressTextField = new JTextField();
		eAddressTextField.setBounds(300, 300, 300, 25);
		eAddressTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(eAddressTextField);
		
		JLabel maritalStatus = new JLabel("Marital Status:");
		maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		maritalStatus.setBounds(100, 340, 400, 30);
		add(maritalStatus);	
		
		JRadioButton married = new JRadioButton("Married");
		married.setBounds(300, 345, 70, 30);
		married.setBackground(Color.WHITE);
		married.setFocusPainted(false);
		add(married);
		
		JRadioButton unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(370, 345, 90, 30);
		unmarried.setBackground(Color.WHITE);
		unmarried.setFocusPainted(false);
		add(unmarried);
		
		JRadioButton widowed = new JRadioButton("Widowed");
		widowed.setBounds(460, 345, 90, 30);
		widowed.setBackground(Color.WHITE);
		widowed.setFocusPainted(false);
		add(widowed);	
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(widowed);
		maritalgroup.add(unmarried);
		maritalgroup.add(married);
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 385, 400, 30);
		add(address);		
		addressTextField = new JTextField();
		addressTextField.setBounds(300, 390, 300, 25);
		addressTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(addressTextField);
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 430, 400, 30);
		add(city);		
		cityTextField = new JTextField();
		cityTextField.setBounds(300, 435, 300, 25);
		cityTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(cityTextField);
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 475, 400, 30);
		add(state);		
		stateTextField = new JTextField();
		stateTextField.setBounds(300, 480, 300, 25);
		stateTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(stateTextField);
		
		JLabel pin = new JLabel("Pin code:");
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		pin.setBounds(100, 520, 400, 30);
		add(pin);		
		pinTextField = new JTextField();
		pinTextField.setBounds(300, 525, 300, 25);
		pinTextField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(pinTextField);
		
		JButton next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(520, 560, 80, 30);
		add(next);
				
		getContentPane().setBackground(Color.WHITE);
		
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setSize(850, 800);
		setVisible(true);
		setLocation(350, 10);
	}

	public static void main(String[] args) {
		new SignUpOne();

	}

}

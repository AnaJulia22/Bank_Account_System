package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nameTextField, fnameTextField, eAddressTextField, addressTextField, cityTextField, stateTextField, pinTextField;
	JButton next, clear, back;
	JRadioButton male, female, married, unmarried, widowed;
	JDateChooser dateChooser;
	ButtonGroup genderGroup, maritalgroup;
	long random;
	
	SignUpOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
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
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 210, 300, 25);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 250, 400, 30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300, 255, 60, 30);
		male.setBackground(Color.WHITE);
		male.setFocusPainted(false);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(370, 255, 70, 30);
		female.setBackground(Color.WHITE);
		female.setFocusPainted(false);
		add(female);
		
		genderGroup = new ButtonGroup();
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
		
		married = new JRadioButton("Married");
		married.setBounds(300, 345, 70, 30);
		married.setBackground(Color.WHITE);
		married.setFocusPainted(false);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(370, 345, 90, 30);
		unmarried.setBackground(Color.WHITE);
		unmarried.setFocusPainted(false);
		add(unmarried);
		
		widowed = new JRadioButton("Widowed");
		widowed.setBounds(460, 345, 90, 30);
		widowed.setBackground(Color.WHITE);
		widowed.setFocusPainted(false);
		add(widowed);	
		
		maritalgroup = new ButtonGroup();
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
		
		back = new JButton("BACK");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Raleway", Font.BOLD, 14));
		back.setBounds(340, 560, 80, 30);
		back.setFocusPainted(false);
		back.addActionListener(this);
		add(back);
				
		clear = new JButton("CLEAR");
		clear.setBounds(430, 560, 80, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.setFocusPainted(false);
		clear.addActionListener(this);
		add(clear);
		
		next = new JButton("NEXT");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(520, 560, 80, 30);
		next.setFocusPainted(false);
		next.addActionListener(this);
		add(next);		
				
		getContentPane().setBackground(Color.WHITE);
		
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setSize(800, 800);
		setVisible(true);
		setLocation(250, 20);
	}

	public static void main(String[] args) {
		new SignUpOne();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String formNo = "" + random;
		String name = nameTextField.getText();
		String fName = fnameTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		} else if(female.isSelected()) {
			gender = "Female";
		}
		
		String email = eAddressTextField.getText();
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		}else if(unmarried.isSelected()) {
			marital = "Unmarried";
		}else if(widowed.isSelected()) {
			marital = "Widowed";
		}
		
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pinTextField.getText();
		
		if (e.getSource() == clear) {
			
			nameTextField.setText("");
			fnameTextField.setText("");
			eAddressTextField.setText(""); 
			addressTextField.setText(""); 
			cityTextField.setText(""); 
			stateTextField.setText("");
			pinTextField.setText("");
			genderGroup.clearSelection();
			maritalgroup.clearSelection();
			dateChooser.setDate(null);
			
		} else if(e.getSource() == next) {
			
			try {

				if (name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name is required");
				} else {
					Conn c = new Conn();
					String query = "Insert into signup values ('" + formNo + "', '" + name + "', '" + fName + "', '"+ dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '"+ city + "', '" + state + "', '" + pin + "')";
					c.s.executeUpdate(query);
					setVisible(false);
					new SignUpTwo(formNo).setVisible(true);
				}

			} catch (Exception e1) {
				System.out.println(e1);
			}
			
		} else if(e.getSource() == back) {
			
			setVisible(false);
			new Login().setVisible(true);
			
		}		

	}

}

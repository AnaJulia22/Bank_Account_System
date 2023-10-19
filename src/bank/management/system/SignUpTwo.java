package bank.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUpTwo extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton next, clear, back;
	JComboBox<String> categoryField, incomeField, educationField, occupField;
	JRadioButton yes, no, yes2, no2;
	ButtonGroup seniorButton, existing_accountButton;
	JTextField panField;
	String formNo;
	

	SignUpTwo(String formNo){
		
		this.formNo = formNo;
		
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM");
		getContentPane().setBackground(Color.WHITE);
		
		JLabel additonalDetail = new JLabel("Page #2: additional details");
		additonalDetail.setFont(new Font("Raleway", Font.BOLD, 20));
		additonalDetail.setBounds(250, 60, 400, 30);
		add(additonalDetail);
		
		JLabel category = new JLabel("Category:");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 155, 400, 30);
		add(category);		
		String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
		categoryField = new JComboBox<>(valCategory);
		categoryField.setBounds(300, 160, 300, 25);
		categoryField.setFont(new Font( "Arial", Font.BOLD, 14));
		categoryField.setBackground(Color.WHITE);
		add(categoryField);
		
		JLabel income = new JLabel("Income:");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 205, 400, 30);
		add(income);		
		String valIncome[] = {"Null", "< 150,000", "< 250,000", "< 500,000", "Up to 1,000,000"};
		incomeField = new JComboBox<>(valIncome);
		incomeField.setBounds(300, 210, 300, 25);
		incomeField.setFont(new Font("Raleway", Font.BOLD, 14));
		incomeField.setBackground(Color.WHITE);
		add(incomeField);		
		
		JLabel educational = new JLabel("Educational:");
		educational.setFont(new Font("Raleway", Font.BOLD, 20));
		educational.setBounds(100, 250, 400, 30);
		add(educational);		
		String valEducation[] = {"Non-graduation", "Graduation", "Post-graduation", "Doctorate", "Other"};
		educationField = new JComboBox<String>(valEducation);
		educationField.setBounds(300, 255, 300, 25);
		educationField.setFont(new Font( "Arial", Font.BOLD, 14));
		educationField.setBackground(Color.WHITE);
		add(educationField);
		
		JLabel occupation = new JLabel("Occupation:");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 295, 400, 30);
		add(occupation);
		String valOccup[] = {"Salaried", "Self-employed", "Business", "Student", "Retired", "Unemployed"};
		occupField = new JComboBox<String>(valOccup);
		occupField.setBounds(300, 300, 300, 25);
		occupField.setFont(new Font( "Arial", Font.BOLD, 14));
		occupField.setBackground(Color.WHITE);
		add(occupField);	
		
		JLabel panNo = new JLabel("Pan Number:");
		panNo.setFont(new Font("Raleway", Font.BOLD, 20));
		panNo.setBounds(100, 340, 400, 30);
		add(panNo);	
		panField = new JTextField();
		panField.setBounds(300, 345, 300, 25);
		panField.setFont(new Font( "Arial", Font.BOLD, 14));
		add(panField);
		
		JLabel seniorCitizen = new JLabel("Senior Citizen:");
		seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorCitizen.setBounds(100, 385, 400, 30);
		add(seniorCitizen);
		yes = new JRadioButton("Yes");
		yes.setBounds(300, 390, 100, 25);
		yes.setFont(new Font( "Arial", Font.BOLD, 14));
		yes.setBackground(Color.WHITE);
		yes.setFocusPainted(false);
		add(yes);
		no = new JRadioButton("No");
		no.setBounds(400, 390, 100, 25);
		no.setFont(new Font( "Arial", Font.BOLD, 14));
		no.setBackground(Color.WHITE);
		no.setFocusPainted(false);
		add(no);
		seniorButton = new ButtonGroup();
		seniorButton.add(no);
		seniorButton.add(yes);
		
		JLabel existing_account = new JLabel("Existing account:");
		existing_account.setFont(new Font("Raleway", Font.BOLD, 20));
		existing_account.setBounds(100, 430, 400, 30);
		add(existing_account);
		yes2 = new JRadioButton("Yes");
		yes2.setBounds(300, 435, 100, 25);
		yes2.setFont(new Font( "Arial", Font.BOLD, 14));
		yes2.setBackground(Color.WHITE);
		yes2.setFocusPainted(false);
		add(yes2);
		no2 = new JRadioButton("No");
		no2.setBounds(400, 435, 100, 25);
		no2.setFont(new Font( "Arial", Font.BOLD, 14));
		no2.setBackground(Color.WHITE);
		no2.setFocusPainted(false);
		add(no2);
		existing_accountButton = new ButtonGroup();
		existing_accountButton.add(no2);
		existing_accountButton.add(yes2);
		
		back = new JButton("BACK");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Raleway", Font.BOLD, 14));
		back.setBounds(340, 480, 80, 30);
		back.setFocusPainted(false);
		back.addActionListener(this);
		add(back);
				
		clear = new JButton("CLEAR");
		clear.setBounds(430, 480, 80, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.setFocusPainted(false);
		clear.addActionListener(this);
		add(clear);
		
		next = new JButton("NEXT");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(520, 480, 80, 30);
		next.setFocusPainted(false);
		next.addActionListener(this);
		add(next);
		
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setSize(800, 800);
		setVisible(true);
		setLocation(250, 20);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String formNo = this.formNo;
		String category = (String) categoryField.getSelectedItem();
		String income = (String) incomeField.getSelectedItem();
		String education = (String) educationField.getSelectedItem();
		String occupation = (String) occupField.getSelectedItem();
		String pan = panField.getText();
		String seniorCiti = null;
		
		if(yes.isSelected()) {
			seniorCiti = "Yes";
		}else if(no.isSelected()) {
			seniorCiti = "No";
		}
		
		String existingAccount = null;
		
		if(yes2.isSelected()) {
			existingAccount = "Yes";
		}else if(no2.isSelected()) {
			existingAccount = "No";
		}
		
		if(e.getSource() == next) {
			
			try {

				Conn c = new Conn();
				String query = "Insert into signuptwo values ('" + formNo + "', '" + category + "', '" + income + "',"
						+ " '" + education + "', '" + occupation + "', '" + pan + "'," + " '" + seniorCiti + "', '"
						+ existingAccount + "')";
				c.s.executeUpdate(query);			

			} catch (Exception e1) {
				System.out.println(e1);
			}
			
		} else if (e.getSource() == clear) {			
			
			categoryField.removeAllItems();
			incomeField.removeAllItems();
			educationField.removeAllItems();
			occupField.removeAllItems();
			panField.setText("");
			seniorButton.clearSelection();
			existing_accountButton.clearSelection();

		} else if (e.getSource() == back) {

			setVisible(false);
			new SignUpOne().setVisible(true);
		} 		
		
	}

	public static void main(String[] args) {
		new SignUpTwo("");

	}

}

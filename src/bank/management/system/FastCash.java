package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class FastCash extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton hundred, fivehundred, thousand, twothousand, fivethousand, tenthousand, back;
	String pinNumber;
	
	FastCash(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0,700, 700);
		add(image);
		
		JLabel text = new JLabel("Select withdraw amount");
		text.setBounds(145, 240, 700, 30);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		hundred = new JButton("$ 100.00");
		hundred.setBounds(130, 323, 130, 24);
		hundred.addActionListener(this);
		image.add(hundred);
		
		fivehundred = new JButton("$ 500.00");
		fivehundred.setBounds(130, 350, 130, 24);
		fivehundred.addActionListener(this);
		image.add(fivehundred);
		
		thousand = new JButton("$ 1,000.00");
		thousand.setBounds(265,323, 130, 24);
		thousand.addActionListener(this);
		image.add(thousand);
		
		twothousand = new JButton("$ 2,000.00");
		twothousand.setBounds(265, 350, 130, 24);
		twothousand.addActionListener(this);
		image.add(twothousand);
		
		fivethousand = new JButton("$ 5,000.00");
		fivethousand.setBounds(130, 378, 130, 24);
		fivethousand.addActionListener(this);
		image.add(fivethousand);
		
		tenthousand = new JButton("$ 10,000.00");
		tenthousand.setBounds(265, 378, 130, 24);
		tenthousand.addActionListener(this);
		image.add(tenthousand);
		
		back = new JButton("BACK");
		back.setBounds(265, 406, 130, 24);
		back.addActionListener(this);
		image.add(back);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}else {
			String amount = ((JButton)e.getSource()).getText().substring(3);
			Conn c = new Conn();
			try {
				Integer balance = 0;
				ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
				while(rs.next()) {
					if (rs.getString("type").equals("Deposit")) {
						balance =+ Integer.parseInt(rs.getString("amount"));
					} else {
						balance =- Integer.parseInt(rs.getString("amount"));
					}
				}
				
				if(e.getSource() != back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient balance");
					return;
				}
				
				Date date = new Date();
				String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdraw', '"+amount+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "$ "+amount+ " debited successfully");
				
				setVisible(false);
				new Transactions(pinNumber).setVisible(true);
			} catch(Exception e1){
				System.out.println(e1);
			}
		}
	}
	
	public static void main(String[] args) {
		new FastCash("");
	}

	
		
	

}

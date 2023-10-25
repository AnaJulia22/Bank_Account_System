package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener	{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton deposit, back;
	JTextField amount ;
	String pinNumber;
	
	Deposit(String pinNumber){
		
		this.pinNumber = pinNumber;
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2); 
		JLabel image = new JLabel(i3); 
		image.setBounds(0, 0, 700, 700);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to deposit");
		text.setBounds(150, 240, 500, 30);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 12));
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 12));
		amount.setBounds(135, 280, 250, 20);
		image.add(amount);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(265, 378, 130, 24);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back = new JButton("BACK");
		back.setBounds(265, 406, 130, 24);
		back.addActionListener(this);
		image.add(back);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}

	public static void main(String[] args) {
		new Deposit("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == deposit) {
			
		}else if(e.getSource() == back) {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
		
	}

}

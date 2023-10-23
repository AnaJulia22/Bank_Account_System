package bank.management.system;

import java.awt.*;

import javax.swing.*;

public class Transactions extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Transactions(){
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0, 600, 600);
		add(image);
		
		JLabel text = new JLabel("Please select your transaction");
		text.setBounds(135, 200, 700, 30);
		text.setForeground(Color.WHITE);
		//text.setFont(new Font("System", Font.BOLD, 12));
		image.add(text);
		
		JButton deposit = new JButton("Deposit");
		deposit.setBounds(115, 276, 100, 21);
		image.add(deposit);
		
		JButton withdraw = new JButton("Withdraw");
		withdraw.setBounds(115, 300, 100, 21);
		image.add(withdraw);
		
		JButton fastcash = new JButton("Fast cash");
		fastcash.setBounds(235, 276, 100, 21);
		image.add(fastcash);
		
		setSize(600, 600);
		setVisible(true);
		setLocation(300, 30);
	}
	
	public static void main(String[] args) {
		new Transactions();
	}

}

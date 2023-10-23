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
		i1.setImage(i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0, 800, 800);
		add(image);
		
		JLabel text = new JLabel("Please select your transaction");
		text.setBounds(180, 280, 700, 30);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		JButton deposit = new JButton("Deposit");
		deposit.setBounds(150, 370, 140, 24);
		image.add(deposit);
		
		JButton withdraw = new JButton("Cash withdrawal");
		withdraw.setBounds(150, 400, 140, 24);
		image.add(withdraw);
		
		JButton fastcash = new JButton("Fast cash");
		fastcash.setBounds(310,370, 140, 24);
		image.add(fastcash);
		
		JButton miniState = new JButton("Mini Statement");
		miniState.setBounds(310, 400, 140, 24);
		image.add(miniState);
		
		JButton pinChange = new JButton("PIN change");
		pinChange.setBounds(150, 430, 140, 24);
		image.add(pinChange);
		
		JButton balanceEnquiry = new JButton("Balance enquiry");
		balanceEnquiry.setBounds(310, 430, 140, 24);
		image.add(balanceEnquiry);
		
		JButton next = new JButton("NEXT");
		next.setBounds(310, 460, 140, 24);
		image.add(next);
		
		setSize(800, 800);
		setVisible(true);
		setLocation(300, 0);
	}
	
	public static void main(String[] args) {
		new Transactions();
	}

}

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

public class Transactions extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton deposit, withdraw, fastcash, miniState, pinChange, balanceEnquiry, exit;
	String pinNumber;
	
	Transactions(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0,700, 700);
		add(image);
		
		JLabel text = new JLabel("Please select your transaction");
		text.setBounds(145, 240, 700, 30);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(130, 323, 130, 24);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdraw = new JButton("Cash withdrawal");
		withdraw.setBounds(130, 350, 130, 24);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		fastcash = new JButton("Fast cash");
		fastcash.setBounds(265,323, 130, 24);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		miniState = new JButton("Mini Statement");
		miniState.setBounds(265, 350, 130, 24);
		miniState.addActionListener(this);
		image.add(miniState);
		
		pinChange = new JButton("PIN change");
		pinChange.setBounds(130, 378, 130, 24);
		pinChange.addActionListener(this);
		image.add(pinChange);
		
		balanceEnquiry = new JButton("Balance enquiry");
		balanceEnquiry.setBounds(265, 378, 130, 24);
		balanceEnquiry.addActionListener(this);
		image.add(balanceEnquiry);
		
		exit = new JButton("EXIT");
		exit.setBounds(265, 406, 130, 24);
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exit) {
			System.exit(0);
		}else if (e.getSource() == deposit) {
			setVisible(false);
			new Deposit(pinNumber).setVisible(true);
		}else if (e.getSource() == withdraw) {
			setVisible(false);
			new Withdraw(pinNumber).setVisible(true);
		}else if (e.getSource() == fastcash) {
			setVisible(false);
			new FastCash(pinNumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Transactions("");
	}

	
		
	

}

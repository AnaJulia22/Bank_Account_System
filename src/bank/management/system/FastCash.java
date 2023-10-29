package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton deposit, withdraw, fastcash, miniState, pinChange, balanceEnquiry, exit;
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
		
		deposit = new JButton("$ 100.00");
		deposit.setBounds(130, 323, 130, 24);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdraw = new JButton("$ 500.00");
		withdraw.setBounds(130, 350, 130, 24);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		fastcash = new JButton("$ 1000.00");
		fastcash.setBounds(265,323, 130, 24);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		miniState = new JButton("$ 2000.00");
		miniState.setBounds(265, 350, 130, 24);
		miniState.addActionListener(this);
		image.add(miniState);
		
		pinChange = new JButton("$ 5000.00");
		pinChange.setBounds(130, 378, 130, 24);
		pinChange.addActionListener(this);
		image.add(pinChange);
		
		balanceEnquiry = new JButton("$ 10000.00");
		balanceEnquiry.setBounds(265, 378, 130, 24);
		balanceEnquiry.addActionListener(this);
		image.add(balanceEnquiry);
		
		exit = new JButton("BACK");
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
				
				if(e.getSource() != exit && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient balance");
					return;
				}
				
				Date date = new Date();
				String query = "insert into bank calues('"+pinNumber+"', '"+date+"', 'Withdraw', '"+amount+"')";
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

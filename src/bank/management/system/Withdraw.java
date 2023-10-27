package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdraw extends JFrame implements ActionListener	{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton withdraw, back;
	JTextField amount ;
	String pinNumber;
	
	Withdraw(String pinNumber){
		
		this.pinNumber = pinNumber;
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2); 
		JLabel image = new JLabel(i3); 
		image.setBounds(0, 0, 700, 700);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to withdraw");
		text.setBounds(150, 240, 500, 30);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 12));
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 12));
		amount.setBounds(135, 280, 250, 20);
		image.add(amount);
		
		withdraw = new JButton("Withdraw");
		withdraw.setBounds(265, 378, 130, 24);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		back = new JButton("BACK");
		back.setBounds(265, 406, 130, 24);
		back.addActionListener(this);
		image.add(back);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}

	public static void main(String[] args) {
		new Withdraw("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == withdraw) {
			String number = amount.getText();
			Date date = new Date();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
				
			}else {
				Conn conn = new Conn();
				String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdraw', '"+number+"')";
				try {
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "$ "+number+" withdrawn  successfully");
					setVisible(false);
					new Transactions(pinNumber).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
					
		}else if(e.getSource() == back) {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
		
	}

}

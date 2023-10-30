package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
public class MiniState extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton back;
	String pinNumber;

	MiniState(String pinNumber){
		this.pinNumber = pinNumber;
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel bank = new JLabel("Bank account");
		bank.setBounds(200, 20, 200, 20);
		bank.setFont(new Font("System", Font.BOLD, 16));
		add(bank);
		
		JLabel card = new JLabel();
		card.setBounds(150, 100, 300, 20);
		add(card);
		
		JLabel mini = new JLabel();
		mini.setBounds(20,40,400,200);
		add(mini);
		
		JLabel balanceLabel = new JLabel();
		balanceLabel.setBounds(20, 60, 400, 200);
		add(balanceLabel);
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinNumber+"'");
			while(rs.next()){
				card.setText("Card Number: " + rs.getString("cardNumber").substring(0,4)+"XXXXXXXX" + rs.getString("cardNumber").substring(12));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Integer balance = 0;
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
			while(rs.next()) {
				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "$"+rs.getString("amount")+"<br><br><html>");
				
				if (rs.getString("type").equals("Deposit")) {
					balance =+ Integer.parseInt(rs.getString("amount"));
				} else {
					balance =- Integer.parseInt(rs.getString("amount"));
				}
			}
			
			balanceLabel.setText("Your current account balance: $" + balance);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		back = new JButton("BACK");
		back.setBounds(270, 406, 130, 24);
		back.addActionListener(this);
		add(back);
		
		setSize(500, 600);
		setVisible(true);
		setLocation(300, 0);
	}

	public static void main(String[] args) {
		new MiniState("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== back) {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
		
	}

}

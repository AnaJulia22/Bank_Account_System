package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton back;

	BalanceEnquiry(){
		
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0,700, 700);
		add(image);
		
		back = new JButton("BACK");
		back.setBounds(270, 406, 130, 24);
		back.addActionListener(this);
		image.add(back);
		
		setSize(700, 700);
		setVisible(true);
		setLocation(300, 0);
	}
	
	public static void main(String[] args) {
		new BalanceEnquiry();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

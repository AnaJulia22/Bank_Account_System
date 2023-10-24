package bank.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Deposit extends JFrame implements ActionListener	{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Deposit(){
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		i1.setImage(i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));
		JLabel image = new JLabel(i1); 
		image.setBounds(0, 0, 800, 800);
		add(image);
		setSize(800, 800);
		setVisible(true);
		setLocation(300, 0);
	}

	public static void main(String[] args) {
		new Deposit();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

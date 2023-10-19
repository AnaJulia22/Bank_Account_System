package bank.management.system;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SignUpThree() {
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("4305512.png"));
		setIconImage(image);
		
		setSize(800, 800);
		setVisible(true);
		setLocation(250, 20);
	}

	public static void main(String[] args) {
		new SignUpThree();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package projectA;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI implements ActionListener{
@SuppressWarnings("serial")

	public GUI() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JLabel GenderL = new JLabel("Gender: ");
		JButton Male = new JButton( new AbstractAction("Male") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.gender = "male";
				System.out.println("gender: " + formulas.gender);
			}	
		});
		//Male.addActionListener(this);
		Male.setBounds(0, 0, 80, 23);
		
		JButton Female = new JButton( new AbstractAction("Female") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.gender = "female";
				System.out.println("gender: " + formulas.gender);
			}	
		});
		//Female.addActionListener(this);
		Female.setBounds(0, 0, 80, 23);
		
		JTextField Age = new JTextField("Age");
		
		panel.setBorder(BorderFactory.createEmptyBorder(200, 480, 200, 480));
		panel.setLayout(new GridLayout(7, 4, 2, 2 ));
		panel.add(GenderL);
		panel.add(Male);
		panel.add(Female);
		panel.add(Age);
		
		
		
		
		frame.add(panel, BorderLayout.WEST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Basal Metabolic Rate Calculator");
		frame.pack();
		frame.setVisible(true);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

	
}

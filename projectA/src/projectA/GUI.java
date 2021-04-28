package projectA;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI implements ActionListener{
@SuppressWarnings("serial")

	double bmr;
	double roundedBRM;
	
	JButton Male;
	JButton Female;
	
	public GUI() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JLabel GenderL = new JLabel("Gender: ");
		Male = new JButton( new AbstractAction("Male") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.gender = "male";
				System.out.println("gender: " + formulas.gender);
				Male.setEnabled(false);
				Female.setEnabled(true);
			}	
		});
		//Male.addActionListener(this);
		//Male.setBounds(0, 0, 80, 23);
		
		
		Female = new JButton( new AbstractAction("Female") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.gender = "female";
				System.out.println("gender: " + formulas.gender);
				Female.setEnabled(false);
				Male.setEnabled(true);
				
			}	
		});
		//Female.addActionListener(this);
		//Female.setBounds(0, 0, 80, 23);
		
		JLabel AgeL = new JLabel("Age: ");
		JTextField Age = new JTextField("Age");
		Age.setBounds(40, 80, 40, 80);
		
		JButton AgeConfirm = new JButton( new AbstractAction("Set Age") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.age = Integer.parseInt(Age.getText());
				System.out.println("Age: " + formulas.age);
				
			}
			
		});
		
		JLabel HeightL = new JLabel("Height: ");
		JTextField Height = new JTextField("Height in cm");
		Height.setBounds(40, 80, 40, 80);
		
		JButton HeightConfirm = new JButton( new AbstractAction("Set Height") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.heightMetric = Integer.parseInt(Height.getText());
				System.out.println("Height: " + formulas.heightMetric);
				
			}
			
		});
		
		JLabel WeightL = new JLabel("Weight: ");
		JTextField Weight = new JTextField("Weight in kg");
		Height.setBounds(40, 80, 40, 80);
		
		JButton WeightConfirm = new JButton( new AbstractAction("Set Weight") {
			@Override
			public void actionPerformed(ActionEvent e) {
				formulas.weightMetric = Integer.parseInt(Weight.getText());
				System.out.println("Weight: " + formulas.weightMetric);
				
			}
			
		});
		
		JLabel Filler = new JLabel("");
		
		JTextField BMRL = new JTextField("Basal Metabolic Rate");
		BMRL.setEditable(false);
		
		JButton Calculate = new JButton( new AbstractAction("Calculate") {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				formulas.age = Integer.parseInt(Age.getText());
				formulas.heightMetric = Integer.parseInt(Height.getText());
				formulas.weightMetric = Integer.parseInt(Weight.getText());
				
				bmr = formulas.getBMR();
				
				
				roundedBRM = Math.round(bmr * 100.0) / 100.0;
				
				BMRL.setText(String.valueOf(roundedBRM));
				
			}
			
		});
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 2;
		c.gridy = 0;
		panel.add(GenderL, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 2;
		c.gridy = 1;
		panel.add(Male, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 2;
		c.gridy = 2;
		panel.add(Female, c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(40,0,0,40);
		c.gridx = 1;
		c.gridy = 3;
		panel.add(AgeL, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 1;
		c.gridy = 4;
		panel.add(Age, c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(40,0,0,0);
		c.gridx = 2;
		c.gridy = 3;
		panel.add(HeightL, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 2;
		c.gridy = 4;
		panel.add(Height, c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(40,0,0,0);
		c.gridx = 3;
		c.gridy = 3;
		panel.add(WeightL, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 3;
		c.gridy = 4;
		panel.add(Weight, c);
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(40,-20,0,-20);
		c.gridx = 2;
		c.gridy = 5;
		panel.add(BMRL, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,0,0,0);
		c.gridx = 2;
		c.gridy = 6;
		panel.add(Calculate, c);
		
		
		frame.add(panel, BorderLayout.CENTER);
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

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {

	public Window() {
		setTitle("Calculadora");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());		
		
		
		JLabel number = new JLabel("0.0");
		JPanel panel1 = new JPanel();
		
		Operations operations = new Operations(number);
		
		add(panel1, BorderLayout.PAGE_START);
		panel1.add(number);
		
		JPanel panel2 = new JPanel();	
		add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(5,4));
		
		
		
		JButton b1 = new JButton("C");
		b1.addActionListener(operations);
		b1.setActionCommand("C");
		JButton b2 = new JButton("/");
		b2.addActionListener(operations);
		b2.setActionCommand("DIV");
		JButton b3 = new JButton("X");
		b3.addActionListener(operations);
		b3.setActionCommand("MULT");
		JButton b4 = new JButton("<-");
		b4.addActionListener(operations);
		b4.setActionCommand("ERASE");
		JButton b5 = new JButton("7");
		b5.addActionListener(operations);
		b5.setActionCommand("7");
		JButton b6 = new JButton("8");
		b6.addActionListener(operations);
		b6.setActionCommand("8");
		JButton b7 = new JButton("9");
		b7.addActionListener(operations);
		b7.setActionCommand("9");
		JButton b8 = new JButton("-");
		b8.addActionListener(operations);
		b8.setActionCommand("MEN");
		JButton b9 = new JButton("4");
		b9.addActionListener(operations);
		b9.setActionCommand("4");
		JButton b10 = new JButton("5");
		b10.addActionListener(operations);
		b10.setActionCommand("5");
		JButton b11 = new JButton("6");
		b11.addActionListener(operations);
		b11.setActionCommand("6");
		JButton b12 = new JButton("+");
		b12.addActionListener(operations);
		b12.setActionCommand("ADD");
		JButton b13 = new JButton("1");
		b13.addActionListener(operations);
		b13.setActionCommand("1");
		JButton b14 = new JButton("2");
		b14.addActionListener(operations);
		b14.setActionCommand("2");
		JButton b15 = new JButton("3");
		b15.addActionListener(operations);
		b15.setActionCommand("3");
		JButton b16 = new JButton("?");
		b16.addActionListener(operations);
		b16.setActionCommand("?");
		JButton b17 = new JButton("0");
		b17.addActionListener(operations);
		b17.setActionCommand("0");
		JButton b18 = new JButton(".");
		b18.addActionListener(operations);
		b18.setActionCommand("PON");
		JButton b19 = new JButton("?");
		b19.addActionListener(operations);
		b19.setActionCommand("?");
		JButton b20 = new JButton("=");
		b20.addActionListener(operations);
		b20.setActionCommand("EQUALS");		
		
		panel2.add(b1);		
		panel2.add(b2);	
		panel2.add(b3);	
		panel2.add(b4);	
		panel2.add(b5);	
		panel2.add(b6);	
		panel2.add(b7);	
		panel2.add(b8);	
		panel2.add(b9);	
		panel2.add(b10);	
		panel2.add(b11);	
		panel2.add(b12);	
		panel2.add(b13);	
		panel2.add(b14);	
		panel2.add(b15);	
		panel2.add(b16);	
		panel2.add(b17);	
		panel2.add(b18);	
		panel2.add(b19);	
		panel2.add(b20);			
		
		
		
		
		
		
		
		
		
		
		


	}

}

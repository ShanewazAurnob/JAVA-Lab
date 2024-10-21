import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exp15.SaveInfo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private SaveInfo sInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public MainWindow() throws IOException {
		sInfo = new SaveInfo("C:\\Users\\Dell\\eclipse-workspace\\Exp15\\src\\employee.dat", true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel.setBounds(26, 45, 60, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();

		textField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField.setBounds(112, 44, 314, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblDesignation.setBounds(26, 81, 76, 25);
		contentPane.add(lblDesignation);
		
		textField_1 = new JTextField();

		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(112, 80, 314, 26);
		contentPane.add(textField_1);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblBasicSalary.setBounds(26, 117, 76, 25);
		contentPane.add(lblBasicSalary);
		
		textField_2 = new JTextField();

		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(112, 116, 314, 26);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField.getText();
				String d = textField_1.getText();
				String s = textField_2.getText();
				if (n.isEmpty() || d.isEmpty() || s.isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Please make sure all the fields are filled with information!");
					return;
				}
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				try {
					sInfo.write("Name: " + n  + "\n") ;
					sInfo.write("Designation: " + d + "\n");
					sInfo.write("Basic Salary: " + s + "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnNewButton.setBounds(230, 220, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(0xff, 0xff, 0xff));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sInfo.close();
				} catch (Exception excep) {
					excep.printStackTrace();
				}
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnCancel.setBounds(325, 220, 85, 21);
		btnCancel.setBackground(new Color(0xff, 0xff, 0xff));
		contentPane.add(btnCancel);
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField.getText();
				String d = textField_1.getText();
				String s = textField_2.getText();
				if (n.isEmpty() || d.isEmpty() || s.isEmpty()) {
					JOptionPane.showMessageDialog(textField, "Please make sure all the fields are filled with information!");
					return;
				}
				btnNewButton.doClick();
			}
		});
		
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField.getText();
				String d = textField_1.getText();
				String s = textField_2.getText();
				if (n.isEmpty() || d.isEmpty() || s.isEmpty()) {
					JOptionPane.showMessageDialog(textField_1, "Please make sure all the fields are filled with information!");
					return;
				}
				btnNewButton.doClick();
			}
		});
		
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField.getText();
				String d = textField_1.getText();
				String s = textField_2.getText();
				if (n.isEmpty() || d.isEmpty() || s.isEmpty()) {
					JOptionPane.showMessageDialog(textField_2, "Please make sure all the fields are filled with information!");
					return;
				}
				
				btnNewButton.doClick();
			}
		});
	}
}

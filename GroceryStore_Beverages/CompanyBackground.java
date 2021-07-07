package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class CompanyBackground extends JFrame{

	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground window = new CompanyBackground();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CompanyBackground() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1207, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1193, 595);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 859, 497);
		panel.add(scrollPane);
		
		JTextArea Details = new JTextArea();
		Details.setBackground(new Color(255, 240, 245));
		Details.setText("=========== Beverages Store ==========\r\nNO 50, Jln Lp 1,\r\nTaman Limbongan Permai,\r\n75200 Melaka\r\n03-2888588\r\n======================================\r\n\r\n");
		Details.setFont(new Font("Monospaced", Font.BOLD, 18));
		scrollPane.setViewportView(Details);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBackground(new Color(240, 240, 240));
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnExit.setBounds(1072, 531, 111, 46);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(393, 0, 800, 375);
		lblNewLabel.setIcon(new ImageIcon(CompanyBackground.class.getResource("/GroceryStoreMainPageImage/background cover.jpg")));
		panel.add(lblNewLabel);
		
		JButton btnCheckPromo = new JButton("Check Promo");
		btnCheckPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				
				try {
					FileReader reader = new FileReader(filename);
					BufferedReader br = new BufferedReader(reader);
					Details.read(br, null);
					br.close();
					Details.requestFocus();
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}

		});
		btnCheckPromo.setForeground(Color.BLACK);
		btnCheckPromo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCheckPromo.setBackground(SystemColor.menu);
		btnCheckPromo.setBounds(656, 531, 213, 46);
		panel.add(btnCheckPromo);
		
		JButton btnCheckBeveragesDescription = new JButton("Check Beverages Description");
		btnCheckBeveragesDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				
				try {
					FileReader reader = new FileReader(filename);
					BufferedReader br = new BufferedReader(reader);
					Details.read(br, null);
					br.close();
					Details.requestFocus();
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}

		});
		btnCheckBeveragesDescription.setForeground(Color.BLACK);
		btnCheckBeveragesDescription.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCheckBeveragesDescription.setBackground(SystemColor.menu);
		btnCheckBeveragesDescription.setBounds(10, 531, 472, 46);
		panel.add(btnCheckBeveragesDescription);
		
		
	}
}

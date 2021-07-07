package GroceryStore_FruitsAndVege;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {	//User-defined class

	private JPanel contentPane;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1305, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1291, 710);
		contentPane.add(panel);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblHome.setBounds(558, 55, 141, 46);
		panel.add(lblHome);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login a = new Login();		//Button Admin connect to Login menu
				a.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnAdmin.setBackground(Color.YELLOW);
		btnAdmin.setBounds(308, 292, 246, 97);
		panel.add(btnAdmin);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Billing a = new Billing();		//Button User connect to Billing menu
				a.setVisible(true);
				dispose();
			}
		});
		btnCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnCustomer.setBackground(Color.YELLOW);
		btnCustomer.setBounds(703, 292, 246, 97);
		panel.add(btnCustomer);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();		//Exit button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Home", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(495, 472, 246, 97);
		panel.add(btnExit);
		
		JLabel lblMessage = new JLabel("Please choose your identity");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblMessage.setBounds(419, 160, 435, 51);
		panel.add(lblMessage);
	}
}

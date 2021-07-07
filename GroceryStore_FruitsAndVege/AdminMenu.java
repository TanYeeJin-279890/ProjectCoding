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

public class AdminMenu extends JFrame {		//User-defined class

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1324, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1310, 724);
		contentPane.add(panel);
		
		JLabel lblMenu = new JLabel("Admin Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblMenu.setBounds(513, 42, 292, 48);
		panel.add(lblMenu);
		
		JButton btnCompany = new JButton("Company Background");
		btnCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground a = new CompanyBackground();		//Button Company Background connect to Company Background Menu
				a.setVisible(true);
				dispose();
			}
		});
		btnCompany.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCompany.setBackground(Color.YELLOW);
		btnCompany.setBounds(169, 180, 233, 48);
		panel.add(btnCompany);
		
		JButton btnProduct = new JButton("Product Description");
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription a = new ProductDescription();	//Button Product Description connect to Product Description Menu
				a.setVisible(true);
				dispose();
			}
		});
		btnProduct.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnProduct.setBackground(Color.YELLOW);
		btnProduct.setBounds(534, 180, 233, 48);
		panel.add(btnProduct);
		
		JButton btnInventory = new JButton("Inventory Management");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory a = new Inventory();		//Button Inventory Management connect to Inventory Menu
				a.setVisible(true);
				dispose();
			}
		});
		btnInventory.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnInventory.setBackground(Color.YELLOW);
		btnInventory.setBounds(327, 392, 233, 48);
		panel.add(btnInventory);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing a = new Marketing();		//Button Finance connect to Finance Menu
				a.setVisible(true);
				dispose();
			}
		});
		btnFinance.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnFinance.setBackground(Color.YELLOW);
		btnFinance.setBounds(726, 392, 233, 48);
		panel.add(btnFinance);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();		//Action for button Exit
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin Menu", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home a = new Home();	//Button Exit connect to Home
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(534, 546, 233, 48);
		panel.add(btnExit);
		
		JButton btnCustomerRegister = new JButton("Customer Registration");
		btnCustomerRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserRegistration a = new UserRegistration();		//Button Customer Registration connect to Customer Registration Menu
				a.setVisible(true);
				dispose();
			}
		});
		btnCustomerRegister.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCustomerRegister.setBackground(Color.YELLOW);
		btnCustomerRegister.setBounds(860, 180, 233, 48);
		panel.add(btnCustomerRegister);
	}

}

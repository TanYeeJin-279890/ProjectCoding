package GroceryStore_Bakery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cover {

	public JFrame cover;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cover window = new Cover();
					window.cover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cover() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cover = new JFrame();
		cover.setBounds(100, 100, 1162, 722);
		cover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cover.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 1128, 663);
		cover.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel UserType = new JLabel("Select User Type");
		UserType.setHorizontalAlignment(SwingConstants.CENTER);
		UserType.setForeground(Color.DARK_GRAY);
		UserType.setFont(new Font("Rockwell", Font.BOLD, 40));
		UserType.setBounds(364, 313, 394, 111);
		panel.add(UserType);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BilingSystem().BillingSystem.setVisible(true);
				cover.dispose();
			}
		});
		btnCustomer.setBackground(Color.WHITE);
		btnCustomer.setForeground(Color.DARK_GRAY);
		btnCustomer.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnCustomer.setBounds(284, 467, 193, 60);
		panel.add(btnCustomer);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminPage().AdminPage.setVisible(true);
				cover.dispose();
			}
		});
		btnAdmin.setForeground(Color.DARK_GRAY);
		btnAdmin.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.setBounds(632, 467, 193, 60);
		panel.add(btnAdmin);
		
		JLabel lblWELCOME = new JLabel("WELCOME TO");
		lblWELCOME.setForeground(Color.DARK_GRAY);
		lblWELCOME.setHorizontalAlignment(SwingConstants.CENTER);
		lblWELCOME.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblWELCOME.setBounds(381, 61, 337, 78);
		panel.add(lblWELCOME);
		
		JLabel lblBakeryIndah = new JLabel("BAKERY INDAH");
		lblBakeryIndah.setHorizontalAlignment(SwingConstants.CENTER);
		lblBakeryIndah.setForeground(Color.DARK_GRAY);
		lblBakeryIndah.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBakeryIndah.setBounds(381, 167, 337, 78);
		panel.add(lblBakeryIndah);
	}
}

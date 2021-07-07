package GroceryStore_PersonalCare;

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

public class PersonalCareCover {

	public JFrame PersonalCareCover;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalCareCover window = new PersonalCareCover();
					window.PersonalCareCover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PersonalCareCover() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PersonalCareCover = new JFrame();
		PersonalCareCover.setBounds(100, 100, 1162, 722);
		PersonalCareCover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PersonalCareCover.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(10, 11, 1128, 663);
		PersonalCareCover.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblshopName = new JLabel("Watsun");
		lblshopName.setHorizontalAlignment(SwingConstants.CENTER);
		lblshopName.setForeground(new Color(255, 255, 255));
		lblshopName.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblshopName.setBounds(399, 11, 323, 111);
		panel.add(lblshopName);
		
		JLabel UserType = new JLabel("Select User Type");
		UserType.setHorizontalAlignment(SwingConstants.CENTER);
		UserType.setForeground(new Color(255, 255, 255));
		UserType.setFont(new Font("Rockwell", Font.BOLD, 40));
		UserType.setBounds(364, 313, 394, 111);
		panel.add(UserType);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BillingSystem().BillingSystem.setVisible(true);
				PersonalCareCover.dispose();
			}
		});
		btnCustomer.setBackground(new Color(230, 230, 250));
		btnCustomer.setForeground(new Color(0, 0, 0));
		btnCustomer.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnCustomer.setBounds(284, 467, 193, 60);
		panel.add(btnCustomer);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminPage().AdminPage.setVisible(true);
				PersonalCareCover.dispose();
			}
		});
		btnAdmin.setForeground(new Color(0, 0, 0));
		btnAdmin.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnAdmin.setBackground(new Color(230, 230, 250));
		btnAdmin.setBounds(632, 467, 193, 60);
		panel.add(btnAdmin);
	}
}


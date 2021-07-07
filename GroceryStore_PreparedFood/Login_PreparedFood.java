package GroceryStore_PreparedFood;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.border.MatteBorder;

public class Login_PreparedFood extends JFrame{

	public JFrame PreparedFood_Cover;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_PreparedFood window = new Login_PreparedFood();
					window.PreparedFood_Cover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_PreparedFood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PreparedFood_Cover = new JFrame();
		PreparedFood_Cover.setBounds(100, 100, 1156, 660);
		PreparedFood_Cover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PreparedFood_Cover.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(221, 160, 221)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 1128, 612);
		PreparedFood_Cover.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblshopName = new JLabel("Grocery Store");
		lblshopName.setBackground(new Color(240, 128, 128));
		lblshopName.setHorizontalAlignment(SwingConstants.CENTER);
		lblshopName.setForeground(new Color(238, 130, 238));
		lblshopName.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblshopName.setBounds(399, 11, 323, 111);
		panel.add(lblshopName);
		
		JLabel UserType = new JLabel("Select User Type");
		UserType.setBackground(new Color(240, 128, 128));
		UserType.setHorizontalAlignment(SwingConstants.CENTER);
		UserType.setForeground(new Color(238, 130, 238));
		UserType.setFont(new Font("Rockwell", Font.BOLD, 40));
		UserType.setBounds(362, 132, 394, 111);
		panel.add(UserType);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin().Admin.setVisible(true);
				PreparedFood_Cover.dispose();
			}
		});
		btnAdmin.setForeground(new Color(238, 130, 238));
		btnAdmin.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnAdmin.setBackground(new Color(253, 245, 230));
		btnAdmin.setBounds(462, 399, 193, 60);
		panel.add(btnAdmin);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer().Customer.setVisible(true);
				PreparedFood_Cover.dispose();
			}
		});
		btnCustomer.setBackground(new Color(253, 245, 230));
		btnCustomer.setForeground(new Color(238, 130, 238));
		btnCustomer.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnCustomer.setBounds(462, 279, 193, 60);
		panel.add(btnCustomer);
	}

}

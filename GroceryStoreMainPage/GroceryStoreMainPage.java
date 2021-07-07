package GroceryStoreMainPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import GroceryStore_Bakery.Cover;
import GroceryStore_Beverages.BeveragesCover;
import GroceryStore_FruitsAndVege.Home;
import GroceryStore_PersonalCare.PersonalCareCover;
import GroceryStore_PreparedFood.Login_PreparedFood;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class GroceryStoreMainPage {

	public JFrame Mainframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroceryStoreMainPage window = new GroceryStoreMainPage();
					window.Mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GroceryStoreMainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mainframe = new JFrame();
		Mainframe.setBounds(100, 100, 1297, 748);
		Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(95, 158, 160)));
		panel.setBackground(SystemColor.info);
		panel.setBounds(10, 11, 1263, 678);
		Mainframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGroceryStore = new JLabel("Welcome to Mighty Grocery Store");
		lblGroceryStore.setForeground(Color.WHITE);
		lblGroceryStore.setFont(new Font("Rockwell Condensed", Font.PLAIN, 99));
		lblGroceryStore.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroceryStore.setBounds(58, 34, 1128, 111);
		panel.add(lblGroceryStore);
		
		JLabel lblDepartment = new JLabel("Please Select Department");
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setFont(new Font("STXinwei", Font.BOLD, 30));
		lblDepartment.setBounds(55, 209, 381, 56);
		panel.add(lblDepartment);
		
		JButton btnBakery = new JButton("Bakery Department");
		btnBakery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cover().cover.setVisible(true);
				Mainframe.dispose();
			}
		});
		btnBakery.setBackground(SystemColor.info);
		btnBakery.setForeground(Color.BLACK);
		btnBakery.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnBakery.setBounds(516, 209, 336, 56);
		panel.add(btnBakery);
		
		JButton btnBeverages_1 = new JButton("Beverages Department");
		btnBeverages_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				Mainframe.dispose();
			}
		});
		btnBeverages_1.setForeground(Color.BLACK);
		btnBeverages_1.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnBeverages_1.setBackground(SystemColor.info);
		btnBeverages_1.setBounds(884, 209, 336, 56);
		panel.add(btnBeverages_1);
		
		JButton btnPersonalCareDepartment = new JButton("Personal Care Department");
		btnPersonalCareDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PersonalCareCover().PersonalCareCover.setVisible(true);
				Mainframe.dispose();
			}
		});
		btnPersonalCareDepartment.setForeground(Color.BLACK);
		btnPersonalCareDepartment.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnPersonalCareDepartment.setBackground(SystemColor.info);
		btnPersonalCareDepartment.setBounds(651, 299, 444, 56);
		panel.add(btnPersonalCareDepartment);
		
		JButton btnPreparedDepartment = new JButton("Prepared and Frozen Food Department");
		btnPreparedDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login_PreparedFood().PreparedFood_Cover.setVisible(true);
				Mainframe.dispose();
			}
		});
		btnPreparedDepartment.setForeground(Color.BLACK);
		btnPreparedDepartment.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnPreparedDepartment.setBackground(SystemColor.info);
		btnPreparedDepartment.setBounds(516, 497, 704, 56);
		panel.add(btnPreparedDepartment);
		
		JButton btnFreshProduceFruit = new JButton("Fresh Produce Fruit & Vegetables Department");
		btnFreshProduceFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home a = new Home();		//Button Admin connect to Login menu
				a.setVisible(true);
				Mainframe.dispose();
			}
		});
		btnFreshProduceFruit.setForeground(Color.BLACK);
		btnFreshProduceFruit.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnFreshProduceFruit.setBackground(SystemColor.info);
		btnFreshProduceFruit.setBounds(558, 395, 628, 56);
		panel.add(btnFreshProduceFruit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Asg3-P2\\Mighty.png"));
		lblNewLabel.setBounds(10, 11, 1243, 656);
		panel.add(lblNewLabel);
		
	}
}

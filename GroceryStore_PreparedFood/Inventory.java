package GroceryStore_PreparedFood;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Inventory extends JFrame {

	protected JFrame Inventory;
	private static JTable table;
	private JTextField txtProductName;
	private JTextField txtPrice;
	private JTextField txtQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory window = new Inventory();
					window.Inventory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inventory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Inventory = new JFrame();
		Inventory.setBounds(100, 100, 1156, 738);
		Inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Inventory.getContentPane().setForeground(Color.WHITE);
		Inventory.getContentPane().setBackground(SystemColor.controlHighlight);
		Inventory.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		Inventory.setJMenuBar(menuBar);

		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);

		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CompanyBackground().Company.setVisible(true);// calling another frame/window
				Inventory.dispose();
			}
		});
		mnHome.add(mntmAboutUs);

		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);

		JMenuItem mntmEmployeeManagement = new JMenuItem("Employee Management");
		mntmEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Employee().Employee.setVisible(true);// calling another frame/window
				Inventory.dispose();
			}
		});
		mnEmployee.add(mntmEmployeeManagement);

		JMenu mnFinance = new JMenu("Finance");
		menuBar.add(mnFinance);

		JMenuItem mntmFinanceReport = new JMenuItem("Finance Report");
		mntmFinanceReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Finance().Finance.setVisible(true);// calling another frame/window
				Inventory.dispose();
			}
		});
		mnFinance.add(mntmFinanceReport);

		JMenu mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);

		JMenuItem mntmInventoryManagement = new JMenuItem("Inventory Management");
		mntmInventoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inventory().Inventory.setVisible(true);// calling another frame/window
				Inventory.dispose();
			}
		});
		mnInventory.add(mntmInventoryManagement);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1142, 678);
		Inventory.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 121, 43);
		panel.add(btnBack);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Admin().Admin.setVisible(true);
				Inventory.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));

		JLabel lblInventoryManagement = new JLabel("Inventory Management");
		lblInventoryManagement.setForeground(new Color(187, 134, 252));
		lblInventoryManagement.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblInventoryManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventoryManagement.setBounds(346, 25, 516, 60);
		panel.add(lblInventoryManagement);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(40, 106, 385, 424);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setForeground(new Color(187, 134, 252));
		lblInventory.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblInventory.setBounds(10, 11, 365, 50);
		panel_1.add(lblInventory);

		JLabel lblProductName = new JLabel("Product name");
		lblProductName.setBounds(10, 80, 365, 21);
		panel_1.add(lblProductName);
		lblProductName.setHorizontalAlignment(SwingConstants.LEFT);
		lblProductName.setForeground(new Color(187, 134, 252));
		lblProductName.setFont(new Font("Roboto", Font.BOLD, 20));

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setForeground(new Color(187, 134, 252));
		lblPrice.setFont(new Font("Roboto", Font.BOLD, 20));
		lblPrice.setBounds(10, 190, 365, 29);
		panel_1.add(lblPrice);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(10, 300, 365, 29);
		panel_1.add(lblQuantity);
		lblQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantity.setForeground(new Color(187, 134, 252));
		lblQuantity.setFont(new Font("Roboto", Font.BOLD, 20));

		txtProductName = new JTextField();
		txtProductName.setForeground(Color.BLACK);
		txtProductName.setHorizontalAlignment(SwingConstants.LEFT);
		txtProductName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtProductName.setColumns(10);
		txtProductName.setBounds(10, 110, 365, 29);
		panel_1.add(txtProductName);

		txtQuantity = new JTextField();
		txtQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		txtQuantity.setForeground(Color.BLACK);
		txtQuantity.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(10, 330, 365, 29);
		panel_1.add(txtQuantity);

		txtPrice = new JTextField();
		txtPrice.setHorizontalAlignment(SwingConstants.LEFT);
		txtPrice.setForeground(Color.BLACK);
		txtPrice.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPrice.setColumns(10);
		txtPrice.setBounds(10, 220, 365, 29);
		panel_1.add(txtPrice);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(435, 106, 679, 424);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 659, 334);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "PRODUCT NAME", "PRICE(RM)", "QUANTITY" }));
		scrollPane.setViewportView(table);

		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\eclipse-workspace\\Assignment-3\\src\\Inventory.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < table.getRowCount(); i++) {
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
						bw.write("\n\t\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnUpload.setBackground(new Color(187, 134, 252));
		btnUpload.setBounds(105, 362, 120, 45);
		panel_2.add(btnUpload);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int i = table.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(txtProductName.getText(), i, 0);
					model.setValueAt(txtPrice.getText(), i, 1);
					model.setValueAt(txtQuantity.getText(), i, 2);
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnUpdate.setBackground(new Color(187, 134, 252));
		btnUpdate.setBounds(422, 362, 120, 45);
		panel_2.add(btnUpdate);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(40, 540, 1068, 107);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { txtProductName.getText(), txtPrice.getText(), txtQuantity.getText(), });

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setBackground(new Color(187, 134, 252));
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnAdd.setBounds(57, 29, 120, 45);
		panel_3.add(btnAdd);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtProductName.setText("");
				txtPrice.setText("");
				txtQuantity.setText("");
			}
		});
		btnReset.setBounds(267, 29, 120, 45);
		panel_3.add(btnReset);
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnReset.setBackground(new Color(187, 134, 252));

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Employee Management",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Employee Management",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnDelete.setBackground(new Color(187, 134, 252));
		btnDelete.setBounds(477, 29, 120, 45);
		panel_3.add(btnDelete);

		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});

		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnPrint.setBackground(new Color(187, 134, 252));
		btnPrint.setBounds(687, 29, 120, 45);
		panel_3.add(btnPrint);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory = new JFrame();
				if (JOptionPane.showConfirmDialog(Inventory, "Confirm if you want to exit", "Employee Management",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);

				}
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnExit.setBackground(new Color(187, 134, 252));
		btnExit.setBounds(897, 29, 120, 45);
		panel_3.add(btnExit);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Inventory.class.getResource("/Image/dribbble_shot-removebg-preview.png")));
		lblNewLabel.setBounds(300, 25, 60, 60);
		panel.add(lblNewLabel);
	}

	public static JTable getTable() {
		return table;
	}
}

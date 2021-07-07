package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finance extends JFrame {

	protected JFrame finance;
	private JTextField txtKeyInYear;
	private JTable table;
	private JTextField textFieldprofit;
	private JTextField textFieldnetincome_1;
	private JTextField textFieldRev;
	private JTextField textFieldInv;
	private JTextField textFieldSalary;
	private double InventoryExp,SalaryExp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance finance = new Finance();
					finance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Finance() {}
	
	public Finance(double totalInv,double total) {
		this.InventoryExp = totalInv;
		this.SalaryExp = total;
		
		
		setBounds(100, 100, 1305, 737);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1263, 678);
		getContentPane().add(panel);
		
		JLabel lblFinance = new JLabel("Finance");
		lblFinance.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinance.setForeground(new Color(148, 0, 211));
		lblFinance.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblFinance.setBounds(525, 14, 417, 54);
		panel.add(lblFinance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(255, 79, 973, 214);
		panel.add(panel_1);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(new Color(148, 0, 211));
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblYear.setBounds(10, 11, 58, 24);
		panel_1.add(lblYear);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setForeground(new Color(148, 0, 211));
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMonth.setBounds(10, 46, 58, 24);
		panel_1.add(lblMonth);
		
		JComboBox Month = new JComboBox();
		Month.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Month.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		Month.setBounds(78, 46, 196, 25);
		panel_1.add(Month);
		
		txtKeyInYear = new JTextField();
		txtKeyInYear.setText("Key In Year");
		txtKeyInYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInYear.setForeground(Color.BLACK);
		txtKeyInYear.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInYear.setColumns(10);
		txtKeyInYear.setBounds(79, 8, 146, 31);
		panel_1.add(txtKeyInYear);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double profit = 0.0,netincome = 0.0;
				double TotInv = InventoryExp;
				double TotSalary = SalaryExp;
				profit = Double.parseDouble(textFieldRev.getText())-TotInv;	       
				textFieldprofit.setText(Double.toString(profit));
				textFieldInv.setText(Double.toString(TotInv));
				textFieldSalary.setText(Double.toString(TotSalary));
				
				Payment g = new Financeexp();//interface
				double expenses = g.payment();
				netincome = profit-expenses-TotSalary;
				textFieldnetincome_1.setText(Double.toString(netincome));
						
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						txtKeyInYear.getText(),
						Month.getSelectedItem(),
						textFieldRev.getText(),
						textFieldInv.getText(),
						textFieldprofit.getText(),
						textFieldSalary.getText(),
						textFieldnetincome_1.getText(),
						
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Finance System",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setBounds(660, 160, 110, 43);
		panel_1.add(btnAdd);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(new Color(148, 0, 211));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInYear.setText("");
				textFieldRev.setText("");
				textFieldInv.setText("");
				textFieldSalary.setText("");
				textFieldprofit.setText("");
				textFieldnetincome_1.setText("");
				Month.setSelectedItem("Select Month");
				
			}
		});
		btnReset.setBounds(811, 160, 141, 43);
		panel_1.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(148, 0, 211));
		
		JLabel lblGrossIncome = new JLabel("Gross Income");
		lblGrossIncome.setForeground(new Color(148, 0, 211));
		lblGrossIncome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblGrossIncome.setBounds(595, 18, 135, 24);
		panel_1.add(lblGrossIncome);
		
		JLabel lblNetincome = new JLabel("Netincome");
		lblNetincome.setForeground(new Color(148, 0, 211));
		lblNetincome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNetincome.setBounds(595, 74, 104, 24);
		panel_1.add(lblNetincome);
		
		textFieldprofit = new JTextField();
		textFieldprofit.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldprofit.setForeground(Color.BLACK);
		textFieldprofit.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldprofit.setColumns(10);
		textFieldprofit.setBounds(740, 11, 186, 34);
		panel_1.add(textFieldprofit);
		
		textFieldnetincome_1 = new JTextField();
		textFieldnetincome_1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldnetincome_1.setForeground(Color.BLACK);
		textFieldnetincome_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldnetincome_1.setColumns(10);
		textFieldnetincome_1.setBounds(742, 66, 186, 34);
		panel_1.add(textFieldnetincome_1);
		
		JLabel lblRevenue = new JLabel("Revenue");
		lblRevenue.setForeground(new Color(148, 0, 211));
		lblRevenue.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblRevenue.setBounds(10, 88, 135, 24);
		panel_1.add(lblRevenue);
		
		textFieldRev = new JTextField("key in totalsales");
		textFieldRev.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldRev.setForeground(Color.BLACK);
		textFieldRev.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldRev.setColumns(10);
		textFieldRev.setBounds(155, 84, 186, 34);
		panel_1.add(textFieldRev);
		
		JLabel lblCogs = new JLabel("COGS");
		lblCogs.setForeground(new Color(148, 0, 211));
		lblCogs.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCogs.setBounds(10, 130, 135, 24);
		panel_1.add(lblCogs);
		
		textFieldInv = new JTextField();
		textFieldInv.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInv.setForeground(Color.BLACK);
		textFieldInv.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldInv.setColumns(10);
		textFieldInv.setBounds(155, 123, 186, 34);
		panel_1.add(textFieldInv);
		
		JLabel lblExpenses = new JLabel("EmployeeSalary");
		lblExpenses.setForeground(new Color(148, 0, 211));
		lblExpenses.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblExpenses.setBounds(10, 167, 135, 24);
		panel_1.add(lblExpenses);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSalary.setForeground(Color.BLACK);
		textFieldSalary.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(155, 160, 186, 34);
		panel_1.add(textFieldSalary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(255, 326, 985, 248);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 965, 226);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Year", "Month", "Revenue", "COGS", "Gross Income", "EmployeeSalary", "Net Income"},
			},
			new String[] {
				"Year", "Month", "Revenue", "COGS", "Gross Income", "EmployeeSalary", "Net Income"
			}
		));
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(89);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
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
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(new Color(148, 0, 211));
		btnPrint.setBounds(704, 606, 134, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(148, 0, 211));
		btnDelete.setBounds(481, 606, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(148, 0, 211));
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel BeveragesDescriptionPage = new JLabel("Beverages");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				finance.dispose();
			}
		});
		BeveragesDescriptionPage.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage.setBounds(10, 11, 111, 27);
		panel_4.add(BeveragesDescriptionPage);
		
		JLabel BeveragesDescriptionPage_1 = new JLabel("Description");
		BeveragesDescriptionPage_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				finance.dispose();
			}
		});
		BeveragesDescriptionPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage_1.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage_1.setBounds(10, 31, 111, 27);
		panel_4.add(BeveragesDescriptionPage_1);
		
		JLabel AdsAndMarketing = new JLabel("Ads and Marketing");
		AdsAndMarketing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads_and_Marketing().ads.setVisible(true);
				finance.dispose();
			}
		});
		
		AdsAndMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		AdsAndMarketing.setForeground(new Color(255, 204, 255));
		AdsAndMarketing.setFont(new Font("STXinwei", Font.BOLD, 18));
		AdsAndMarketing.setBounds(10, 125, 156, 27);
		panel_4.add(AdsAndMarketing);
		
		JLabel lblHomepage = new JLabel("HomePage");
		lblHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				finance.dispose();
			}
		});
		lblHomepage.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomepage.setForeground(new Color(255, 204, 255));
		lblHomepage.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblHomepage.setBounds(10, 528, 156, 27);
		panel_4.add(lblHomepage);
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\Finance System.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n\t\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnUpload.setBackground(new Color(148, 0, 211));
		btnUpload.setBounds(893, 606, 164, 43);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finance = new JFrame();
				if (JOptionPane.showConfirmDialog(finance, "Confirm if you want to exit", "Finance System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(1119, 606, 121, 43);
		panel.add(btnExit);
	}
}

package Main_Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KnownConditionandAllergies {

	JFrame KnownAllergiesAndConditionframe;
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton importButton;
	private Font customFont;
	private JPanel ManuPanel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KnownConditionandAllergies window = new KnownConditionandAllergies();
					window.KnownAllergiesAndConditionframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public KnownConditionandAllergies() {
		initialize();
	}

	private void initialize() {

		KnownAllergiesAndConditionframe = new JFrame();
		KnownAllergiesAndConditionframe.setBounds(100, 100, 1250, 870);
		KnownAllergiesAndConditionframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KnownAllergiesAndConditionframe.getContentPane().setLayout(null);

		// Load the custom font
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		ManuPanel = new JPanel();
		ManuPanel.setBackground(new Color(255, 255, 255));
		ManuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(23, 23, 23)));
		ManuPanel.setBounds(1009, 117, 197, 195);
		ManuPanel.setVisible(false);
		KnownAllergiesAndConditionframe.getContentPane().add(ManuPanel, BorderLayout.NORTH);
		ManuPanel.setLayout(null);

		Font MenuButtonFont = null;
		try {
			MenuButtonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JButton MyProfileButton = new JButton("My Profile");
		MyProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the Ownerprofile class
				Ownerprofile window = new Ownerprofile();
				// Set the visibility of the ownerframe to true
				window.ownerframe.setVisible(true);
				KnownAllergiesAndConditionframe.dispose();
			}
		});
		MyProfileButton.setBorderPainted(false);
		MyProfileButton.setHorizontalAlignment(JButton.LEFT);
		MyProfileButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		MyProfileButton.setBackground(new Color(255, 255, 255));
		MyProfileButton.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		MyProfileButton
				.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/OwnersProfileSign.png")));
		MyProfileButton.setBounds(10, 25, 177, 38);
		ManuPanel.add(MyProfileButton);

		JButton UsersManualButton = new JButton("User's Manual");
		UsersManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserManual usermanual = new UserManual();
				UserManual.main(null);
				KnownAllergiesAndConditionframe.dispose();
			}
		});
		UsersManualButton.setBorderPainted(false);
		UsersManualButton.setHorizontalAlignment(JButton.LEFT);
		UsersManualButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		UsersManualButton.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		UsersManualButton.setBackground(new Color(255, 255, 255));
		UsersManualButton
				.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/UserManualSign.png")));
		UsersManualButton.setBounds(20, 74, 177, 38);
		ManuPanel.add(UsersManualButton);

		JButton SignoutButton = new JButton("Sign Out");
		SignoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {

					KnownAllergiesAndConditionframe.dispose();

				}

			}
		});
		SignoutButton.setBorderPainted(false);
		SignoutButton.setHorizontalAlignment(JButton.LEFT);
		SignoutButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		SignoutButton.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		SignoutButton.setBackground(new Color(255, 255, 255));
		SignoutButton.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/SigoutSign.png")));
		SignoutButton.setBounds(10, 123, 177, 38);
		ManuPanel.add(SignoutButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 293, 1080, 398);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		KnownAllergiesAndConditionframe.getContentPane().add(scrollPane);

		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setFont(customFont.deriveFont(Font.PLAIN, 14));
		table.setRowHeight(40);

		tableModel = new DefaultTableModel(new Object[][] {},
				new String[] { "Pet's Illness", "Brief Description", "Drugs Taken" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(tableModel);

		scrollPane.setViewportView(table);

		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setBackground(new Color(188, 229, 223));
		tableHeader.setForeground(new Color(23, 23, 23));
		tableHeader.setFont(customFont.deriveFont(Font.PLAIN, 20));
		tableHeader.setOpaque(false);

		Font ButtonFont = null;
		try {
			ButtonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader()
				.getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(JLabel.CENTER);

		Font labelFont = customFont.deriveFont(Font.PLAIN, 12);

		JButton exportButton = new JButton("Save your Data");
		exportButton.setBorder(null);
		exportButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		exportButton.setForeground(new Color(255, 255, 255));
		exportButton.setBackground(new Color(19, 0, 90));
		exportButton.setBounds(901, 722, 254, 49);
		exportButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		KnownAllergiesAndConditionframe.getContentPane().add(exportButton);
		exportButton.addActionListener(e -> {
			try {
				exportTableData();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		});

		importButton = new JButton("Find your Data");
		importButton.setBorder(null);
		importButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}

		});
		importButton.setBackground(new Color(246, 186, 111));
		importButton.setForeground(new Color(23, 23, 23));
		importButton.setBounds(610, 722, 254, 49);
		importButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		KnownAllergiesAndConditionframe.getContentPane().add(importButton);

		Font customFont = null;
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT,
					new File("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\PTSans-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JLabel KnownAllergiesAndConditionsLAbel = new JLabel("Known Allergies and Conditions");
		KnownAllergiesAndConditionsLAbel.setForeground(new Color(23, 23, 23));
		KnownAllergiesAndConditionsLAbel.setFont((customFont.deriveFont(Font.BOLD, 40)));
		KnownAllergiesAndConditionsLAbel.setBounds(74, 219, 558, 60);
		KnownAllergiesAndConditionframe.getContentPane().add(KnownAllergiesAndConditionsLAbel);

		Font customFont1 = null;
		try {
			customFont1 = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
		panel.setBackground(new Color(19, 0, 90));
		panel.setBounds(0, 0, 1234, 115);
		KnownAllergiesAndConditionframe.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel logo = new JLabel("");
		logo.setBounds(10, 21, 193, 83);
		panel.add(logo);
		logo.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/SYSTEMLOGO 1.png")));

		JLabel MypetLabel = new JLabel("Home");
		MypetLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OwnerHomepage window = new OwnerHomepage();
				window.ownerhomepage.setVisible(true);
				KnownAllergiesAndConditionframe.dispose();
			}
		});
		MypetLabel.setForeground(new Color(255, 255, 255));
		MypetLabel.setBounds(285, 41, 118, 33);
		panel.add(MypetLabel);
		MypetLabel.setFont(customFont1.deriveFont(Font.BOLD, 18));

		JLabel aboutLabel = new JLabel("About");
		aboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs window = new AboutUs();
				AboutUs.main(null);
				KnownAllergiesAndConditionframe.dispose();
			}
		});
		aboutLabel.setForeground(new Color(255, 255, 255));
		aboutLabel.setBounds(413, 41, 118, 32);
		panel.add(aboutLabel);
		aboutLabel.setFont(customFont1.deriveFont(Font.BOLD, 18));

		JLabel contatcUSLabel = new JLabel("Contact Us");
		contatcUSLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUS window = new ContactUS();
				window.contactUs.setVisible(true);
				KnownAllergiesAndConditionframe.dispose();
			}
		});
		contatcUSLabel.setForeground(new Color(255, 255, 255));
		contatcUSLabel.setBounds(541, 44, 118, 27);
		panel.add(contatcUSLabel);
		contatcUSLabel.setFont(customFont1.deriveFont(Font.BOLD, 18));

		JButton MenuButton = new JButton("");
		MenuButton.setBorderPainted(false);
		MenuButton.setBorder(null);
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean isMenuPanelVisible = ManuPanel.isVisible();
				ManuPanel.setVisible(!isMenuPanelVisible);

			}
		});
		MenuButton.setBackground(new Color(19, 0, 90));
		MenuButton.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/Signoutmyprofile.png")));
		MenuButton.setBounds(1050, 34, 135, 54);
		panel.add(MenuButton);

		JPanel headerSelectionPanel = new JPanel();
		headerSelectionPanel.setBackground(new Color(188, 229, 223));
		headerSelectionPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		headerSelectionPanel.setBounds(741, 149, 347, 55);
		KnownAllergiesAndConditionframe.getContentPane().add(headerSelectionPanel);
		headerSelectionPanel.setLayout(null);

		JButton knownallergies = new JButton("");
		knownallergies
				.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/knownallergies.png")));
		knownallergies.setBorder(null);
		knownallergies.setBackground(new Color(188, 229, 223));
		knownallergies.setBounds(10, 11, 317, 24);
		headerSelectionPanel.add(knownallergies);

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(23, 23, 23)));
		mainPanel.setBounds(28, 202, 1178, 605);
		KnownAllergiesAndConditionframe.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);

		JButton clearButton = new JButton("");
		clearButton.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/Clearbutton.png")));
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		clearButton.setBounds(883, 25, 50, 49);
		mainPanel.add(clearButton);
		clearButton.setBorder(null);
		clearButton.addActionListener(e -> clearTableData());
		clearButton.setForeground(new Color(19, 0, 90));
		clearButton.setBackground(new Color(240, 240, 240));
		clearButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));

		JButton addDataButton = new JButton("");
		addDataButton.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/Addbutton.png")));
		addDataButton.setBounds(943, 25, 42, 49);
		mainPanel.add(addDataButton);
		addDataButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		addDataButton.setBorder(null);
		addDataButton.setForeground(new Color(255, 255, 255));
		addDataButton.setBackground(new Color(240, 240, 240));

		JButton immunizationbttn = new JButton("");
		immunizationbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImmunizationsDeworming immunizationsdeworming = new ImmunizationsDeworming();
				immunizationsdeworming.setVisible(true);
				KnownAllergiesAndConditionframe.dispose();
				
			}
		});
		immunizationbttn
				.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/regularimmunization.png")));
		immunizationbttn.setBackground(new Color(240, 240, 240));
		immunizationbttn.setBorder(null);
		immunizationbttn.setBounds(333, 156, 367, 24);
		KnownAllergiesAndConditionframe.getContentPane().add(immunizationbttn);

		JButton mypetsbttn = new JButton("");
		mypetsbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PetProfile window = new PetProfile();
				window.petProfileFrame.setVisible(true);
				KnownAllergiesAndConditionframe.dispose();
			}
		});
		mypetsbttn.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/project_images/petbutton.png")));
		mypetsbttn.setBorder(null);
		mypetsbttn.setBackground(new Color(240, 240, 240));
		mypetsbttn.setBounds(93, 157, 154, 27);
		KnownAllergiesAndConditionframe.getContentPane().add(mypetsbttn);
		addDataButton.addActionListener(e -> addInfo());

		importButton.addActionListener(e -> {
			try {
				importTableData();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		});
	}

	private void addInfo() {
		AddDataFormKnownCondition addDataForm = new AddDataFormKnownCondition(this);
		addDataForm.show();
	}

	public void addInfoFromForm(String Illnes, String Description, String Drugstaken) {
	    // Create an array with the data for the new row
		Object[] rowData = { Illnes, Description, Drugstaken };
	    // Add the row to the table model
		tableModel.addRow(rowData);
	}

	private void exportTableData() throws IOException {
		JFileChooser fileChooser = new JFileChooser("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\PetsData\\ConditionAllergies");
		fileChooser.setDialogTitle("Export Table Data");
		fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int userSelection = fileChooser.showSaveDialog(KnownAllergiesAndConditionframe);

		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File fileToSave = fileChooser.getSelectedFile();

		    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
		        // Write column names as the first row
		        for (int i = 0; i < tableModel.getColumnCount(); i++) {
		            writer.write(tableModel.getColumnName(i));
		            if (i < tableModel.getColumnCount() - 1) {
		                writer.write("\t");
		            }
		        }
		        writer.newLine();

		        // Write table data
		        for (int row = 0; row < tableModel.getRowCount(); row++) {
		            for (int column = 0; column < tableModel.getColumnCount(); column++) {
		                Object value = tableModel.getValueAt(row, column);
		                writer.write(value.toString());
		                if (column < tableModel.getColumnCount() - 1) {
		                    writer.write("\t");
		                }
		            }
		            writer.newLine();
		        }

		        JOptionPane.showMessageDialog(KnownAllergiesAndConditionframe, "Table data Saved successfully.");
		    } catch (IOException ex) {
		        JOptionPane.showMessageDialog(KnownAllergiesAndConditionframe,
		                "Error exporting table data: " + ex.getMessage(), "Export Error", JOptionPane.ERROR_MESSAGE);
		    }
		}
	}
	private void importTableData() throws IOException {
		JFileChooser fileChooser = new JFileChooser("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\PetsData\\ConditionAllergies");
		fileChooser.setDialogTitle("Import Table Data");
		fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int userSelection = fileChooser.showOpenDialog(KnownAllergiesAndConditionframe);

		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File fileToImport = fileChooser.getSelectedFile();

		    try (BufferedReader reader = new BufferedReader(new FileReader(fileToImport))) {
		        String line;
		        while ((line = reader.readLine()) != null) {
		        	// Split the line by the tab character
		            String[] data = line.split("\t");	            		            
		            // Add the data as a new row to the table model
		            tableModel.addRow(data);
		        }
		        JOptionPane.showMessageDialog(KnownAllergiesAndConditionframe, "Table data displayed successfully.");
		    } catch (IOException ex) {
		        JOptionPane.showMessageDialog(KnownAllergiesAndConditionframe,
		                "Error importing table data: " + ex.getMessage(), "Import Error", JOptionPane.ERROR_MESSAGE);
		    }
		}

	}

	private void clearTableData() {
		int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the data?",
				"Confirmation", JOptionPane.YES_NO_OPTION);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
	}

	public Font getCustomFont() {
		return customFont;
	}
}
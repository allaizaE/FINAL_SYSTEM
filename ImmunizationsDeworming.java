package Main_Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.border.MatteBorder;

public class ImmunizationsDeworming extends JFrame {
	private JTable table;
	private DefaultTableModel tableModel;

	private JTextField dateField;
	private JTextField timeField;
	private Timer timer;
	private TimerTask timerTask;
	private JPanel MenuPanel;

	public ImmunizationsDeworming() {

		Font ButtonFont = null;
		try {
			ButtonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		getContentPane().setForeground(new Color(240, 240, 240));
		// Set up JFrame properties
		setTitle("Regular Immunization & Deworming");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1250, 900);

		// Create sample data
		String[] columns = { "Date", "Weight", "Againts", "Manufacturer", "Lot Number", "Veterinarian" };
		Object[][] data = {  };

		// Create a table model with the data
		DefaultTableModel model = new DefaultTableModel(data, columns);
		getContentPane().setLayout(null);

		MenuPanel = new JPanel();
		MenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MenuPanel.setBackground(new Color(255, 255, 255));
		MenuPanel.setBounds(1027, 116, 197, 195);
		getContentPane().add(MenuPanel);
		MenuPanel.setLayout(null);

		Font MenuButtonFont = null;
		try {
			MenuButtonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JButton MyProfileButton = new JButton("Owner's Profile ");
		MyProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the Ownerprofile class
				Ownerprofile window = new Ownerprofile();
				// Set the visibility of the owner profile window to true
				window.ownerframe.setVisible(true);

				dispose();
			}
		});
		MyProfileButton.setHorizontalAlignment(JButton.LEFT);
		MyProfileButton.setBackground(new Color(255, 255, 255));
		MyProfileButton.setBorderPainted(false);
		MyProfileButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		MyProfileButton
				.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/OwnersProfileSign.png")));
		MyProfileButton.setBounds(20, 36, 177, 38);
		MenuPanel.add(MyProfileButton);

		JButton UsersManualButton = new JButton("User's Manual");
		UsersManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the UserManual class
				UserManual usermanual = new UserManual();
				// Call the main method of the UserManual class with a null argument
				UserManual.main(null);
				dispose();
			}
		});
		UsersManualButton.setBackground(new Color(255, 255, 255));
		UsersManualButton.setHorizontalAlignment(JButton.LEFT);
		UsersManualButton.setBorderPainted(false);
		UsersManualButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		UsersManualButton
				.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/UserManualSign.png")));
		UsersManualButton.setBounds(10, 85, 177, 40);
		MenuPanel.add(UsersManualButton);

		JButton SignOutButton = new JButton("Sign Out");
		SignOutButton.setHorizontalAlignment(JButton.LEFT);
		SignOutButton.setBackground(new Color(255, 255, 255));
		SignOutButton.setBorderPainted(false);
		SignOutButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		SignOutButton.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/SigoutSign.png")));
		SignOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {

					dispose();

				}
			}
		});
		SignOutButton.setBounds(10, 136, 177, 33);
		MenuPanel.add(SignOutButton);
		MenuPanel.setVisible(false);

		Font tableCellFont = null;
		try {
			tableCellFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font tableHeaderFont = null;
		try {
			tableHeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		;

		Font customFont = null;
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT,
					new File("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\PTSans-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font LabelFont2 = null;
		try {
			LabelFont2 = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(LabelFont2);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font RemiderFont = null;
		try {
			RemiderFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(RemiderFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font HeaderFont = null;
		try {
			HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(HeaderFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JPanel header = new JPanel();
		header.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(19, 0, 90)));
		header.setBackground(new Color(19, 0, 90));
		header.setBounds(0, 0, 1234, 116);
		getContentPane().add(header);
		header.setLayout(null);

		JLabel HomeLabel = new JLabel("Home");
		HomeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OwnerHomepage window = new OwnerHomepage();
				window.ownerhomepage.setVisible(true);
				dispose();
			}
		});
		HomeLabel.setForeground(new Color(255, 255, 255));
		HomeLabel.setBounds(217, 39, 118, 39);
		header.add(HomeLabel);
		HomeLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));

		JLabel AboutLabel = new JLabel("About");
		AboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs window = new AboutUs();
				AboutUs.main(null);
				dispose();
			}
		});
		AboutLabel.setForeground(new Color(255, 255, 255));
		AboutLabel.setBounds(354, 39, 118, 39);
		header.add(AboutLabel);
		AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));

		JLabel ContactUsLabel = new JLabel("Contact Us");
		ContactUsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUS window = new ContactUS();
				window.contactUs.setVisible(true);
				dispose();
			}
		});
		ContactUsLabel.setForeground(new Color(255, 255, 255));
		ContactUsLabel.setBounds(465, 39, 118, 39);
		header.add(ContactUsLabel);
		ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/SYSTEMLOGO 1.png")));
		Logo.setBounds(10, 26, 171, 79);
		header.add(Logo);

		JButton MenuButton = new JButton("");
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MenuPanel != null) {
					boolean isMenuPanelVisible = MenuPanel.isVisible();
					MenuPanel.setVisible(!isMenuPanelVisible);

				}
			}
		});
		MenuButton.setBorderPainted(false);
		MenuButton.setBackground(new Color(19, 0, 90));
		MenuButton.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/Signoutmyprofile.png")));
		MenuButton.setBounds(1089, 26, 135, 54);
		header.add(MenuButton);

		Font AgaintsLabelFont = null;
		try {
			AgaintsLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(AgaintsLabelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font LabelFont = null;
		try {
			LabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(LabelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font PickLabelFont = null;
		try {
			PickLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(PickLabelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JPanel RegImmunizationPanelPick = new JPanel();
		RegImmunizationPanelPick.setBackground(new Color(109, 169, 228));
		RegImmunizationPanelPick.setBounds(322, 132, 382, 55);
		getContentPane().add(RegImmunizationPanelPick);
		RegImmunizationPanelPick.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(23, 23, 23)));
		RegImmunizationPanelPick.setLayout(null);

		JLabel RegImmunizationLabel = new JLabel("");
		RegImmunizationLabel.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/regularimmunization.png")));
		RegImmunizationLabel.setBounds(10, 11, 387, 28);
		RegImmunizationPanelPick.add(RegImmunizationLabel);
		RegImmunizationLabel.setFont(PickLabelFont.deriveFont(Font.PLAIN, 18));

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(23, 23, 23)));
		mainPanel.setBounds(28, 185, 1178, 651);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);

		JButton clearDataButton = new JButton("");
		clearDataButton.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/Clearbutton.png")));
		clearDataButton.setBounds(753, 58, 42, 49);
		mainPanel.add(clearDataButton);
		clearDataButton.setBorder(null);
		clearDataButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		clearDataButton.setBackground(new Color(240, 240, 240));

		JButton addImmunizationButton = new JButton("");
		addImmunizationButton.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/Addbutton.png")));
		addImmunizationButton.setBounds(805, 58, 42, 49);
		mainPanel.add(addImmunizationButton);
		addImmunizationButton.setBorder(null);
		addImmunizationButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		addImmunizationButton.setBackground(new Color(240, 240, 240));
		addImmunizationButton.setForeground(new Color(255, 255, 255));

		JPanel panel = new JPanel();
		panel.setBounds(877, 65, 263, 367);
		mainPanel.add(panel);
		panel.setBackground(new Color(240, 240, 240));
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(23, 23, 23)));
		panel.setLayout(null);

		JLabel timeLabel = new JLabel("Time (HH:mm):");
		timeLabel.setFont((LabelFont2.deriveFont(Font.BOLD, 16)));
		timeLabel.setBounds(10, 197, 118, 21);
		panel.add(timeLabel);

		JLabel dateLabel = new JLabel("Date (yyyy-MM-dd):");
		dateLabel.setFont((LabelFont2.deriveFont(Font.BOLD, 16)));
		dateLabel.setBounds(10, 122, 146, 21);
		panel.add(dateLabel);

		JLabel ScheduleaReminderLabel = new JLabel("Schedule a ");
		ScheduleaReminderLabel.setBounds(46, 32, 170, 40);
		panel.add(ScheduleaReminderLabel);
		ScheduleaReminderLabel.setForeground(new Color(23, 23, 23));
		ScheduleaReminderLabel.setFont((RemiderFont.deriveFont(Font.PLAIN, 30)));

		JLabel ScheduleaReminder2Label = new JLabel("Reminder");
		ScheduleaReminder2Label.setForeground(new Color(23, 23, 23));
		ScheduleaReminder2Label.setFont((RemiderFont.deriveFont(Font.PLAIN, 28)));
		ScheduleaReminder2Label.setBounds(56, 67, 144, 31);
		panel.add(ScheduleaReminder2Label);

		timeField = new JTextField();
		timeField.setBounds(10, 229, 243, 40);
		panel.add(timeField);
		timeField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		timeField.setBackground(new Color(232, 237, 236));
		timeField.setColumns(10);

		dateField = new JTextField();
		dateField.setBounds(10, 154, 243, 40);
		panel.add(dateField);
		dateField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		dateField.setBackground(new Color(232, 237, 236));
		dateField.setColumns(10);

		JButton setButton = new JButton("Set the Date");
		setButton.setBounds(13, 278, 240, 40);
		panel.add(setButton);
		setButton.setBorder(null);
		setButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		setButton.setBackground(new Color(19, 0, 90));
		setButton.setForeground(new Color(255, 255, 255));

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(877, 444, 263, 181);
		mainPanel.add(panel_2);
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(23, 23, 23)));
		panel_2.setLayout(null);

		JLabel AgaintsLabel = new JLabel("Against");
		AgaintsLabel.setFont(AgaintsLabelFont.deriveFont(Font.PLAIN, 20));
		AgaintsLabel.setBounds(10, 11, 172, 22);
		panel_2.add(AgaintsLabel);

		JLabel CDLabel = new JLabel("D - Canine Distemper");
		CDLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 18));
		CDLabel.setBounds(20, 44, 228, 22);
		panel_2.add(CDLabel);

		JLabel HepaLabel = new JLabel("H - Hepatitist");
		HepaLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 18));
		HepaLabel.setBounds(20, 65, 228, 22);
		panel_2.add(HepaLabel);

		JLabel LeptoLabel = new JLabel("L- Leptospirosis\r\n");
		LeptoLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 18));
		LeptoLabel.setBounds(20, 88, 228, 22);
		panel_2.add(LeptoLabel);

		JLabel ParaLabel = new JLabel("Pi - ParaInfluenza");
		ParaLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 18));
		ParaLabel.setBounds(20, 109, 228, 22);
		panel_2.add(ParaLabel);

		JLabel CoronaLabel = new JLabel("C- Corona Virus");
		CoronaLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 18));
		CoronaLabel.setBounds(20, 131, 228, 22);
		panel_2.add(CoronaLabel);

		// Add the table to the frame
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 118, 821, 427);
		mainPanel.add(scrollPane);
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 20));

		// Create the JTable using the model
		table = new JTable(new DefaultTableModel(new Object[][] {

		}, new String[] { "Date", "Weight", "Against", "Manufacturer", "Lot Number", "Veterinarian" }));
		table.setBackground(new Color(255, 255, 255));
		table.setFont((tableCellFont.deriveFont(Font.BOLD, 14)));
		table.setBorder(null);
		table.setSelectionBackground(new Color(173, 228, 219));
		scrollPane.setViewportView(table);
		table.getTableHeader().setFont((tableHeaderFont.deriveFont(Font.BOLD, 16)));
		// table.setFont((tableCellFont.deriveFont(Font.BOLD, 14)));
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(188, 229, 223));
		table.getTableHeader().setForeground(new Color(23, 23, 23));
		table.setRowHeight(40);

		JLabel RegularImmunizationsandDewormingLabel = new JLabel("Regular Immunizations and Deworming");
		RegularImmunizationsandDewormingLabel.setBounds(28, 56, 688, 51);
		mainPanel.add(RegularImmunizationsandDewormingLabel);
		RegularImmunizationsandDewormingLabel.setForeground(new Color(23, 23, 23));

		RegularImmunizationsandDewormingLabel.setFont((customFont.deriveFont(Font.BOLD, 40)));

		JButton importButton = new JButton("Find your Data");
		importButton.setBounds(442, 576, 208, 49);
		mainPanel.add(importButton);
		importButton.setBorder(null);
		importButton.setForeground(new Color(25, 25, 25));
		importButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		importButton.setBackground(new Color(246, 186, 111));

		// Add buttons for export and import
		JButton exportButton = new JButton("Save your Data");
		exportButton.setBounds(664, 576, 203, 49);
		mainPanel.add(exportButton);
		exportButton.setBorder(null);
		exportButton.setFont((ButtonFont.deriveFont(Font.BOLD, 20)));
		exportButton.setBackground(new Color(19, 0, 90));
		exportButton.setForeground(new Color(255, 255, 255));

		JButton Mypetsbttn = new JButton("");
		Mypetsbttn.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/Profile.png")));
		Mypetsbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PetProfile window = new PetProfile();
				window.petProfileFrame.setVisible(true);
				dispose();
			}
		});
		Mypetsbttn.setBorder(null);
		Mypetsbttn.setBackground(new Color(240, 240, 240));
		Mypetsbttn.setBounds(131, 141, 169, 38);
		getContentPane().add(Mypetsbttn);

		JButton allergiesbttn = new JButton("");
		allergiesbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KnownConditionandAllergies window = new KnownConditionandAllergies();
				window.KnownAllergiesAndConditionframe.setVisible(true);
				dispose();
			}
		});
		allergiesbttn.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/project_images/knownallergies.png")));
		allergiesbttn.setBorder(null);
		allergiesbttn.setBackground(new Color(240, 240, 240));
		allergiesbttn.setBounds(754, 151, 317, 24);
		getContentPane().add(allergiesbttn);

		// Action listener for the export button
		exportButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exportTableData();

			}
		});

		// Action listener for the import button
		importButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				importTableData();
			}
		});

		setButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String dateText = dateField.getText();
				String timeText = timeField.getText();

				// Check if the date and time fields are empty
				if (dateText.isEmpty() || timeText.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter a valid date and time.");
					return;
				}

				try {
				    LocalDateTime notificationDateTime = LocalDateTime.parse(dateText + "T" + timeText);
				    LocalDateTime currentDateTime = LocalDateTime.now();

				    LocalDateTime alarmDateTime = notificationDateTime.minusDays(1);

				    long daysUntilNotification = currentDateTime.until(alarmDateTime, java.time.temporal.ChronoUnit.DAYS);

				    if (daysUntilNotification == 1) {
				        JOptionPane.showMessageDialog(null, "Notification: Date approaching in 1 day!");
				    } else {
				        JOptionPane.showMessageDialog(null, "Notification: Date is not within 1 day!");
				    }

				    // Schedule the alarm
				    scheduleAlarm(alarmDateTime.format(DateTimeFormatter.ofPattern("HH:mm")));
				} catch (Exception ex) {
				    JOptionPane.showMessageDialog(null, "Please enter a valid date and time in the format yyyy-MM-dd and HH:mm.");
				}

			}
		});

		// Add ActionListener to the "Add Immunization" button
		addImmunizationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of AddDataForm and pass the table model
				AddDataForm inputFrame = new AddDataForm((DefaultTableModel) table.getModel());
				inputFrame.setVisible(true);
			}
		});

		clearDataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the data?",
						"Confirmation", JOptionPane.YES_NO_OPTION);

				if (confirmation == JOptionPane.YES_OPTION) {
					// Clear the table data
					DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
					tableModel.setRowCount(0);

					// Clear the text fields
					dateField.setText("");
					timeField.setText("");
				}
			}
		});
	}

	private void exportTableData() {
		try {
			// Create a file chooser dialog
			JFileChooser fileChooser = new JFileChooser(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\PetsData\\RegularImmunizationDeworming");
			int choice = fileChooser.showSaveDialog(this);

			if (choice == JFileChooser.APPROVE_OPTION) {
				// Get the selected file
				File file = fileChooser.getSelectedFile();

				// Open a file writer
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));

				// Write the table data to the file
				for (int i = 0; i < table.getRowCount(); i++) {
					for (int j = 0; j < table.getColumnCount(); j++) {
						writer.write(table.getValueAt(i, j).toString());
						if (j < table.getColumnCount() - 1)
							writer.write(",");
					}
					writer.newLine();
				}

				// Close the writer
				writer.close();

				JOptionPane.showMessageDialog(this, "Table data Saved successfully.");
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(this, "Error exporting table data: " + ex.getMessage());
		}
	}

	private void importTableData() {
		try {
			// Create a file chooser dialog
			JFileChooser fileChooser = new JFileChooser(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\PetsData\\RegularImmunizationDeworming");
			int choice = fileChooser.showOpenDialog(this);

			if (choice == JFileChooser.APPROVE_OPTION) {
				// Get the selected file
				File file = fileChooser.getSelectedFile();

				// Open a file reader
				BufferedReader reader = new BufferedReader(new FileReader(file));

				// Read the file line by line
				String line;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0); // Clear existing table data

				while ((line = reader.readLine()) != null) {
					// Split the line by comma
					String[] rowData = line.split(",");

					// Add a new row to the table model
					model.addRow(rowData);
				}

				int dateColumnIndex = model.findColumn("Date");
				if (dateColumnIndex != -1 && model.getRowCount() > 0) {
					String dateValue = model.getValueAt(0, dateColumnIndex).toString();
					dateField.setText(dateValue);
				} else {
					dateField.setText("");
				}

				// Close the reader
				reader.close();

				JOptionPane.showMessageDialog(this, "Table data displayed successfully.");
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(this, "Error importing table data: " + ex.getMessage());
		}
	}

	private void scheduleAlarm(String timeText) {
		try {
			// Parse the input time
			int hours = Integer.parseInt(timeText.substring(0, 2));
			int minutes = Integer.parseInt(timeText.substring(3));

			// Get the current time
			LocalDateTime now = LocalDateTime.now();
			int currentHours = now.getHour();
			int currentMinutes = now.getMinute();

			// Calculate the delay in milliseconds until the alarm time
			long delay = ((hours - currentHours) * 60 + (minutes - currentMinutes)) * 60 * 1000;

			// Create a TimerTask to execute when the alarm triggers
			timerTask = new TimerTask() {
				@Override
				public void run() {
					// Perform the actions you want when the alarm triggers
					JOptionPane.showMessageDialog(null, "Schedule for your Cute Pet's Immunization and Deworming!!");

				}
			};

			// Schedule the TimerTask with the specified delay
			timer = new Timer();
			timer.schedule(timerTask, delay);
		} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Invalid time format. Please enter time in HH:mm format.");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ImmunizationsDeworming immunizationsdeworming = new ImmunizationsDeworming();
				immunizationsdeworming.setVisible(true);

			}
		});

	}
}
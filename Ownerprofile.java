package Main_Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ownerprofile extends JFrame {
	JFrame ownerframe;

	JLabel nameLabel, phoneLabel, adressLabel;
	JPanel MenuPanel;
	private ArrayList<String> data;
	private JLabel ProfilePicture;
	private JLabel Logo;
	private JLabel OwnersProfileLabel;
	private JLabel homeLabel;
	private JLabel AboutLabel;
	private JLabel ContactUsLabel;
	private JLabel Pawlogo;
	private JLabel Infodisplay;
	private JButton clearbutton;
	private JButton MenuButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ownerprofile window = new Ownerprofile();
					window.ownerframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ownerprofile() {

		initialize();
	}

	private void initialize() {
		data = new ArrayList<>();
		ownerframe = new JFrame();
		ownerframe.getContentPane().setBackground(new Color(240, 240, 240));
		ownerframe.setBounds(100, 100, 1250, 870);
		ownerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerframe.getContentPane().setLayout(null);

		Font EditbuttonFont = null;
		try {
			EditbuttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(EditbuttonFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		JButton SelectProfilePictureButton = new JButton("Edit Picture");
		SelectProfilePictureButton.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
		SelectProfilePictureButton.setBackground(new Color(19, 0, 90));
		SelectProfilePictureButton.setForeground(new Color(255, 255, 255));
		SelectProfilePictureButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser fileChooser = new JFileChooser();
				int option = fileChooser.showOpenDialog(Ownerprofile.this);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					ImageIcon imageIcon = new ImageIcon(file.getPath());
					Image image = imageIcon.getImage().getScaledInstance(332, 335, Image.SCALE_SMOOTH);
					ProfilePicture.setIcon(new ImageIcon(image));

				}

			}

		});

		JButton AddOwnnersInformationButton = new JButton("Edit Profile");
		AddOwnnersInformationButton.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
		AddOwnnersInformationButton.setBackground(new Color(246, 186, 111));
		AddOwnnersInformationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Ownerinfo ownerinfo = new Ownerinfo();
				ownerinfo.ownerinfoframe.setVisible(true);
				ownerframe.dispose();

			}
		});
		AddOwnnersInformationButton.setBounds(93, 673, 332, 49);
		ownerframe.getContentPane().add(AddOwnnersInformationButton);
		SelectProfilePictureButton.setBounds(93, 615, 332, 49);
		ownerframe.getContentPane().add(SelectProfilePictureButton);

		Font inputFont = null;
		try {
			inputFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(inputFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font OwnersProfileLabelFont = null;
		try {
			OwnersProfileLabelFont = Font.createFont(Font.TRUETYPE_FONT,
					new File("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\PTSans-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(OwnersProfileLabelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		OwnersProfileLabel = new JLabel("Owner Profile");
		OwnersProfileLabel.setForeground(new Color(0, 0, 0));
		OwnersProfileLabel.setFont(new Font("PT Sans", Font.BOLD, 64));
		OwnersProfileLabel.setBounds(502, 252, 442, 64);
		ownerframe.getContentPane().add(OwnersProfileLabel);

		Font HeaderFont = null;
		try {
			HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(HeaderFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font labelFont = null;
		try {
			labelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(labelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font buttonFont = null;
		try {
			buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(buttonFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		JButton findDataButton = new JButton("Find your Data");
		findDataButton.setForeground(new Color(0, 0, 0));
		findDataButton.setFont(buttonFont.deriveFont(Font.BOLD, 14));
		findDataButton.setBackground(new Color(246, 186, 111));
		findDataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				importData();

			}
		});
		findDataButton.setBounds(791, 746, 192, 49);
		ownerframe.getContentPane().add(findDataButton);

		JButton saveDataButton = new JButton("Save your Data");
		saveDataButton.setForeground(new Color(255, 255, 255));
		saveDataButton.setFont(buttonFont.deriveFont(Font.BOLD, 14));
		saveDataButton.setBackground(new Color(19, 0, 90));
		saveDataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				exportData();
			}
		});
		saveDataButton.setBounds(993, 746, 192, 49);
		ownerframe.getContentPane().add(saveDataButton);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(19, 0, 90)));
		panel.setBackground(new Color(19, 0, 90));
		panel.setBounds(0, 0, 1234, 115);
		ownerframe.getContentPane().add(panel);
		panel.setLayout(null);

		Logo = new JLabel("");
		Logo.setBounds(10, 11, 167, 95);
		panel.add(Logo);
		Logo.setIcon(new ImageIcon(Ownerprofile.class.getResource("/project_images/SYSTEMLOGO 1.png")));

		homeLabel = new JLabel("Home");
		homeLabel.setForeground(new Color(255, 255, 255));
		homeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OwnerHomepage window = new OwnerHomepage();
				window.ownerhomepage.setVisible(true);
				ownerframe.dispose();
			}
		});
		homeLabel.setBounds(275, 40, 118, 40);
		panel.add(homeLabel);
		homeLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));

		AboutLabel = new JLabel("About");
		AboutLabel.setForeground(new Color(255, 255, 255));
		AboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs window = new AboutUs();
				AboutUs.main(null);
				ownerframe.dispose();
			}
		});
		AboutLabel.setBounds(403, 40, 118, 40);
		panel.add(AboutLabel);
		AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));

		ContactUsLabel = new JLabel("Contact Us");
		ContactUsLabel.setForeground(new Color(255, 255, 255));
		ContactUsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUS window = new ContactUS();
				window.contactUs.setVisible(true);
				ownerframe.dispose();
			}
		});
		ContactUsLabel.setBounds(516, 40, 118, 40);
		panel.add(ContactUsLabel);
		ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));

		JLabel ownnerframe = new JLabel("");
		ownnerframe.setBounds(0, 0, 1250, 870);
		panel.add(ownnerframe);
		
		MenuButton = new JButton("");
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean isMenuPanelVisible = MenuPanel.isVisible();
                MenuPanel.setVisible(!isMenuPanelVisible);
			}
		});
		MenuButton.setIcon(new ImageIcon(Ownerprofile.class.getResource("/project_images/Signoutmyprofile.png")));
		MenuButton.setBorderPainted(false);
		MenuButton.setBorder(null);
		MenuButton.setBackground(new Color(19, 0, 90));
		MenuButton.setBounds(1057, 26, 135, 54);
		panel.add(MenuButton);


		adressLabel = new JLabel("");
		adressLabel.setBounds(502, 535, 652, 36);
		ownerframe.getContentPane().add(adressLabel);
		adressLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
		nameLabel = new JLabel("");
		nameLabel.setBounds(502, 350, 646, 36);
		ownerframe.getContentPane().add(nameLabel);
		nameLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));

		phoneLabel = new JLabel("");
		phoneLabel.setBounds(502, 441, 652, 36);
		ownerframe.getContentPane().add(phoneLabel);
		phoneLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));

		Pawlogo = new JLabel("");
		Pawlogo.setIcon(new ImageIcon(Ownerprofile.class.getResource("/project_images/LOGOPAW.png")));
		Pawlogo.setBounds(694, 338, 449, 439);
		ownerframe.getContentPane().add(Pawlogo);

		Infodisplay = new JLabel("");
		Infodisplay.setIcon(new ImageIcon(Ownerprofile.class.getResource("/project_images/ownerdisplay.png")));
		Infodisplay.setBounds(474, 325, 711, 254);
		ownerframe.getContentPane().add(Infodisplay);

		ProfilePicture = new JLabel("");
		ProfilePicture.setBounds(93, 241, 332, 355);
		ownerframe.getContentPane().add(ProfilePicture);
		ProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePicture.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(109, 169, 255)));

		clearbutton = new JButton("Clear Data");
		clearbutton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		clearbutton.setBackground(new Color(240, 240, 240));
		clearbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearData();		
				}
		});
		clearbutton.setBounds(631, 746, 150, 49);
		clearbutton.setFont(buttonFont.deriveFont(Font.BOLD, 14));
		ownerframe.getContentPane().add(clearbutton);
		MenuPanel = new JPanel();
		MenuPanel.setBounds(1027, 114, 197, 195);
		ownerframe.getContentPane().add(MenuPanel);
		MenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MenuPanel.setBackground(new Color(255, 255, 255));
		MenuPanel.setVisible(false);
		MenuPanel.setLayout(null);
		
		JButton MyProfileButton = new JButton("My Profile");
		MyProfileButton.setBackground(new Color(255, 255, 255));
		MyProfileButton.setHorizontalAlignment(JButton.LEFT);
		MyProfileButton.setIcon(new ImageIcon(AboutUs.class.getResource("/project_images/OwnersProfileSign.png")));
		MyProfileButton.setBounds(10, 32, 177, 38);
		MenuPanel.add(MyProfileButton);
		
		JButton UserSManualButton = new JButton("User's Manual");
		UserSManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserManual usermanual = new UserManual();
				UserManual.main(null);
				ownerframe.dispose();
			}
		});
		UserSManualButton.setBackground(new Color(255, 255, 255));
		UserSManualButton.setHorizontalAlignment(JButton.LEFT);
		UserSManualButton.setIcon(new ImageIcon(AboutUs.class.getResource("/project_images/UserManualSign.png")));
		UserSManualButton.setBounds(10, 81, 177, 38);
		MenuPanel.add(UserSManualButton);
		
		JButton SignOutButton = new JButton("Sign Out");
		SignOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", 
			    		"Confirmation", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
 
		        
		        	ownerframe.dispose();
		            
		        }	
				
			}
		});
		SignOutButton.setBackground(new Color(255, 255, 255));
		SignOutButton.setHorizontalAlignment(JButton.LEFT);
		SignOutButton.setIcon(new ImageIcon(AboutUs.class.getResource("/project_images/SigoutSign.png")));
		SignOutButton.setBounds(10, 130, 177, 38);
		MenuPanel.add(SignOutButton);
	}

	private void displayData() {
		StringBuilder sb = new StringBuilder();
		for (String item : data) {
			sb.append(item);
			sb.append("\n");
		}
	}

	private void exportData() {

		String filePath = "C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\OwnersData";
		String fileName = JOptionPane.showInputDialog(ownerframe, "Enter file name:");
		if (fileName == null || fileName.trim().isEmpty()) {
			JOptionPane.showMessageDialog(ownerframe, "File name is empty or canceled.");
			return;
		}

		File file = new File(filePath, fileName + ".txt");

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("Name:");
			writer.write(nameLabel.getText());
			writer.newLine();
			writer.write("Phone Number: ");
			writer.write(phoneLabel.getText());
			writer.newLine();
			writer.write("Address: " + adressLabel.getText());
			writer.write(adressLabel.getText());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void importData() {

		// Prompt the user to enter a file name
		String fileName = JOptionPane.showInputDialog(ownerframe, "Enter file name:");

		// Check if the file name is empty or canceled
		if (fileName == null || fileName.trim().isEmpty()) {
			JOptionPane.showMessageDialog(ownerframe, "File name is empty or canceled.");
			return;
		}

		// Specify the folder path where the data files are stored
		String folderPath = "C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\OwnersData";

		// Create the file path by combining the folder path, file name, and extension
		String filePath = folderPath + "\\" + fileName + ".txt";
		File file = new File(filePath);

		// Check if the file exists
		if (!file.exists()) {
			JOptionPane.showMessageDialog(ownerframe, "File does not exist.");
			return;
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// Read the data from the file
			String name = reader.readLine();
			String phone = reader.readLine();
			String address = reader.readLine();

			// Set the imported data to the corresponding components
			nameLabel.setText(name);
			phoneLabel.setText(phone);
			adressLabel.setText(address);

			JOptionPane.showMessageDialog(ownerframe, "Data imported successfully.");
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(ownerframe, "Error occurred while importing data.");
		}

	}
	private void clearData() {
		nameLabel.setText("");
		adressLabel.setText("");
		phoneLabel.setText("");
		
	}
}
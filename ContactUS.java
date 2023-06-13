package Main_Project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class ContactUS extends JFrame {

	JFrame contactUs;
	private JTextField firstNameField;
	private JTextField LastNameField;
	private JTextField EmailField;
	private JTextArea textArea;
	private JPanel MenuPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUS window = new ContactUS();
					window.contactUs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContactUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		contactUs = new JFrame();
		contactUs.setBounds(100, 100, 1250, 870);
		contactUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font HeaderLabelFont = null;
		try {
			HeaderLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		contactUs.getContentPane().setLayout(null);

		JLabel CotactUsLabel = new JLabel("Contact Us");
		CotactUsLabel.setBounds(514, 43, 118, 27);
		CotactUsLabel.setForeground(new Color(255, 255, 255));
		CotactUsLabel.setFont(HeaderLabelFont.deriveFont(Font.BOLD, 18));
		contactUs.getContentPane().add(CotactUsLabel);

		JLabel Logo = new JLabel("");
		Logo.setBounds(43, 22, 169, 71);
		Logo.setIcon(new ImageIcon(ContactUS.class.getResource("/project_images/SYSTEMLOGO 1.png")));
		contactUs.getContentPane().add(Logo);

		Font ContactUSBigLabelFont = null;
		try {
			ContactUSBigLabelFont = Font.createFont(Font.TRUETYPE_FONT,
					new File("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\PTSans-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JLabel ContactUSBigLabel = new JLabel("Contact Us");
		ContactUSBigLabel.setBounds(54, 175, 311, 55);
		ContactUSBigLabel.setForeground(new Color(0, 0, 0));
		ContactUSBigLabel.setFont((ContactUSBigLabelFont.deriveFont(Font.BOLD, 60)));
		contactUs.getContentPane().add(ContactUSBigLabel);

		Font ExperienceFont = null;
		try {
			ExperienceFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JLabel ExperienceLabel = new JLabel("Experiencing a problem? Want to share your experience as a user of");
		ExperienceLabel.setBounds(54, 241, 609, 23);
		ExperienceLabel.setForeground(new Color(0, 0, 0));
		ExperienceLabel.setFont((ExperienceFont.deriveFont(Font.BOLD, 18)));
		contactUs.getContentPane().add(ExperienceLabel);

		JLabel lblOurSystemReach = new JLabel(" our system? Reach out to us by filling out the form.");
		lblOurSystemReach.setBounds(54, 268, 609, 23);
		lblOurSystemReach.setForeground(new Color(0, 0, 0));
		lblOurSystemReach.setFont((ExperienceFont.deriveFont(Font.BOLD, 18)));
		contactUs.getContentPane().add(lblOurSystemReach);

		Font dataFieldFont = null;
		try {
			dataFieldFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		firstNameField = new JTextField();
		firstNameField.setBounds(54, 359, 279, 40);
		firstNameField.setFont((dataFieldFont.deriveFont(Font.BOLD, 15)));
		firstNameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		firstNameField.setBackground(new Color(232, 237, 236));
		contactUs.getContentPane().add(firstNameField);
		firstNameField.setColumns(10);

		LastNameField = new JTextField();
		LastNameField.setBounds(440, 359, 279, 40);
		LastNameField.setFont((dataFieldFont.deriveFont(Font.BOLD, 15)));
		LastNameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		LastNameField.setBackground(new Color(232, 237, 236));
		contactUs.getContentPane().add(LastNameField);
		LastNameField.setColumns(10);

		EmailField = new JTextField();
		EmailField.setBounds(895, 361, 279, 40);
		EmailField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		EmailField.setBackground(new Color(232, 237, 236));
		contactUs.getContentPane().add(EmailField);
		EmailField.setColumns(10);

		Font FieldLabelFont = null;
		try {
			FieldLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		// Label for first name.
		JLabel FirstNameLabel = new JLabel("First Name");
		FirstNameLabel.setBounds(54, 325, 279, 23);
		FirstNameLabel.setForeground(new Color(0, 0, 0));
		FirstNameLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		contactUs.getContentPane().add(FirstNameLabel);

		//Label for Last Name.
		JLabel LastNameLabel = new JLabel("Last Name");
		LastNameLabel.setBounds(440, 325, 279, 23);
		LastNameLabel.setForeground(new Color(0, 0, 0));
		LastNameLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		contactUs.getContentPane().add(LastNameLabel);
		
		//Label for email.
		JLabel EmailLabel = new JLabel("Email");
		EmailLabel.setBounds(895, 327, 279, 23);
		EmailLabel.setForeground(new Color(0, 0, 0));
		EmailLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		contactUs.getContentPane().add(EmailLabel);

		//Label for the instruction for the user.
		JLabel TellUsLabel = new JLabel("Tell us more about your experience.");
		TellUsLabel.setBounds(54, 410, 370, 23);
		TellUsLabel.setForeground(new Color(19, 0, 90));
		TellUsLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		contactUs.getContentPane().add(TellUsLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 444, 1120, 185);
		contactUs.getContentPane().add(scrollPane);

		Font buttonFont = null;
		try {
			buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		// Submit button then display message.
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(999, 690, 175, 40);
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				saveData();
				clearFields();
				JOptionPane.showMessageDialog(null, "Thank you for reaching out, we will get back to you soon.","Thank you.",
		                JOptionPane.INFORMATION_MESSAGE);

			}
		});
		submitButton.setFont(new Font("Nunito Sans 7pt Condensed", Font.BOLD, 20));
		submitButton.setBackground(new Color(19, 0, 90));
		submitButton.setForeground(new Color(255, 255, 255));
		contactUs.getContentPane().add(submitButton);

		JLabel MypetLabel = new JLabel("Home");
		MypetLabel.setBounds(294, 43, 89, 27);
		MypetLabel.setForeground(new Color(255, 255, 255));
		MypetLabel.setBackground(new Color(255, 255, 255));
		MypetLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OwnerHomepage window = new OwnerHomepage();
				window.ownerhomepage.setVisible(true);
				contactUs.dispose();
			}
		});
		MypetLabel.setFont(HeaderLabelFont.deriveFont(Font.BOLD, 18));
		contactUs.getContentPane().add(MypetLabel);
		
		//About label
		JLabel AboutLabel = new JLabel("About");
		AboutLabel.setBounds(409, 43, 118, 27);
		AboutLabel.setForeground(new Color(255, 255, 255));
		AboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs window = new AboutUs();
				AboutUs.main(null);
				contactUs.dispose();
			}
		});
		AboutLabel.setFont(HeaderLabelFont.deriveFont(Font.BOLD, 18));
		contactUs.getContentPane().add(AboutLabel);

		JPanel panel = new JPanel();
		panel.setBounds(0, 1, 1234, 115);
		panel.setBackground(new Color(19, 0, 90));
		contactUs.getContentPane().add(panel);
		panel.setLayout(null);

		JButton MenuButton = new JButton("");
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		boolean isMenuPanelVisible = MenuPanel.isVisible();
                MenuPanel.setVisible(!isMenuPanelVisible);
			}
		});
		MenuButton.setBounds(1031, 26, 135, 54);
		panel.add(MenuButton);
		MenuButton.setIcon(new ImageIcon(ContactUS.class.getResource("/project_images/Signoutmyprofile.png")));
		MenuButton.setBorderPainted(false);
		MenuButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		MenuButton.setBackground(new Color(19, 0, 90));
        
        JPanel UserManualPanel = new JPanel();
        UserManualPanel.setBackground(new Color(255, 255, 255));
        UserManualPanel.setBounds(0, 120, 1236, 2859);
        panel.add(UserManualPanel);
        UserManualPanel.setLayout(null);
        
        JLabel LabelUsersManual = new JLabel("");
        LabelUsersManual.setIcon(new ImageIcon(UserManual.class.getResource("/project_images/UsersManualLabel.png")));
        LabelUsersManual.setBounds(36, -19, 1137, 2743);
        UserManualPanel.add(LabelUsersManual);
  

		textArea = new JTextArea();
		textArea.setBounds(54, 446, 1118, 142);
		contactUs.getContentPane().add(textArea);
		textArea.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		textArea.setBackground(new Color(232, 237, 236));

		JLabel catanddog = new JLabel("");
		catanddog.setBounds(0, 538, 516, 362);
		catanddog.setIcon(new ImageIcon(ContactUS.class.getResource("/project_images/doggandcat.png")));
		contactUs.getContentPane().add(catanddog);
		MenuPanel = new JPanel();
		MenuPanel.setBounds(989, 121, 197, 195);
		contactUs.getContentPane().add(MenuPanel);
		MenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MenuPanel.setBackground(new Color(255, 255, 255));
		MenuPanel.setVisible(false);
		MenuPanel.setLayout(null);
		
		JButton MyProfileButton = new JButton("My Profile");
		MyProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ownerprofile window = new Ownerprofile();
				window.ownerframe.setVisible(true);
				contactUs.dispose();
			}
		});
		MyProfileButton.setBackground(new Color(255, 255, 255));
		MyProfileButton.setHorizontalAlignment(JButton.LEFT);
		MyProfileButton.setIcon(new ImageIcon(UserManual.class.getResource("/project_images/OwnersProfileSign.png")));
		MyProfileButton.setBounds(10, 32, 177, 38);
		MenuPanel.add(MyProfileButton);
		
		JButton UserSManualButton = new JButton("User's Manual");
		UserSManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserManual usermanual = new UserManual();
				UserManual.main(null);
        		contactUs.dispose();
			}
		});
		UserSManualButton.setBackground(new Color(255, 255, 255));
		UserSManualButton.setHorizontalAlignment(JButton.LEFT);
		UserSManualButton.setIcon(new ImageIcon(UserManual.class.getResource("/project_images/UserManualSign.png")));
		UserSManualButton.setBounds(10, 81, 177, 38);
		MenuPanel.add(UserSManualButton);
		
		JButton SignOutButton = new JButton("Sign Out");
		SignOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", 
			    		"Confirmation", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
 
		        
		        	contactUs.dispose();
		            
		        }	
				
			}
		});
		SignOutButton.setBackground(new Color(255, 255, 255));
		SignOutButton.setHorizontalAlignment(JButton.LEFT);
		SignOutButton.setIcon(new ImageIcon(UserManual.class.getResource("/project_images/SigoutSign.png")));
		SignOutButton.setBounds(10, 130, 177, 38);
		MenuPanel.add(SignOutButton);

	}

	private void saveData() {
		String firstName = firstNameField.getText();
		String lastName = LastNameField.getText();
		String email = EmailField.getText();
		String experience = textArea.getText();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Concern.txt", true))) {
			writer.write("First Name: " + firstName);
			writer.newLine();
			writer.write("Last Name: " + lastName);
			writer.newLine();
			writer.write("Email: " + email);
			writer.newLine();
			writer.write("Experience: " + experience);
			writer.newLine();
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void clearFields() {
		firstNameField.setText("");
		LastNameField.setText("");
		EmailField.setText("");
		textArea.setText("");
	}
}
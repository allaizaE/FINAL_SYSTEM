package Main_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LandingHomePage {

	JFrame LandingHomePageframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingHomePage window = new LandingHomePage();
					window.LandingHomePageframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LandingHomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LandingHomePageframe = new JFrame();
		LandingHomePageframe.getContentPane().setBackground(new Color(255, 235, 235));
		LandingHomePageframe.setBackground(new Color(255, 235, 235));
		LandingHomePageframe.setBounds(100, 100, 1250, 870);
		LandingHomePageframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LandingHomePageframe.getContentPane().setLayout(null);
		
		// Create a JButton object for the sign-up  button
		JButton signUpbutton = new JButton("Sign Up");
		signUpbutton.setFont(new Font("Nunito Sans 7pt Condensed Medium", Font.BOLD, 18));
		signUpbutton.setBackground(new Color(246, 186, 111));
		signUpbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create a SignUp object and make the sign-up frame visible
				SignUpandSignIn window = new SignUpandSignIn();
				window.signupframe.setVisible(true);
				// Dispose the LandingHomePage frame
				LandingHomePageframe.dispose();
			}
		});
		
		JButton signInbutton = new JButton("Sign In");
		signInbutton.setFont(new Font("Nunito Sans 7pt Condensed", Font.BOLD, 22));
		signInbutton.setForeground(new Color(255, 255, 255));
		signInbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Create an instance of the SignUpandSignIn class
				SignUpandSignIn window = new SignUpandSignIn();
				window.signupframe.setVisible(true);
				  // Dispose of the landing home page frame
				LandingHomePageframe.dispose();
			}
		});
		
		JButton createaccountbutton = new JButton("Get Started");
		createaccountbutton.setBackground(new Color(246, 186, 111));
		createaccountbutton.setFont(new Font("Nunito Sans 7pt Condensed Medium", Font.BOLD, 22));
		createaccountbutton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Create an instance of the SignUpandSignIn class
		        SignUpandSignIn window = new SignUpandSignIn();
		        // Display the sign-up frame
		        window.signupframe.setVisible(true);	        
		        // Dispose of the landing home page frame
		        LandingHomePageframe.dispose();
		        
			}
		});
		createaccountbutton.setBounds(105, 497, 276, 60);
		LandingHomePageframe.getContentPane().add(createaccountbutton);
		
		JLabel GIFbg = new JLabel("");
		GIFbg.setIcon(new ImageIcon(LandingHomePage.class.getResource("/project_images/landingpage.gif")));
		GIFbg.setBounds(0, 118, 1234, 723);
		LandingHomePageframe.getContentPane().add(GIFbg);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(LandingHomePage.class.getResource("/project_images/SYSTEMLOGO 1.png")));
		Logo.setBounds(48, 11, 190, 96);
		LandingHomePageframe.getContentPane().add(Logo);
		
		signInbutton.setBorder(null);
		signInbutton.setBackground(new Color(19, 0, 90));
		signInbutton.setBounds(954, 35, 99, 23);
		LandingHomePageframe.getContentPane().add(signInbutton);
		
		signUpbutton.setIcon(null);
		signUpbutton.setBounds(1071, 25, 114, 39);
		LandingHomePageframe.getContentPane().add(signUpbutton);
		
		JLabel LandingHomePagebg = new JLabel("");
		LandingHomePagebg.setIcon(new ImageIcon(LandingHomePage.class.getResource("/project_images/LandingPage.png")));
		LandingHomePagebg.setBounds(0, 0, 1250, 870);
		LandingHomePageframe.getContentPane().add(LandingHomePagebg);
	}
}
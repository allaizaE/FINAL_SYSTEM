package Main_Project;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;

public class AddDataFormKnownCondition extends JFrame {
    JFrame AddDataformframe;
    private JTextField medicineField;
    private JTextField conditionField;
    private JTextField allergiesField;
    private KnownConditionandAllergies mainApp;
    private JLabel medicineLabel;
    private JLabel conditionLabel;
    private JLabel allergiesLabel;
    private JLabel logo;
    private JLabel inputNewDataLabel;
    private JPanel HEADERPANEL;
    private JLabel Petpics;
    private AddDataFormKnownCondition addDataForm;
    private JButton btnNewButton;

    /**
     * @wbp.parser.constructor
     */
    public AddDataFormKnownCondition(KnownConditionandAllergies app) {
        mainApp = app;
        initialize();
    }

    public AddDataFormKnownCondition(DefaultTableModel model) {
        // TODO Auto-generated constructor stub
    }

    private void initialize() {
        AddDataformframe = new JFrame();
        AddDataformframe.setBounds(100, 100, 1023, 776);
        AddDataformframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        AddDataformframe.getContentPane().setLayout(null);


        Font customFont = loadFont("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\NunitoSans_7pt_Condensed-Bold.ttf");
        Font labelFont = customFont.deriveFont(Font.PLAIN, 14); // Customize the font size and style as needed


       
        //This mmedicineField the user can input pet's medicine
        medicineField = new JTextField();
        medicineField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        medicineField.setBackground(new Color(232, 237, 236));
        medicineField.setBounds(486, 366, 489, 40);
        medicineField.setFont(labelFont);
        AddDataformframe.getContentPane().add(medicineField);
        medicineField.setColumns(10);
        //This conditionField the user can input pet's  condition
        conditionField = new JTextField();
        conditionField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        conditionField.setBackground(new Color(232, 237, 236));
        conditionField.setBounds(486, 461, 489, 40);
        conditionField.setFont(labelFont);
        AddDataformframe.getContentPane().add(conditionField);
        conditionField.setColumns(10);
      //This allergiesField the user can input pet's  allergies
        allergiesField = new JTextField();
        allergiesField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        allergiesField.setBackground(new Color(232, 237, 236));
        allergiesField.setBounds(486, 548, 489, 40);
        allergiesField.setFont(labelFont);
        AddDataformframe.getContentPane().add(allergiesField);
        allergiesField.setColumns(10);

        JButton addDataButton = new JButton("Enter all Data");
        addDataButton.setForeground(new Color(255, 255, 255));
        addDataButton.setBackground(new Color(19, 0, 90));
        addDataButton.setBounds(801, 647, 170, 40);
        addDataButton.setFont(labelFont);
        AddDataformframe.getContentPane().add(addDataButton);
        addDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	// Get the value from medicineField
                String Illnes = medicineField.getText();
                // Get the value from conditionField
                String Description = conditionField.getText();
                // Get the value from allergiesField
                String Drugstaken = allergiesField.getText();
                // Call the addInfoFromForm method in mainApp instance with the obtained values
                mainApp.addInfoFromForm( Illnes, Description, Drugstaken);
				

                AddDataformframe.dispose();
            }
        });

        JButton clearButton = new JButton("Clear Data");
        clearButton.setBackground(new Color(246, 186, 111));
        clearButton.setForeground(new Color(0, 0, 0));
        clearButton.setBounds(582, 647, 170, 40);
        clearButton.setFont(labelFont);
        AddDataformframe.getContentPane().add(clearButton);

        medicineLabel = new JLabel("Pet's Illness");
        medicineLabel.setBounds(486, 340, 106, 25);
        medicineLabel.setFont(new Font("Nunito Sans 7pt Condensed SemiBold", Font.BOLD, 18)); // Set the custom font
        AddDataformframe.getContentPane().add(medicineLabel);

        conditionLabel = new JLabel("Description ");
        conditionLabel.setBounds(486, 425, 230, 25);
        conditionLabel.setFont(new Font("Nunito Sans 7pt Condensed Medium", Font.BOLD, 18)); // Set the custom font
        AddDataformframe.getContentPane().add(conditionLabel);

        allergiesLabel = new JLabel("Drugs Taken");
        allergiesLabel.setBounds(486, 512, 127, 25);
        allergiesLabel.setFont(new Font("Nunito Sans 7pt Condensed Medium", Font.BOLD, 18)); // Set the custom font
        AddDataformframe.getContentPane().add(allergiesLabel);

        Font inputFont = loadFont("C:\\Users\\Allaiza\\eclipse-workspace\\PetRecordSystem\\src\\project_fonts\\PTSans-Bold.ttf");
        inputNewDataLabel = new JLabel("");
        inputNewDataLabel.setIcon(new ImageIcon(AddDataFormKnownCondition.class.getResource("/project_images/Group 114.png")));
        inputNewDataLabel.setForeground(new Color(19, 0, 90));
        inputNewDataLabel.setFont((inputFont.deriveFont(Font.BOLD, 36))); // Set the custom font
        inputNewDataLabel.setBounds(484, 196, 491, 117);
        AddDataformframe.getContentPane().add(inputNewDataLabel);
        
        HEADERPANEL = new JPanel();
        HEADERPANEL.setBorder(null);
        HEADERPANEL.setBackground(new Color(19, 0, 90));
        HEADERPANEL.setBounds(0, 0, 1007, 116);
        AddDataformframe.getContentPane().add(HEADERPANEL);
                HEADERPANEL.setLayout(null);
        
                logo = new JLabel("");
                logo.setBounds(410, 11, 190, 96);
                HEADERPANEL.add(logo);
                logo.setIcon(new ImageIcon(AddDataFormKnownCondition.class.getResource("/project_images/SYSTEMLOGO 1.png")));
                
                btnNewButton = new JButton("");
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		KnownConditionandAllergies window = new KnownConditionandAllergies();
    					window.KnownAllergiesAndConditionframe.setVisible(true);
                		AddDataformframe.dispose();
                	}
                });
                btnNewButton.setBackground(new Color(19, 0, 90));
                btnNewButton.setIcon(new ImageIcon(AddDataFormKnownCondition.class.getResource("/project_images/returnbutton.png")));
                btnNewButton.setBorder(null);
                btnNewButton.setForeground(new Color(19, 0, 90));
                btnNewButton.setBounds(46, 32, 52, 52);
                HEADERPANEL.add(btnNewButton);
                
                Petpics = new JLabel("");
                Petpics.setIcon(new ImageIcon(AddDataFormKnownCondition.class.getResource("/project_images/Group 115.png")));
                Petpics.setBounds(0, 82, 496, 655);
                AddDataformframe.getContentPane().add(Petpics);

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private Font loadFont(String fontPath) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void clearFields() {
     
        medicineField.setText("");
        conditionField.setText("");
        allergiesField.setText("");
    }

    public void show() {
    	AddDataformframe.setVisible(true);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
    

}
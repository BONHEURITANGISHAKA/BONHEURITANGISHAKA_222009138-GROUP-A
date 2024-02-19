package Forms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Touristregistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Connection con;
	PreparedStatement pet;
    ResultSet res;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Touristregistration frame = new Touristregistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Touristregistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tourist Registration");
		lblNewLabel.setBounds(155, 27, 125, 12);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(203, 61, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 98, 152, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 134, 152, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(94, 65, 49, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setBounds(94, 101, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(94, 137, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(94, 175, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //Creating Connection Object
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/touristconnect","root","");
	                //Prepared Statement
	                PreparedStatement pet=con.prepareStatement("insert into tourist(Name,Phone,Email,Password,ConfirmPassword) values(?,?,?,?,?)");
	                //Specifying the values of it's parameter
	                pet.setString(1,textField.getText());
	                pet.setString(2,textField_1.getText());
	                pet.setString(3,textField_2.getText());
	                pet.setString(4,passwordField.getText());
	                pet.setString(5,passwordField_1.getText());
	                
	                //Checking for the Password match
	            
	                {
	                    //Executing query
	                    pet.executeUpdate();
	                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
	                }
	             
	 
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
			}
		});
		btnNewButton.setBounds(56, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 172, 152, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm_Password");
		lblNewLabel_5.setBounds(94, 213, 89, 14);
		contentPane.add(lblNewLabel_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(203, 210, 152, 20);
		contentPane.add(passwordField_1);
	}
}

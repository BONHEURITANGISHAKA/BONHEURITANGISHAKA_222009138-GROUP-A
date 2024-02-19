package Forms;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PLACE extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	Connection con;
	PreparedStatement pet;
    ResultSet res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLACE frame = new PLACE();
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
	public PLACE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLACE");
		lblNewLabel.setBounds(185, 11, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(38, 52, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Description");
		lblNewLabel_2.setBounds(38, 77, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Location");
		lblNewLabel_3.setBounds(38, 115, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Price");
		lblNewLabel_4.setBounds(38, 149, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setBounds(38, 174, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(115, 43, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 74, 181, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 112, 181, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 143, 181, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(115, 171, 181, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //Creating Connection Object
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/touristconnect","root","");
	                //Prepared Statement
	                PreparedStatement pet=con.prepareStatement("insert into Place(Name,Description,Location,Price,Date) values(?,?,?,?,?)");
	                //Specifying the values of it's parameter
	                pet.setString(1,textField.getText());
	                pet.setString(2,textField_1.getText());
	                pet.setString(3,textField_2.getText());
	                pet.setString(4,textField_3.getText());
	                pet.setString(5,textField_4.getText());
	                
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
		btnNewButton.setBounds(10, 213, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //Creating Connection Object
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/touristconnect","root","");
	                String sql="DELETE FROM Application WHERE ID=5";
	                //Prepared Statement
	                PreparedStatement pet=con.prepareStatement(sql);
	                {
	                    //Executing query
	                    pet.executeUpdate();
	                    JOptionPane.showMessageDialog(null,"Data Removed Successfully");
	                }
	             
	 
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
			}
		});
		btnNewButton_1.setBounds(115, 213, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

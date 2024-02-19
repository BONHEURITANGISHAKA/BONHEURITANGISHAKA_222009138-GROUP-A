package Forms;
import java.sql.Connection;
import java.sql.DriverManager;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Application extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
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
					Application frame = new Application();
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
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application");
		lblNewLabel.setBounds(177, 61, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("TouristID");
		lblNewLabel_3.setBounds(53, 102, 70, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PlaceID");
		lblNewLabel_4.setBounds(53, 140, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 99, 222, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 137, 222, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                //Creating Connection Object
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/touristconnect","root","");
	                //Prepared Statement
	                PreparedStatement pet=con.prepareStatement("insert into Application(TouristID,PlaceID) values(?,?)");
	                //Specifying the values of it's parameter
	                pet.setString(1,textField_1.getText());
	                pet.setString(2,textField_2.getText());
	                
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
		btnNewButton.setBounds(10, 193, 89, 23);
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
	                    JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
	                }
	             
	 
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
			}	
		});
		btnNewButton_1.setBounds(99, 193, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

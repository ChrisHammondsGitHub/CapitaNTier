package com.novus.data.presentationlayer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.novus.dater.businesslayer.CreateArrayRecords;
import com.novus.dater.businesslayer.FileLocation;
import com.novus.dater.datalayer.ReturnMatchData;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplayRowNumber extends JFrame implements FileLocation {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtGender;
	private JTextField txtAge;
	private JTextField txtCompany;
	private JTextField txtCity;
	private JTextField txtEmail;
	private JTextField txtFavouriteColour;
	private JTextField txtSurname;
	private JTextField txtRace;
	private JTextField txtJobTitle;
	private JTextField txtSmokes;
	private JTextField txtPets;
	private JTextField txtWantsKids;
	private JTextField txtHasKids;
	public static int recordNum = 0;

	// Launch application
	public static void main(String[] args) {
		
		// Load frame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayRowNumber frame = new DisplayRowNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create frame
	public DisplayRowNumber() {
		
		// Load Database CSV
		CreateArrayRecords createArrayRecords = new CreateArrayRecords();
		createArrayRecords.loadDataFromFile(fileLocation);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(6, 6, 88, 25);
		contentPane.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(370, 10, 77, 16);
		contentPane.add(lblSurname);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(6, 60, 61, 16);
		contentPane.add(lblGender);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(370, 101, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblRace = new JLabel("Race:");
		lblRace.setBounds(370, 60, 61, 16);
		contentPane.add(lblRace);
		
		JLabel lblCompany = new JLabel("Company:");
		lblCompany.setBounds(6, 210, 77, 16);
		contentPane.add(lblCompany);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(6, 306, 61, 16);
		contentPane.add(lblCity);
		
		JLabel lblSmokes = new JLabel("Smokes?");
		lblSmokes.setBounds(370, 370, 61, 16);
		contentPane.add(lblSmokes);
		
		JLabel lblPets = new JLabel("Pets?");
		lblPets.setBounds(370, 258, 61, 16);
		contentPane.add(lblPets);
		
		JLabel lblWantsKids = new JLabel("Wants Kids?");
		lblWantsKids.setBounds(370, 289, 88, 16);
		contentPane.add(lblWantsKids);
		
		JLabel lblHasKids = new JLabel("Has Kids?");
		lblHasKids.setBounds(370, 329, 61, 16);
		contentPane.add(lblHasKids);
		
		JLabel lblJobTitle = new JLabel("Job Title:");
		lblJobTitle.setBounds(6, 160, 61, 16);
		contentPane.add(lblJobTitle);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(6, 101, 61, 16);
		contentPane.add(lblAge);
		
		JLabel lblFavouriteColour = new JLabel("Favourite Colour:");
		lblFavouriteColour.setBounds(6, 258, 112, 16);
		contentPane.add(lblFavouriteColour);
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(41, 393, 117, 29);
		contentPane.add(btnPrevious);
				
        ActionListener actLisPreBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	ShowRowSearch.main(null);
            }
        };
        
        btnPrevious.addActionListener(actLisPreBtn);
		
		// Handle database load exception
		try{
			txtFirstName = new JTextField();
			txtFirstName.setEditable(false);
			txtFirstName.setText(createArrayRecords.getRecordNumber(recordNum).getFirstName());
			txtFirstName.setBounds(142, 5, 194, 26);
			contentPane.add(txtFirstName);
			txtFirstName.setColumns(10);
			
			txtGender = new JTextField();
			txtGender.setText(createArrayRecords.getRecordNumber(recordNum).getGender());
			txtGender.setEditable(false);
			txtGender.setColumns(10);
			txtGender.setBounds(142, 55, 88, 26);
			contentPane.add(txtGender);
			
			txtAge = new JTextField();
			txtAge.setText(createArrayRecords.getRecordNumber(recordNum).getAge());
			txtAge.setEditable(false);
			txtAge.setColumns(10);
			txtAge.setBounds(142, 96, 67, 26);
			contentPane.add(txtAge);
			
			txtCompany = new JTextField();
			txtCompany.setText(createArrayRecords.getRecordNumber(recordNum).getCompany());
			txtCompany.setEditable(false);
			txtCompany.setColumns(10);
			txtCompany.setBounds(142, 205, 289, 26);
			contentPane.add(txtCompany);
			
			txtCity = new JTextField();
			txtCity.setText(createArrayRecords.getRecordNumber(recordNum).getCity());
			txtCity.setEditable(false);
			txtCity.setColumns(10);
			txtCity.setBounds(142, 301, 183, 26);
			contentPane.add(txtCity);
			
			txtEmail = new JTextField();
			txtEmail.setText(createArrayRecords.getRecordNumber(recordNum).geteMail());
			txtEmail.setEditable(false);
			txtEmail.setColumns(10);
			txtEmail.setBounds(443, 96, 224, 26);
			contentPane.add(txtEmail);
			
			txtFavouriteColour = new JTextField();
			txtFavouriteColour.setText(createArrayRecords.getRecordNumber(recordNum).getFavColour());
			txtFavouriteColour.setEditable(false);
			txtFavouriteColour.setColumns(10);
			txtFavouriteColour.setBounds(142, 253, 130, 26);
			contentPane.add(txtFavouriteColour);
			
			txtSurname = new JTextField();
			txtSurname.setText(createArrayRecords.getRecordNumber(recordNum).getFamilyName());
			txtSurname.setEditable(false);
			txtSurname.setColumns(10);
			txtSurname.setBounds(443, 5, 202, 26);
			contentPane.add(txtSurname);
			
			txtRace = new JTextField();
			txtRace.setText(createArrayRecords.getRecordNumber(recordNum).getRace());
			txtRace.setEditable(false);
			txtRace.setColumns(10);
			txtRace.setBounds(443, 55, 136, 26);
			contentPane.add(txtRace);
			
			txtJobTitle = new JTextField();
			txtJobTitle.setText(createArrayRecords.getRecordNumber(recordNum).getJobTitle());
			txtJobTitle.setEditable(false);
			txtJobTitle.setColumns(10);
			txtJobTitle.setBounds(142, 155, 289, 26);
			contentPane.add(txtJobTitle);
			
			txtSmokes = new JTextField();
			txtSmokes.setText(createArrayRecords.getRecordNumber(recordNum).getSmokes());
			txtSmokes.setEditable(false);
			txtSmokes.setBounds(459, 365, 77, 26);
			contentPane.add(txtSmokes);
			txtSmokes.setColumns(10);
			
			txtPets = new JTextField();
			txtPets.setText(createArrayRecords.getRecordNumber(recordNum).getHasPets());
			txtPets.setEditable(false);
			txtPets.setColumns(10);
			txtPets.setBounds(459, 253, 77, 26);
			contentPane.add(txtPets);
			
			txtWantsKids = new JTextField();
			txtWantsKids.setText(createArrayRecords.getRecordNumber(recordNum).getWantsKids());
			txtWantsKids.setEditable(false);
			txtWantsKids.setColumns(10);
			txtWantsKids.setBounds(459, 284, 77, 26);
			contentPane.add(txtWantsKids);
			
			txtHasKids = new JTextField();
			txtHasKids.setText(createArrayRecords.getRecordNumber(recordNum).getHasKids());
			txtHasKids.setEditable(false);
			txtHasKids.setColumns(10);
			txtHasKids.setBounds(459, 324, 77, 26);
			contentPane.add(txtHasKids);
		}
		catch(Exception e){
			System.out.println("Something went wrong... " + e);
			
			if ((createArrayRecords.getNumberOfRecords()) == 0){
				System.out.println("DB empty or not found");
			}
		}
	}
}

package com.novus.data.presentationlayer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class ShowRowSearch extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;


	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowRowSearch frame = new ShowRowSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	// Create the frame.
	public ShowRowSearch() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblRecordNumber = new JLabel("Search Records");
		lblRecordNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblRecordNumber.setBounds(215, 6, 261, 34);
		contentPane.add(lblRecordNumber);
		
		JLabel lblSearch = new JLabel("Enter Record Number:");
		lblSearch.setBounds(131, 146, 145, 16);
		contentPane.add(lblSearch);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(537, 393, 117, 29);
		contentPane.add(btnNext);
		
        ActionListener actLisNxtBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	DisplayRowNumber.main(null);
            	
            	System.out.println(txtSearch.getText());
            	try {
            		DisplayRowNumber.recordNum = Integer.parseInt(txtSearch.getText());
            	}
            	catch (NumberFormatException ex)
            	{
            		System.out.println("Not a valid number, " + ex + " exception");
            	}
            }
        };
        
        btnNext.addActionListener(actLisNxtBtn);
        
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(41, 393, 117, 29);
		contentPane.add(btnPrevious);
				
        ActionListener actLisPreBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	WelcomePage.main(null);
            }
        };
        
        btnPrevious.addActionListener(actLisPreBtn);
        
		txtSearch = new JTextField();
		txtSearch.setText("0");
		txtSearch.setBounds(352, 141, 130, 26);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
	}
}

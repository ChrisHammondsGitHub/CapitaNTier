package com.novus.data.presentationlayer;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.novus.dater.businesslayer.*;




import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class ShowPerfectMatches extends JFrame implements FileLocation {

	private JPanel contentPane;


	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowPerfectMatches frame = new ShowPerfectMatches();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public ShowPerfectMatches() {
		
		// Load CSV file
		CreateArrayRecords createArrayRecords = new CreateArrayRecords();
		createArrayRecords.loadDataFromFile(fileLocation);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourPerfectMatch = new JLabel("Your Perfect Match!");
		lblYourPerfectMatch.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblYourPerfectMatch.setBounds(240, 24, 235, 59);
		contentPane.add(lblYourPerfectMatch);
		
		JTextArea textAreaMatch = new JTextArea(10, 20);
		JScrollPane scroll = new JScrollPane (textAreaMatch, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		textAreaMatch.setEditable(false);
		textAreaMatch.setLineWrap(true);
		scroll.setBounds(31, 102, 641, 278);
	    contentPane.add(scroll);
			
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(41, 393, 117, 29);
		contentPane.add(btnPrevious);
				
        ActionListener actLisPreBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	DisplayMatchCriteria.main(null);
            }
        };
        
        btnPrevious.addActionListener(actLisPreBtn);
    
        
		
		String[] matchIDs = ReturnMatchIDs.returnMatchIDs(createArrayRecords.getRecords()); 
		
		String result = "";
		int i = 1;
		for(String s : matchIDs){
          
			System.out.println(" ------------------ Match number " + i +" ----------------\n");
			result += " ------------------ Match number " + i +" ----------------\n";
			int idAsInt = Integer.parseInt(s) -1;
        	System.out.println(createArrayRecords.getRecordNumber(idAsInt));
        	result += createArrayRecords.getRecordNumber(idAsInt);
        	i++;
		}
		
		textAreaMatch.setText(result);
	}
}

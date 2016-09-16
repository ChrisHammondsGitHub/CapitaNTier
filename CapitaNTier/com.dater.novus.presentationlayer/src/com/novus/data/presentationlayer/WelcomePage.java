package com.novus.data.presentationlayer;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class WelcomePage extends JFrame {

	private JPanel contentPane;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToCapita = new JLabel("Welcome to Capita Dater");
		lblWelcomeToCapita.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		lblWelcomeToCapita.setBounds(182, 18, 359, 50);
		contentPane.add(lblWelcomeToCapita);
		
		JButton btnSearch = new JButton(">>");
		btnSearch.setBounds(387, 164, 114, 29);
		contentPane.add(btnSearch);
		
        ActionListener actLisSearchBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	ShowRowSearch.main(null);
            }
        };
        
        btnSearch.addActionListener(actLisSearchBtn);
		
		JLabel lblSearchRecords = new JLabel("Search Records:");
		lblSearchRecords.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSearchRecords.setBounds(182, 167, 114, 16);
		contentPane.add(lblSearchRecords);
		
		JLabel lblMatchMaker = new JLabel("Match Maker:");
		lblMatchMaker.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMatchMaker.setBounds(182, 266, 114, 16);
		contentPane.add(lblMatchMaker);
		
		JButton btnMaker = new JButton(">>");
		btnMaker.setBounds(387, 262, 114, 29);
		contentPane.add(btnMaker);
		
        ActionListener actLisMakerBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	DisplayMatchCriteria.main(null);
            	//contentPane
            }
        };
        
        btnMaker.addActionListener(actLisMakerBtn);     
	}
}

package com.novus.data.presentationlayer;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.novus.dater.businesslayer.ReturnMatchIDs;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DisplayMatchCriteria extends JFrame {

	public enum SwitchVars {
		YES, NO, MALE, FEMALE;
	}
	
	private JPanel contentPane;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayMatchCriteria frame = new DisplayMatchCriteria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public DisplayMatchCriteria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblWhatAreYou = new JLabel("What are you looking for?");
		lblWhatAreYou.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblWhatAreYou.setBounds(215, 6, 261, 34);
		contentPane.add(lblWhatAreYou);
		
		JLabel lblNoKids = new JLabel("No Kids?");
		lblNoKids.setBounds(215, 81, 61, 16);
		contentPane.add(lblNoKids);
		
		JLabel lblMoreKids = new JLabel("More Kids?");
		lblMoreKids.setBounds(215, 143, 81, 16);
		contentPane.add(lblMoreKids);
		
		JLabel lblSmoker = new JLabel("Smoker?");
		lblSmoker.setBounds(215, 207, 61, 16);
		contentPane.add(lblSmoker);
		
		JLabel lblPets = new JLabel("Wanted?");
		lblPets.setBounds(215, 271, 61, 16);
		contentPane.add(lblPets);
		
		JLabel lblGender = new JLabel("Gender?");
		lblGender.setBounds(215, 331, 61, 16);
		contentPane.add(lblGender);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(537, 393, 117, 29);
		contentPane.add(btnNext);
		
        ActionListener actLisNxtBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	ShowPerfectMatches.main(null);
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
		
		JComboBox cbxNoKids = new JComboBox();
		cbxNoKids.setMaximumRowCount(2);
		cbxNoKids.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		cbxNoKids.setBounds(350, 76, 126, 29);
		contentPane.add(cbxNoKids);
				
        ActionListener actLisNoKids = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) cbxNoKids.getSelectedItem();
                SwitchVars sv = null;
                sv = ((s == "Yes") ? sv.YES : sv.NO);

                switch (sv) {//check for a match
                	default:
                    case YES:
                        ReturnMatchIDs.wantedNoKids = "true";
                        System.out.println("No kids = true");
                        break;
                    case NO:
                        ReturnMatchIDs.wantedNoKids = "false";
                        System.out.println("No kids = false");
                        break;
                }
            }
        };
        
        cbxNoKids.addActionListener(actLisNoKids);
		
		JComboBox cbxMoreKids = new JComboBox();
		cbxMoreKids.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		cbxMoreKids.setMaximumRowCount(2);
		cbxMoreKids.setBounds(350, 139, 126, 29);
		contentPane.add(cbxMoreKids);
		
        ActionListener actLisMoreKids = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) cbxMoreKids.getSelectedItem();
                SwitchVars sv = null;
                sv = ((s == "Yes") ? sv.YES : sv.NO);

                switch (sv) {//check for a match
                	default:
                    case YES:
                        ReturnMatchIDs.wantedMoreKids = "true";
                        System.out.println("More kids = true");
                        break;
                    case NO:
                        ReturnMatchIDs.wantedMoreKids = "false";
                        System.out.println("More kids = false");
                        break;
                }
            }
        };
        
        cbxMoreKids.addActionListener(actLisMoreKids);
		
		JComboBox cbxSmoker = new JComboBox();
		cbxSmoker.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		cbxSmoker.setMaximumRowCount(2);
		cbxSmoker.setBounds(350, 203, 126, 29);
		contentPane.add(cbxSmoker);
		
        ActionListener actLisSmoker = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) cbxSmoker.getSelectedItem();
                SwitchVars sv = null;
                sv = ((s == "Yes") ? sv.YES : sv.NO);

                switch (sv) {//check for a match
                	default:
                    case YES:
                        ReturnMatchIDs.wantedSmoker = "true";
                        System.out.println("Wanted smoker = true");
                        break;
                    case NO:
                        ReturnMatchIDs.wantedSmoker = "false";
                        System.out.println("Wanted smoker = false");
                        break;
                }
            }
        };
        
        cbxSmoker.addActionListener(actLisSmoker);
		
		JComboBox cbxPets = new JComboBox();
		cbxPets.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		cbxPets.setMaximumRowCount(2);
		cbxPets.setBounds(350, 267, 126, 29);
		contentPane.add(cbxPets);
		
        ActionListener actLisPets = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) cbxPets.getSelectedItem();
                SwitchVars sv = null;
                sv = ((s == "Yes") ? sv.YES : sv.NO);

                switch (sv) {//check for a match
                	default:
                    case YES:
                        ReturnMatchIDs.wantedPets = "true";
                        System.out.println("Wanted pets = true");
                        break;
                    case NO:
                        ReturnMatchIDs.wantedPets = "false";
                        System.out.println("Wanted pets = false");
                        break;
                }
            }
        };
		
        cbxPets.addActionListener(actLisPets);
		
		JComboBox cbxGender = new JComboBox();
		cbxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		cbxGender.setMaximumRowCount(2);
		cbxGender.setBounds(350, 327, 126, 29);
		contentPane.add(cbxGender);
		
        ActionListener actLisGender = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) cbxGender.getSelectedItem();
                SwitchVars sv = null;
                sv = ((s == "Male") ? sv.MALE : sv.FEMALE);

                switch (sv) {//check for a match
                	default:
                    case MALE:
                        ReturnMatchIDs.wantedGender = "Male";
                        System.out.println("Wanted gender = Male");
                        break;
                    case FEMALE:
                        ReturnMatchIDs.wantedGender = "Female";
                        System.out.println("Wanted gender = Female");
                        break;
                }
            }
        };
        
        cbxGender.addActionListener(actLisGender);
	}
}

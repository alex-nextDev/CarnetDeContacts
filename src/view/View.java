package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;


import java.awt.Font;


public class View {

	JFrame frmMesContacts;
	private final JLabel lblNewLabel = new JLabel("Contact datas :");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JList list;
	private JScrollBar scrollBar;
	private JButton btnAjouter;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnErase;

	

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	

	/**
	 * Create the application.
	 */
	
	
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMesContacts = new JFrame();
		frmMesContacts.setFont(new Font("Helvetica", Font.BOLD, 14));
		frmMesContacts.setTitle("MES CONTACTS");
		frmMesContacts.setBounds(100, 100, 600, 500);
		frmMesContacts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMesContacts.getContentPane().setLayout(null);
		lblNewLabel.setBounds(20, 17, 176, 16);
		frmMesContacts.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setBounds(20, 60, 28, 16);
		frmMesContacts.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lastname :");
		lblNewLabel_2.setBounds(20, 90, 78, 16);
		frmMesContacts.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Firstname :");
		lblNewLabel_3.setBounds(20, 120, 70, 16);
		frmMesContacts.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email :");
		lblNewLabel_4.setBounds(20, 150, 61, 16);
		frmMesContacts.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phone :");
		lblNewLabel_5.setBounds(20, 180, 78, 16);
		frmMesContacts.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("---");
		lblNewLabel_6.setBounds(101, 60, 61, 16);
		frmMesContacts.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(101, 85, 151, 26);
		frmMesContacts.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 115, 150, 26);
		frmMesContacts.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 145, 151, 26);
		frmMesContacts.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 175, 151, 26);
		frmMesContacts.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		JButton btnAjouter = new JButton("Add");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAjouter.setBounds(20, 227, 117, 29);
		frmMesContacts.getContentPane().add(btnAjouter);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(135, 227, 117, 29);
		frmMesContacts.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(20, 260, 117, 29);
		frmMesContacts.getContentPane().add(btnUpdate);
		
		JButton btnErase = new JButton("Erase");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnErase.setBounds(135, 260, 117, 29);
		frmMesContacts.getContentPane().add(btnErase);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setForeground(Color.BLACK);
		panel.setBounds(6, 42, 258, 409);
		frmMesContacts.getContentPane().add(panel);
		
		
		
		
		
		JLabel lblList = new JLabel("Contact List :");
		lblList.setBounds(276, 17, 112, 16);
		frmMesContacts.getContentPane().add(lblList);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(568, 60, 15, 380);
		frmMesContacts.getContentPane().add(scrollBar);
		
		 list = new JList();
		list.setBounds(276, 60, 307, 380);
		frmMesContacts.getContentPane().add(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel_1.setBounds(268, 42, 326, 409);
		frmMesContacts.getContentPane().add(panel_1);
	}

	public JFrame getFrmMesContacts() {
		return frmMesContacts;
	}

	public void setFrmMesContacts(JFrame frmMesContacts) {
		this.frmMesContacts = frmMesContacts;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}
	
	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JScrollBar getScrollBar() {
		return scrollBar;
	}

	public void setScrollBar(JScrollBar scrollBar) {
		this.scrollBar = scrollBar;
	}

	public JButton getBtnAjouter() {
		return btnAjouter;
	}

	public void setBtnAjouter(JButton btnAjouter) {
		this.btnAjouter = btnAjouter;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public JButton getBtnErase() {
		return btnErase;
	}

	public void setBtnErase(JButton btnErase) {
		this.btnErase = btnErase;
	}
	
	
}

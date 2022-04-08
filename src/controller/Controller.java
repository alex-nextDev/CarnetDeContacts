package controller;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import model.ContactDAO;
import model.ContactModel;
import view.View;

public class Controller
{
	private ContactModel modele;
	private View vue;
	private ContactDAO contactDao;
	private ArrayList<ContactModel> arrayContacts = null;
	
	
	public Controller(ContactModel modele, View vue)
	{
		this.modele = modele;
		this.vue = vue;
		this.contactDao = new ContactDAO();
		initController();
	}
	

	public Controller(View vue)
	{
		
		this.vue = vue;
		contactDao = new ContactDAO();
		arrayContacts = contactDao.getAllContacts();
		vue.getList().setListData(arrayContacts.toArray());
		initController();
		
		
	}
	
	
	public void initController()
	{
		vue.getBtnAjouter().addActionListener(ActionEvent -> ajouterContact());
		
		vue.getList().addListSelectionListener(ListSelectionEvent -> selectionnerContact());
		vue.getBtnUpdate().addActionListener(ActionEvent -> modifierContact());
		vue.getBtnDelete().addActionListener(ActionEvent -> supprimerContact());
		//vue.getBtnErase().addActionListener(ActionEvent -> effacerContact());
		
		
	}
	

	
	private void ajouterContact()
	{
		String nom = vue.getTextField().getText();
		String prenom = vue.getTextField_1().getText();
		String mail = vue.getTextField_2().getText();
		String tel = vue.getTextField_3().getText();
		
		//Reconstruction du contact à partir de la BDD
		
		modele = new ContactModel();
		modele.setNom_cont(nom);
		modele.setPrenom_cont(prenom);
		modele.setMail_cont(mail);
		modele.setTel_cont(tel);
		
		contactDao.ajouterContact(modele);
		
		arrayContacts = contactDao.getAllContacts();
		vue.getList().setListData(arrayContacts.toArray());
		
		vue.getLblNewLabel().setText("contact ajouté");
	}
	
	
	private void selectionnerContact()
	{
		int index = vue.getList().getSelectedIndex();
		if(index == -1)
			return;
		
		ContactModel modele = (ContactModel) arrayContacts.get(index);
		
		vue.getIdLabel().setText(modele.getId_cont() + "");
		vue.getTextField().setText(modele.getNom_cont());
		vue.getTextField_1().setText(modele.getPrenom_cont());
		vue.getTextField_2().setText(modele.getMail_cont());
		vue.getTextField_3().setText(modele.getTel_cont());
	}

	
	private void modifierContact()
	{
		String idCont = vue.getIdLabel().getText();
		int id__ = Integer.parseInt(idCont);
		String nom = vue.getTextField().getText();
		String prenom = vue.getTextField_1().getText();
		String mail = vue.getTextField_2().getText();
		String tel = vue.getTextField_3().getText();
		
		
		modele = new ContactModel();
		modele.setId_cont(id__);
		modele.setNom_cont(nom);
		modele.setPrenom_cont(prenom);
		modele.setMail_cont(mail);
		modele.setTel_cont(tel);
		
		contactDao.modifierContact(modele);
		
		arrayContacts = contactDao.getAllContacts();
		vue.getList().setListData(arrayContacts.toArray());
		
		vue.getLblNewLabel().setText("contact modifié");
	}
	
	private void supprimerContact()
	{
		
		String idCont = vue.getIdLabel().getText();
		int id__ = Integer.parseInt(idCont);
		String nom = vue.getTextField().getText();
		String prenom = vue.getTextField_1().getText();
		String mail = vue.getTextField_2().getText();
		String tel = vue.getTextField_3().getText();

		
	
		modele = new ContactModel();
		modele.setId_cont(id__);
		modele.setNom_cont(nom);
		modele.setPrenom_cont(prenom);
		modele.setMail_cont(mail);
		modele.setTel_cont(tel);
	
		
		contactDao.supprimerContact(modele);
		
		arrayContacts = contactDao.getAllContacts();
		vue.getList().setListData(arrayContacts.toArray());
		
		vue.getLblNewLabel().setText("contact supprimé");
		
	}
	
}

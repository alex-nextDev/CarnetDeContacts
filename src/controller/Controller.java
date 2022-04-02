package controller;

import javax.swing.JList;
import java.util.*;
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
	
	
	
	public Controller(View view)
	{
		
		this.vue = view;
		contactDao = new ContactDAO();
		arrayContacts = contactDao.getAllContacts();
		vue.getList().setListData(arrayContacts.toArray());
		
		
	}
	
	
	public void initController()
	{
		vue.getBtnAjouter().addActionListener(ActionEvent -> ajouterContact());
		
	}
	

	private void ajouterContact()
	{
		String nom = vue.getTextField().getText();
		String prenom = vue.getTextField_1().getText();
		String mail = vue.getTextField_2().getText();
		String tel = vue.getTextField_3().getText();
		
		
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
	

}

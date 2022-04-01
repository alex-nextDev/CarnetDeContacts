package model;

import java.sql.*;

import java.text.*;
import java.util.*;


/*
 * Connexion
 * Methodes pour envoyer et recupérer reponse
 */

public class ContactDAO
{
	private Connection conn;
	
	public ContactDAO()
	{
		conn = MaConnexion.getConnection();
	}

	
	/*
	 * contM -> un objet ContactModel
	 */
	
	
	public void ajouterContact(ContactModel contM)
	{
		try
		{
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO contacts(nom_cont, prenom_cont, mail_cont, tel_cont) VALUES (?, ?, ?, ?)");
		
			
			preparedStatement.setString(1, contM.getNom_cont());
			preparedStatement.setString(2, contM.getPrenom_cont());
			preparedStatement.setString(3, contM.getMail_cont());
			preparedStatement.setString(4, contM.getTel_cont());
			preparedStatement.executeUpdate();
		}
		catch(SQLException ex)
		{
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ((SQLException)ex).getSQLState());
			System.out.println("VendorError : " + ((SQLException)ex).getErrorCode());
			
		}
			
	}
	
	
	/*
	 * ArrayList : contMListe
	 */
	
	public ArrayList<ContactModel> getAllContacts()
	{
		
		ArrayList<ContactModel> contMListe = new ArrayList<ContactModel>();
		
		try
		{
			Statement st = conn.createStatement();
			ResultSet resultats = st.executeQuery("SELECT * FROM contacts ORDER BY id_cont");
			
			while(resultats.next())
			{
				/*
				 * Reconstruction de l'objet contact à partir de la BDD
				 */
				
				ContactModel contM = new ContactModel();
				contM.setId_cont(resultats.getInt("id_cont"));
				contM.setNom_cont(resultats.getString("nom_cont"));
				contM.setPrenom_cont(resultats.getString("prenom_cont"));
				contM.setMail_cont(resultats.getString("mail_cont"));
				contM.setTel_cont(resultats.getString("tel_cont"));
				contMListe.add(contM);
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		
		return contMListe;
	}
	
}

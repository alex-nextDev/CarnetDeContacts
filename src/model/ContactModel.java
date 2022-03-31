package model;

public class ContactModel
{

	private int id_cont;
	private String nom_cont;
	private String prenom_cont;
	private String mail_cont;
	private String tel_cont;
	
	public ContactModel()
	{
		this.id_cont = 0;
		this.nom_cont = "";
		this.prenom_cont = "";
		this.mail_cont = "";
		this.tel_cont = "";
		
	}

	public int getId_cont()
	{
		return id_cont;
	}

	public void setId_cont(int id_cont)
	{
		this.id_cont = id_cont;
	}

	public String getNom_cont()
	{
		return nom_cont;
	}

	public void setNom_cont(String nom_cont)
	{
		this.nom_cont = nom_cont;
	}

	public String getPrenom_cont()
	{
		return prenom_cont;
	}

	public void setPrenom_cont(String prenom_cont)
	{
		this.prenom_cont = prenom_cont;
	}

	public String getMail_cont()
	{
		return mail_cont;
	}

	public void setMail_cont(String mail_cont)
	{
		this.mail_cont = mail_cont;
	}

	public String getTel_cont()
	{
		return tel_cont;
	}

	public void setTel_cont(String tel_cont)
	{
		this.tel_cont = tel_cont;
	}
	
	@Override
	public String toString()
	{
		return id_cont + " " + nom_cont + " " + prenom_cont + " " + mail_cont + " " + tel_cont;
	}
	
	
}

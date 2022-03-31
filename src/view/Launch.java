package view;

import controller.Controller;

public class Launch
{

	public static void main(String[] args)
	{
		
		View vue = new View();
		
		Controller controller = new Controller(vue);
		
		try
		{
			vue.frmMesContacts.setVisible(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package de.holobp.newsletter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import de.holobp.kernel.BenutzerStammdaten;
import de.holobp.kernel.Interesse;
import de.holobp.kernel.Interessen;
import de.holobp.kernel.User;

@ManagedBean(name="anmeldungUser")
public class AnmeldungUser {
	private String email;
	private String password;
	private int id;
	
	 private static SessionFactory factory; 

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	private String[] interessenString;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getInteressenString() {
		return interessenString;
	}
	public void setInteressenString(String[] interessenString) {
		this.interessenString = interessenString;
	}
	
	
	public User getUSer()
	{
		this.id = 100;
		
		
		User user = new User();
		user.setEmail(this.email);
		user.setUsername(this.email);
		user.setPassword(this.password);
		user.setId(this.id);
		return user;
	}
	
	private BenutzerStammdaten getBenutzerStammdaten()
	{
		BenutzerStammdaten benutzerStammdaten = new BenutzerStammdaten();
		
		benutzerStammdaten.setEmail1(this.email);
		benutzerStammdaten.setInteressen(this.getInteressen());
		
		return benutzerStammdaten;
	}
	
	public Interessen getInteressen()
	{
		Interessen interessen = new Interessen();
		for (int i=0; i<this.interessenString.length; i++)
		{
			interessen.addInteresse(new Interesse(interessenString[i]));
		}
		
		interessen.setId(this.id);
		
		return interessen;
		
	}
	
	public String save ()
	{
		User user = getUSer();
		// hybernate
		
		try{
	         factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		
		 Session session = factory.openSession();
		try {
			
		      Transaction tx = null;
		      
		      
		      tx = session.beginTransaction();
			// Save employee, saving behavior get done in a transactional manner
			 session.save(user);
			 tx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
	        session.close(); 
	      }
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Sie wurden zum Newsletter erfolgreich angemeldet."));
		return "";
		
	}
	

}

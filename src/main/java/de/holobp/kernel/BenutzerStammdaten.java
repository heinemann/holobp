package de.holobp.kernel;

public class BenutzerStammdaten {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private String vorname;
	private String nachname;
	private String adresse;
	private String bundesstaat;
	private String stadt;
	private String adresse_zusatz;
	private String plz;
	private String land;
	private String geburtstag;
	private String email1;
	private String email2;
	private String email3;
	private String titel;
	private String subtitel;
	private Interessen interessen;
	private String geburtsname;
	private String kuenstlername;
	private String geburtsort;
	private String sprache;
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getBundesstaat() {
		return bundesstaat;
	}
	public void setBundesstaat(String bundesstaat) {
		this.bundesstaat = bundesstaat;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getAdresse_zusatz() {
		return adresse_zusatz;
	}
	public void setAdresse_zusatz(String adresse_zusatz) {
		this.adresse_zusatz = adresse_zusatz;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getGeburtstag() {
		return geburtstag;
	}
	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEmail3() {
		return email3;
	}
	public void setEmail3(String email3) {
		this.email3 = email3;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getSubtitel() {
		return subtitel;
	}
	public void setSubtitel(String subtitel) {
		this.subtitel = subtitel;
	}
	public Interessen getInteressen() {
		return interessen;
	}
	public void setInteressen(Interessen interessen) {
		this.interessen = interessen;
	}
	public String getGeburtsname() {
		return geburtsname;
	}
	public void setGeburtsname(String geburtsname) {
		this.geburtsname = geburtsname;
	}
	public String getKuenstlername() {
		return kuenstlername;
	}
	public void setKuenstlername(String kuenstlername) {
		this.kuenstlername = kuenstlername;
	}
	public String getGeburtsort() {
		return geburtsort;
	}
	public void setGeburtsort(String geburtsort) {
		this.geburtsort = geburtsort;
	}
	public String getSprache() {
		return sprache;
	}
	public void setSprache(String sprache) {
		this.sprache = sprache;
	}
	
	public void addInteresse(Interesse interesse)
	{
		this.interessen.addInteresse(interesse);
	}
	
	public void RemoveInteresse(Interesse interesse)
	{
		this.interessen.removeInteresse(interesse);
	}
	

}

/**
 * Klasse für einzelnes Interesse. 
 * 
 * @author Adrian
 * @author Allan Grunert <contact@allangrunert.de>
 * 
 */
package de.holobp.kernel;

public class Interesse {
	private String name;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Interesse(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

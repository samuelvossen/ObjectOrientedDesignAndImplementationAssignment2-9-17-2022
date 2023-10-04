package edu.ics372.pa2;

/**
 * this abstract MuseumEntity class creates an object with instance variable
 * name of type String
 * 
 * @author samuel vossen
 *
 */
abstract class MuseumEntity implements Entity {
	private String name;

	/**
	 * this method take in the name of a string and creates a new object with it
	 * 
	 * @param name. a String.
	 * @postcondition a new object has been created
	 */
	public MuseumEntity(String name) {
		this.name = name;
	}

	/**
	 * this method retrieves the name for the object.
	 */
	public String getName() {
		return this.name;
	}

}

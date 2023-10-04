package edu.ics372.pa2;

/**
 * this painting class that extends the Exhibit class creates an object with
 * instance variable wall of type Wall.
 * 
 * @author samuel vossen
 *
 */
public class Painting extends Exhibit {
	private Wall wall;

	/**
	 * this constructor creates a new Paintings object.
	 * 
	 * @param name.   a string.
	 * @param artist. a string.
	 * @param year.   an int.
	 * @postcondition a new painting object has been created
	 */
	public Painting(String name, String artist, int year) {
		super(name, artist, year);
	}

	/**
	 * this method takes in a wall object and adds a painting object to it.
	 * 
	 * @param wall. a Wall object.
	 */
	public void setWall(Wall wall) {
		this.wall = wall;
		wall.addPainting(this);
	}

}

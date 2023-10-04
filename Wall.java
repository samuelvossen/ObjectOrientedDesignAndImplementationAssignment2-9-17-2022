package edu.ics372.pa2;

import java.util.ArrayList;
import java.util.List;

/**
 * this Wall class which extends the MuseumEntity class creates an object with
 * instance variable painting which is a list of type painting.
 * 
 * @author samuel vossen
 *
 */
public class Wall extends MuseumEntity {
	private List<Painting> painting;

	/**
	 * this constructor creates a new wall object suing the superclass
	 * 
	 * @param name. a string.
	 */
	public Wall(String name) {
		super(name);
		this.painting = new ArrayList<Painting>();

	}

	/**
	 * this method overides getExhibit to return a the paintings list held in the
	 * class.
	 */
	@Override
	public List<Exhibit> getExhibits() {
		List<Exhibit> x = new ArrayList<Exhibit>(this.painting);
		return x;
	}

	/**
	 * this method allows the user to add a painting to the paintings list
	 * 
	 * @param newPainting. a painting object.
	 */
	public void addPainting(Painting newPainting) {
		painting.add(newPainting);
	}

}

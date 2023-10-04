package edu.ics372.pa2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * this Room class that extends the MuseumEntity class creates an object with
 * instance variables walls which is a list of type Wall, and sculpture which is
 * a list of type Sculpture.
 * 
 * @author samuel vossen
 *
 */
public class Room extends MuseumEntity {
	private List<Wall> walls;
	private List<Sculpture> sculpture;

	/**
	 * this constructor creates a new Room object using the superclass.
	 * 
	 * @param name. a string.
	 */
	public Room(String name) {
		super(name);
		this.walls = new ArrayList<Wall>();
		this.sculpture = new ArrayList<Sculpture>();
	}

	/**
	 * this method overides the getExhibit method. returning a list of all the
	 * sculptures and paintings in the room object.
	 */
	@Override
	public List<Exhibit> getExhibits() {
		List<Exhibit> x = new ArrayList<Exhibit>(this.sculpture);
		Iterator iterator = walls.iterator();
		while (iterator.hasNext()) {
			Wall y = (Wall) iterator.next();
			x.addAll(y.getExhibits());
		}
		return x;
	}

	/**
	 * this method allows the user to add a wall to the room.
	 * 
	 * @param name. a string
	 * @retun a new wall object.
	 */
	public Wall addWall(String name) {
		Wall newWall = new Wall(name);
		walls.add(newWall);
		return newWall;

	}

	/**
	 * this method allows the user to add a sculpture to a room
	 * 
	 * @param newSculpture. a sculpture object.
	 */
	public void addSculpture(Sculpture newSculpture) {
		sculpture.add(newSculpture);

	}

}

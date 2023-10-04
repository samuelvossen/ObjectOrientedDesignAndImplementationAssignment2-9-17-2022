package edu.ics372.pa2;

/**
 * this Sculpture class that extends the Exhibit class creates an object with
 * instance variable room of type Room.
 * 
 * @author samuel vossen
 *
 */
public class Sculpture extends Exhibit {
	private Room room;

	/**
	 * this constructor creates a new sculpture object using the superclass
	 * 
	 * @param name.  a string
	 * @param artis. a string
	 * @param year.  an int
	 */
	public Sculpture(String name, String artist, int year) {
		super(name, artist, year);
	}

	/**
	 * this method adds a sculpture to the room passed.
	 * 
	 * @param room. a room object.
	 */
	public void setRoom(Room room) {
		this.room = room;
		room.addSculpture(this);
	}

}

package edu.ics372.pa2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * this museum class creates an object with instance variable room which is a
 * list of type Room
 * 
 * @author samuel vossen
 *
 */
public class Museum extends MuseumEntity {
	private List<Room> rooms = new ArrayList<Room>();

	/**
	 * constructor for the Museum class that creates a new Museum object by passing
	 * the name to the super class.
	 * 
	 * @param name. a String.
	 * @postcondition a new Museum object has been created whos instance variables
	 *                are set to the parameters passed.
	 */
	public Museum(String name) {
		super(name);
	}

	/**
	 * this method takes the list of rooms created by the class, and returns a list
	 * of all the paintings and sculptures in all the rooms.
	 * 
	 * @return a list of all the paintings and sculptures in all the rooms.
	 */
	@Override
	public List<Exhibit> getExhibits() {
		List<Exhibit> x = new ArrayList<Exhibit>();
		Iterator iterator = rooms.iterator();
		while (iterator.hasNext()) {
			Room y = (Room) iterator.next();
			x.addAll(y.getExhibits());
		}
		return x;
	}

	/**
	 * this method takes in a string and creates a new room object, adds the room
	 * object to the current rooms list, and returns the new room object.
	 * 
	 * @param name. a string
	 * @return the new room object.
	 */
	public Room addRoom(String name) {
		Room newRoom = new Room(name);
		rooms.add(newRoom);
		return newRoom;
	}

}

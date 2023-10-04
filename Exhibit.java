package edu.ics372.pa2;

/**
 * this exhibit class creates an object with instance variables of name and
 * artist both of type string, and year of type int.
 * 
 * 
 * @author samuel vossen
 *
 */
public class Exhibit {
	private String name;
	private String artist;
	private int year;

	/**
	 * constructor for the Exhibit class that creates a new Exhibit object whos
	 * instance variables are set to the parameters passed.
	 * 
	 * @param name.   a String.
	 * @param artist. a String.
	 * @param year.   a int
	 * @postcondition a new Exhibit object has been created whos instance variables
	 *                are set to the parameters passed.
	 */
	public Exhibit(String name, String artist, int year) {
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Exhibit [name=" + name + ", artist=" + artist + ", year=" + year + "]";
	}

}

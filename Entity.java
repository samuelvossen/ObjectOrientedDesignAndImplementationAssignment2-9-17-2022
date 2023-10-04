package edu.ics372.pa2;

import java.util.List;

/**
 * this interface sets up methods that will be used in the museum, painting,
 * room, and sculpture classes.
 * 
 * @author samuel vossen
 */
public interface Entity {
	public String getName();

	public List<Exhibit> getExhibits();
}

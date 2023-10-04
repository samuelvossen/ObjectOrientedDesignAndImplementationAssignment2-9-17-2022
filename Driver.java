package edu.ics372.pa2;

/**
 * this Driver class test the code of the other classes.
 * 
 * @author samuel vossen
 *
 */
public class Driver {

	public static void main(String[] args) {
		String[] sculptureNames = { "s1", "s2", "s3", "s4" };
		String[] sculptureArtists = { "sa1", "sa2", "sa3", "sa4" };
		int[] sculptureYears = { 1701, 1702, 1703, 1704 };
		Sculpture[] sculptures = new Sculpture[sculptureNames.length];
		for (int index = 0; index < sculptures.length; index++) {
			sculptures[index] = new Sculpture(sculptureNames[index], sculptureArtists[index], sculptureYears[index]);
		}
		String[] documentNames = { "d1", "d2", "d3", "d4" };
		String[] documentAuthors = { "da1", "da2", "da3", "da4" };
		int[] documentYears = { 1801, 1802, 1803, 1804 };
		String[] paintingNames = { "p1", "p2", "p3", "p4" };
		String[] paintingAuthors = { "pa1", "pa2", "pa3", "pa4" };
		int[] paintingYears = { 1900, 1901, 1903, 1904 };
		Painting[] paintings = new Painting[paintingNames.length];
		for (int index = 0; index < paintings.length; index++) {
			paintings[index] = new Painting(paintingNames[index], paintingAuthors[index], paintingYears[index]);
		}
		Museum museum = new Museum("M1");
		Room room1 = museum.addRoom("r1");
		Room room2 = museum.addRoom("r2");
		Wall wall1 = room1.addWall("w1");
		Wall wall2 = room1.addWall("w2");
		Wall wall3 = room2.addWall("w3");
		Wall wall4 = room2.addWall("w4");
		sculptures[0].setRoom(room1);
		sculptures[1].setRoom(room1);
		sculptures[2].setRoom(room2);
		sculptures[3].setRoom(room2);
		paintings[0].setWall(wall1);
		paintings[1].setWall(wall1);
		paintings[2].setWall(wall3);
		paintings[3].setWall(wall3);
		System.out.println("Museum Exhibits");
		for (Exhibit exhibit : museum.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Museum Exhibits End");
		System.out.println("Room 1 Exhibits");
		for (Exhibit exhibit : room1.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Room 1 Exhibits End");
		System.out.println("Room 2 Exhibits");
		for (Exhibit exhibit : room2.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Room 2 Exhibits End");
		System.out.println("Wall 1 Exhibits");
		for (Exhibit exhibit : wall1.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Wall 1 Exhibits End");
		System.out.println("Wall 2 Exhibits");
		for (Exhibit exhibit : wall2.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Wall 2 Exhibits End");
		System.out.println("Wall 3 Exhibits");
		for (Exhibit exhibit : wall3.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Wall 3 Exhibits End");
		System.out.println("Wall 4 Exhibits");
		for (Exhibit exhibit : wall4.getExhibits()) {
			System.out.println(exhibit);
		}
		System.out.println("Wall 4 Exhibits End");
	}
}

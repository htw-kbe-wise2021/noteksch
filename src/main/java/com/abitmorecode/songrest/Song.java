package com.abitmorecode.songrest;

/**
 * Song Class
 */
public class Song {
	private int id;
	private String title;
	private String artist;
	private String label;
	private int released;

	/**
	 * Song constructor
	 * @param id id int
	 * @param title Song title String
	 * @param artist Artist Name String
	 * @param label Label Name String
	 * @param released Release Year int
	 */
	public Song(int id, String title, String artist, String label, int released) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.label = label;
		this.released = released;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getReleased() {
		return released;
	}

	public void setReleased(int released) {
		this.released = released;
	}

	/**
	 * custom to String
	 * @return String
	 */
	@Override
	public String toString() {
		return "Song{" + "id=" + id + ", title='" + title + '\'' + ", artist='" + artist + '\'' + ", label='" + label + '\'' + ", released=" + released + '}';
	}
}

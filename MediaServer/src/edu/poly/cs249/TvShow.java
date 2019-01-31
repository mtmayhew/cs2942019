/**
 * 
 */
package edu.poly.cs249;

import java.util.Date;

/**
 * @author mtmay
 *
 */
public class TvShow {
	String title;
	String desctription;
	String genre;
	Director director;
	double rating;
	String audianceRating;
	Actor[] actors;
	Date releaseDate;

	/**
	 * 
	 */
	public TvShow() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesctription() {
		return desctription;
	}

	public void setDesctription(String desctription) {
		this.desctription = desctription;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAudianceRating() {
		return audianceRating;
	}

	public void setAudianceRating(String audianceRating) {
		this.audianceRating = audianceRating;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}

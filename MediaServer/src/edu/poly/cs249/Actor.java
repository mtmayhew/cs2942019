/**
 * 
 */
package edu.poly.cs249;

/**
 * @author mtmay
 *
 */
public class Actor {
	public String Name;
	public int age;
	public Movie[] movies;
	public TvShow[] tvShows;
	public String[] awards;

	public Actor() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}

	public TvShow[] getTvShows() {
		return tvShows;
	}

	public void setTvShows(TvShow[] tvShows) {
		this.tvShows = tvShows;
	}

	public String[] getAwards() {
		return awards;
	}

	public void setAwards(String[] awards) {
		this.awards = awards;
	}

	/**
	 * 
	 */
	

}

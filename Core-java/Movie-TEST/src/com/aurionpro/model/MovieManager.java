package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Movie;

public class MovieManager {
	List<Movie> movies;
	static final String FILEPATH = "D:\\movie.txt";

	public MovieManager() {
		super();
		this.movies = new ArrayList<>();
		loadMovies();
	}

	private void loadMovies() {
		try {
			FileInputStream fis = new FileInputStream(FILEPATH);
			int b = fis.available();
			if (b != 0) {
				ObjectInputStream in = new ObjectInputStream(fis);
				movies = (List<Movie>) in.readObject();
				in.close();
			}
			fis.close();

		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println(movies);
		saveMovie();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public int getmovieId() {
		int id = 0;
		for (int i = 0; i < movies.size(); i++) {
			id = movies.get(i).getId();
		}
		return id;
	}

	public void deleteMovieByID(int id) {
		boolean isFound = false;
		Movie movieToRemove = null;
		for (Movie x : movies) {
			if (x.getId() == id) {
				isFound = true;
				movieToRemove = x;
			}
		}
		if (isFound) {
			movies.remove(movieToRemove);
		}
		// for (int i = 0; i < movies.size(); i++) {
		// if(id==movies.get(i).getId()) {
		// movies.remove(i);
		// }
		// }
	}

	public void saveMovie() {
		try {
			FileOutputStream file = new FileOutputStream(FILEPATH);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(movies);
			out.flush();

			out.close();
			file.close();

			System.out.println("Movie added successfully!");
		}
		// catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteAllMovies() {
		movies.clear();
		saveMovie();
	}

}

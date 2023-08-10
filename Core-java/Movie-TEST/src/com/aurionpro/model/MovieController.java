package com.aurionpro.model;

import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieManager;

public class MovieController {

	private MovieManager manager;

	public MovieController() {
		super();
		this.manager = new MovieManager();
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 5) {
			System.out.println("Enter 1 : Add movie");
			System.out.println("Enter 2 : Delete movie by ID");
			System.out.println("Enter 3 : Delete all movies");
			System.out.println("Enter 4 : List all movies");
			System.out.println("Enter 5 : Exit");
			System.out.print("Select choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Movie movie = setMovieDetails();
				manager.addMovie(movie);
				break;

			case 2:
				System.out.print("Enter id to delete movie : ");
				int idToDeleteMovie = sc.nextInt();
				manager.deleteMovieByID(idToDeleteMovie);
				break;

			case 3:
				manager.deleteAllMovies();
				System.out.println("List cleared!");
				break;

			case 4:
				List<Movie> movies = manager.getMovies();
				if (movies.isEmpty())
					System.out.println("Movie list is empty");
				else
					System.out.println(movies);
				break;

			case 5:
				break;

			default:
				System.out.println("INVALID CHOICE!");
			}
		}
	}

	private Movie setMovieDetails() {
		Movie movieToAdd = new Movie();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		movieToAdd.setId(id);
		sc.nextLine();
		System.out.print("Enter movie name : ");
		String movieName = sc.nextLine();
		movieToAdd.setName(movieName);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		movieToAdd.setYear(year);
		sc.nextLine();
		System.out.print("Enter genre : ");
		String genre = sc.next();
		movieToAdd.setGenre(genre);
		return movieToAdd;
	}
}

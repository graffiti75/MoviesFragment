package com.example.rodrigo.moviesfragment.model;

/**
 * Movie.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class Movie {
	
	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	
	public String name;
	public Integer year;

	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------
	
	public Movie(String name, Integer year) {
		super();
		this.name = name;
		this.year = year;
	}
	
	//--------------------------------------------------
	// To String
	//--------------------------------------------------
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + "]";
	}

	//--------------------------------------------------
	// Getters and Setters
	//--------------------------------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}	
}
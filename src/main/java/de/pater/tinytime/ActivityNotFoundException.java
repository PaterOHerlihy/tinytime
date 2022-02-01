package de.pater.tinytime;

public class ActivityNotFoundException extends RuntimeException {
	
	public ActivityNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		super("No Activity with ID: "+id);
	}

}

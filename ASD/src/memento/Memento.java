package memento;

//Memento Design Pattern
//Used stores an objects state at a point in time
//so it can be returned to that state later. It
//simply allows you to undo/redo changes on an Object

public class Memento {
	
	// The user profile stored in memento Object
	
	private UserProfile userProfile;

	// Save a new article String to the memento Object
	
	public Memento(UserProfile userProfile) { this.userProfile = userProfile; }
	
	// Return the value stored in article 
	
	public UserProfile getSavedProfile() { return userProfile; }
	
}
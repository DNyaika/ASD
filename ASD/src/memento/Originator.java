package memento;

//Memento Design Pattern

public class Originator{
	
	private UserProfile userProfile;

	// Sets the value for the article
	
	public void set(UserProfile newUserProfile) { 
		System.out.println("From Originator: Current Version of Profile\n"+newUserProfile+ "\n");
	    this.userProfile = newUserProfile; 
	}

	// Creates a new Memento with a new profile
	
	public Memento storeInMemento() { 
	    System.out.println("From Originator: Saving to Memento");
	    return new Memento(userProfile); 
	}
	   
	// Gets the article currently stored in memento
	
	public UserProfile restoreFromMemento(Memento memento) {
		   if(memento==null)
			   return null;
		userProfile = memento.getSavedProfile(); 
	       
		System.out.println("From Originator: Previous profile Saved in Memento\n"+userProfile + "\n");
		
		return userProfile;
	   
	}
	
}
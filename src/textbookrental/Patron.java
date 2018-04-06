package textbookrental;

import java.util.ArrayList;
public class Patron {
	
	DueDate d= new DueDate();
	/* encapsulate data */
	private String PID;
	private String PName;
	private String HOLDS;
	private ArrayList <Copy> checkingOutCopies;
	
	Patron(String newPID, String newName, String newHOLDS) {
		PID = newPID;
		PName = newName;
		HOLDS = newHOLDS;
		checkingOutCopies = new ArrayList<Copy>();
	}
	public void checkOut (Copy copy)
	{
		if ( copy != null)
		{ 
			copy.setCopyTo(this);
		checkingOutCopies.add(copy);
		}	
	} 
	
	public String toString() {
		String display= " " ;
		System.out.println("Patron name:" + PName + "\t Holds:" + HOLDS + "\t Patron Id:" + PID);
		if (checkingOutCopies.isEmpty())
			display= "========================== \n Patron has not checked out copies \n";
		
		else
		{ 
			for ( Copy c: checkingOutCopies )
				System.out.println(" \nChecked out copy:\n" + c.toString()+ d.toString());
		}	 
		return display;
	}

}

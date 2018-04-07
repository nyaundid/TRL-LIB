package textbookrental;

import java.util.ArrayList;
public class Patron {
	
	DueDate d= new DueDate();
	
	private String PID;
	private String PName;
	private String HOLDS;
	private ArrayList <Copy> checkingOutCopies;
	private ArrayList <Holds> claimingHolds;
	
	Patron(String newPID, String newName, String newHOLDS) {
		PID = newPID;
		PName = newName;
		HOLDS = newHOLDS;
		checkingOutCopies = new ArrayList<Copy>();
		claimingHolds = new ArrayList<Holds>();
	}
	public void checkOut (Copy copy)
	{
		if ( copy != null)
		{ 
			copy.setCopyTo(this);
		checkingOutCopies.add(copy);
		}	
	} 
	public void holds (Holds hold)
	{
		if ( hold != null)
		{ 
			hold.setHOLDSTo(this);
			claimingHolds.add(hold);
		}	
	} 
	public String toString() {
		String display= " " ;
		System.out.println("Patron name:" + PName + "\t Holds:" + HOLDS + "\t Patron Id:" + PID);
		
		
		
		if (claimingHolds.isEmpty())
			display= "no holds";
		
		else
		{ 
			for ( Holds h: claimingHolds )
				System.out.println(" \nChecked out copy:\n" + h.toString());
		}	
		
		
		
		if (checkingOutCopies.isEmpty())
			display= "========================== \n Patron has not checked out copies \n";
		
		else
		{ 
			for ( Copy c: checkingOutCopies )
				System.out.println(" \nChecked out copy:\n" + c.toString()+ d.toString());
		}	 
		return display;
	}
	public Object getRentedBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getloanedBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getloanedTextBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}

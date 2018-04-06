import java.util.HashMap;

public class PatronList {
	String Pid;
	private HashMap <String, Patron> PatronList;
	public PatronList()
	{
		PatronList = new HashMap <String, Patron>();
		PatronList.put ("10", new Patron ("10", "Biniam", "Y"));
		PatronList.put ("20", new Patron ("20", "Darius", "N"));
		PatronList.put ("30", new Patron ("30", "Patrice", "Y"));
		PatronList.put ("40", new Patron ("40", "Elvis", "N"));
	}


	public Patron fetchPatron(String PID) {
		Pid = PID;
		Patron searchResult= null;
		
		searchResult = pListSearch(PID ,searchResult);
		return searchResult;								
	}

	public Patron pListSearch(String PID , Patron searchResult) 
	{
		boolean x= true;
		for (int i = 0; i < PatronList.size(); i++) 
		{
			 x = PatronList.containsKey(PID);
			if (x) 
			{
				searchResult= PatronList.get(PID);
				break;			
			}	
			else
				x=false;
		}
		if (!x)
			System.out.println("Patron does not exist");
		
		return searchResult;
	}
}



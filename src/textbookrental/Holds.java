package textbookrental;

public class Holds {
	
		private String HOLDSID;
		private Patron HOLDS;

		public Holds (String H)
		{
			HOLDSID=H;
		}

		public String getHOLDSID() {
			return HOLDSID;
		}
		
		public void setHOLDSTo(Patron p)
		{
			HOLDS=p;
		}
		
		public Patron getHOLDSTo()
		{
			return HOLDS;
		}
		
		public String toString()
		{
			return "\t Copy id:" + HOLDSID + "\t";
		}

		
	}



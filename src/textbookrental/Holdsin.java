package textbookrental;


	import java.util.HashMap;
	public class Holdsin {
		private HashMap <String, Holds> HOLDSList;
		public Holdsin ()
		{
			HOLDSList = new HashMap <String, Holds>();
			HOLDSList.put("Y", new Holds ("Y"));
			HOLDSList.put("N", new Holds ("N"));
				
		}
			

		public Holds fetchHolds (String HOLDSID )
		{
			return HOLDSList.get(HOLDSID);
		}
	}



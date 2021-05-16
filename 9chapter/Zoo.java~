public class Zoo{
	private interface Paper{
		public String getId();
	}
	public class Ticket implements Paper{
		private String serialNumber;
		public String getId(){return serialNumber;}
	}
	public Ticket sellTicket(String serialNumber){
		Ticket ticket = new Ticket();
		ticket.serialNumber = serialNumber;
		return ticket;
	}
	public static void main(String[] args){
		var z = new Zoo();
		var ticket =z.sellTicket("1234");
		System.out.println(ticket.getId());
	}
}

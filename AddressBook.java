
public class AddressBook {
	private String firstname;
    private String lastname;
    private long phoneNumber;
    private String emailId;
    private String address;
    private long zipcode;
    private String city;
    private String state;
	public AddressBook(String firstname, String lastname, long phoneNumber, String emailId, String address,
			long zipcode, String city, String state) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
   }
	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", address=" + address + ", zipcode=" + zipcode + ", city=" + city
				+ ", state=" + state + "]";
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to Address Book Program");
		AddressBook Contactno1= new AddressBook("Deepanjan","Sharma",273689,"deepanjansharma43@gmail.com","Kahalgaon",813214,"Bhagalpur","Bihar");
		System.out.println(Contactno1);
	}
	
}

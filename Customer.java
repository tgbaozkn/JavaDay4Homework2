
public class Customer implements Entity {
 
	int id ; 
	String name ; 
	String surname ; 
	String datetime ;
	
	public Customer() {
		
	}
	public Customer(int id, String name, String surname, String datetime) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.datetime = datetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
}

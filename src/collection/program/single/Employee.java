package collection.program.single;

public class Employee {

	private int id;
	private String name;
	private String address;
	private int contact;
	private int city;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public Employee(int id, String name, String address, int contact, int city) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", city="
				+ city + "]";
	}
	
}

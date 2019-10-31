import java.util.ArrayList;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private ArrayList<Integer> phone;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(String firstName, String lastName, String email, String flat, String city, String state) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = new ArrayList<>();
		address = new Address(flat, city, state);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(int number) {

		this.phone.add(number);
		System.out.println(phone);

	}

	public ArrayList<Integer> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}

}


public class Address {

	private String flat;
	private String city;
	private String state;

	public Address(String flat, String city, String state) {
		super();
		this.flat = flat;
		this.city = city;
		this.state = state;
	}

	public String getFlat() {
		return flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}

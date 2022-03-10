package lhardt.app.address;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lhardt.app.address.Address;

@Entity
@Table(name="address")
public class Address {
	// NOTE: although it would be convenient to let the Address
	// in the school package, there would be a large amount of
	// refactoring necessary on the eventuality that we need
	// to store student adresses as well.

	@Id
	@GeneratedValue
	private long id;

	private String street;

	private String neighbourhood;

	private String city;

	private String state;

	public Address(){

	}

	public long getId(){
		return id;
	}

	public void setId(long id){
		this.id = id;
	}

	public String getStreet(){
		return street;
	}

	public void setStreet(String st){
		this.street = st;
	}

	public String getNeighbourhood(){
		return neighbourhood;
	}

	public void setNeighbourhood(String ng){
		this.neighbourhood = ng;
	}

	public String getCity(){
		return city;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state = state;
	}

	@Override
	public String toString(){
		StringBuilder strb = new StringBuilder();

		strb.append(street);
		strb.append(", ");
		strb.append(neighbourhood);
		strb.append(", ");
		strb.append(city);
		strb.append(", ");
		strb.append(state);
		strb.append(".");

		return strb.toString();
	}
}

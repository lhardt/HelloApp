package lhardt.app.school;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lhardt.app.address.Address;

@Entity
@Table(name="school")
public class School {

	@Id
	@GeneratedValue
	private long id;


	private String name;
	// private Address address;

	// public School(long id, String name, Address address){
	public School(long id, String name){
		this.id = id;
		this.name = name;
		// this.address = address;
	}


	public long getId(){
		return id;
	}

	public void setId(long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	// public Address getAddress(){
	// 	return address;
	// }
	//
	// public void setAddress(Address address){
	// 	this.address = address;
	// }

	@Override
	public boolean equals(Object o){
		if(o == this) return true;
		if(! (o instanceof School) ) return false;

		School other = (School) o;

		return other.id == this.id
			&& this.name.equals(other.getName())
			// && this.address.equals(other.getAddress())
			;
	}

	@Override
	public int hashCode(){
		int hash = 1;
		hash = 31 * hash + (int)id;
		hash = 31 * hash + name.hashCode();
		// hash = 31 * hash + address.hashCode();
		return hash;
	}
}

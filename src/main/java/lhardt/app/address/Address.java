package lhardt.app.address;

public class Address {
	// NOTE: although it would be convenient to let the Address
	// in the school package, there would be a large amount of
	// refactoring necessary on the eventuality that we need
	// to store student adresses as well.

	int id;

	public Address(int id){
		this.id = id;
	}
}

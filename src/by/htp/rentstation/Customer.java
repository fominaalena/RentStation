package by.htp.rentstation;

import java.util.Arrays;
import java.util.Date;

public class Customer {
	public final String name;
	public final int id;
	private Equipment[] rentedItems = new Equipment[3];
	
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	private int getUnusedRentAbilityIndex() {
		int index = -1;
		for (int i = 0; i<rentedItems.length; i++){
			if (rentedItems[i] == null) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	
	public boolean rent(Equipment item, RentStation rentStation) {
		if (!rentStation.has(item)) {
			return false;
		}
		int unusedRentAbilityIndex = getUnusedRentAbilityIndex();
		if(unusedRentAbilityIndex == -1) {
			return false;
		}
		rentedItems[unusedRentAbilityIndex] = item;
		RentUnit rentUnit = new RentUnit(item, 0, this, new Date());
		rentStation.addRentUnit(rentUnit);
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(rentedItems);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(rentedItems, other.rentedItems))
			return false;
		return true;
	}
	
}
package by.htp.rentstation;

public class RentStation {

	private Equipment[] equipments = new Equipment[18];
	private int equipmentCount = 0;

	private RentUnit[] rented = new RentUnit[18];

	public RentStation(int number) {
		this.equipments = new Equipment[number];

	}

	public void addEquipment(Equipment equipment) {
		equipments[this.equipmentCount] = equipment;
		equipmentCount++;
	}

	public void addRentUnit(RentUnit rentUnit) {
		rented[getRentIdNum()] = rentUnit;
	}

	public void returnItem(Equipment item, Customer customer) {
		for (int i = 0; i < rented.length; i++) {
			if (rented[i] != null) {
				if (rented[i].getCustomer().equals(customer)) {
					if (rented[i].getItem().equals(item)) {
						rented[i] = null;
					}
				}
			}
		}
	}

	public void printRentedItems() {
		for (int i = 0; i < rented.length; i++) {
			if (rented[i] != null) {
				System.out.println(rented[i].getCustomer().name + " взял " + rented[i].getItem().getTitle() + " "
						+ rented[i].getRentDate());
			}
		}
	}

	public int getRentIdNum() {
		int id = -1;
		for (int i = 0; i < rented.length; i++) {
			if (rented[i] == null) {
				id = i;
				break;
			}
		}
		return id;
	}

	public boolean has(Equipment item) {
		for (int i = 0; i < rented.length; i++) {
			if (rented[i] != null) {
				if (item.equals(rented[i].getItem())) {
					return false;
				}
			}
		}
		return true;
	}

	public void printAvailableItems() {
		for (int i = 0; i < equipments.length; i++) {
			if (has(equipments[i])) {
				System.out.println(equipments[i].getTitle());
			}
		}
	}
}

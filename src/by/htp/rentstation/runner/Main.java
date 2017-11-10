package by.htp.rentstation.runner;

import by.htp.rentstation.Accessories;
import by.htp.rentstation.Category;
import by.htp.rentstation.Customer;
import by.htp.rentstation.Outfit;
import by.htp.rentstation.RentStation;

public class Main {

	public static void main(String[] args) {
		
		Outfit skiing = new Outfit(Category.WINTER, "����",12);
		Outfit snowboard = new Outfit(Category.WINTER, "��������",15);
		Outfit skates = new Outfit(Category.WINTER, "������", 10);
		Outfit tubing = new Outfit(Category.WINTER, "��������", 9);
		Outfit waterSkiing = new Outfit(Category.WATER, "������ ����", 5);
		Outfit swakeBoard = new Outfit(Category.WATER, "��������", 7);
		Outfit bycicle = new Outfit(Category.SUMMER, "���������",10);
		Outfit scooter = new Outfit(Category.SUMMER, "�������", 12);
		Outfit ball = new Outfit(Category.SUMMER, "���", 7);
		Outfit rollers = new Outfit(Category.SUMMER, "������", 10);
		
		Accessories helmet = new Accessories(Category.SUMMER, "����", 4);
		Accessories kneePads = new Accessories(Category.SUMMER, "�����������",2);
		Accessories elbowPads = new Accessories(Category.SUMMER, "�����������", 3);
		Accessories skiPoles = new Accessories(Category.WINTER, "������ �����",  5);
		Accessories skiBoots = new Accessories(Category.WINTER, "������ �������", 4);
		Accessories snowboardBoots = new Accessories(Category.WINTER, "��������������� �������", 2);
		Accessories lifeVest = new Accessories(Category.WATER, "������������ �����", 1);
		Accessories bikeHelmet = new Accessories(Category.SUMMER, "������������ ����", 4);
		
		RentStation rentStation = new RentStation(18);
		rentStation.addEquipment(bikeHelmet);
		rentStation.addEquipment(lifeVest);
		rentStation.addEquipment(snowboardBoots);
		rentStation.addEquipment(skiBoots);
		rentStation.addEquipment(skiPoles);
		rentStation.addEquipment(elbowPads);
		rentStation.addEquipment(kneePads);
		rentStation.addEquipment(helmet);
		rentStation.addEquipment(rollers);
		rentStation.addEquipment(ball);
		rentStation.addEquipment(scooter);
		rentStation.addEquipment(bycicle);
		rentStation.addEquipment(swakeBoard);
		rentStation.addEquipment(waterSkiing);
		rentStation.addEquipment(tubing);
		rentStation.addEquipment(skates);
		rentStation.addEquipment(snowboard);
		rentStation.addEquipment(skiing);
		
		rentStation.printAvailableItems();
		System.out.println("------");
		Customer vasya = new Customer("Vasya", 1234);
		vasya.rent(elbowPads, rentStation);
		Customer fedya = new Customer("Fedya", 4567);
		fedya.rent(helmet, rentStation);
		fedya.rent(rollers, rentStation);
		Customer petya = new Customer("Petya", 5678);
		petya.rent(waterSkiing, rentStation);
		petya.rent(lifeVest, rentStation);
		petya.rent(helmet, rentStation);
		rentStation.printRentedItems();
		System.out.println("------");
		rentStation.printAvailableItems();
		rentStation.returnItem(helmet, fedya);
		System.out.println("------");
		rentStation.printRentedItems();
		System.out.println("------");
		rentStation.printAvailableItems();
		
	}

}

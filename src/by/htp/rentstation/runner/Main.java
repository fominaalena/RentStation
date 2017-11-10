package by.htp.rentstation.runner;

import by.htp.rentstation.Accessories;
import by.htp.rentstation.Category;
import by.htp.rentstation.Customer;
import by.htp.rentstation.Outfit;
import by.htp.rentstation.RentStation;

public class Main {

	public static void main(String[] args) {
		
		Outfit skiing = new Outfit(Category.WINTER, "Лыжи",12);
		Outfit snowboard = new Outfit(Category.WINTER, "Сноуборд",15);
		Outfit skates = new Outfit(Category.WINTER, "Коньки", 10);
		Outfit tubing = new Outfit(Category.WINTER, "Ватрушка", 9);
		Outfit waterSkiing = new Outfit(Category.WATER, "Водные лыжи", 5);
		Outfit swakeBoard = new Outfit(Category.WATER, "Вейкборд", 7);
		Outfit bycicle = new Outfit(Category.SUMMER, "Велосипед",10);
		Outfit scooter = new Outfit(Category.SUMMER, "Самокат", 12);
		Outfit ball = new Outfit(Category.SUMMER, "Мяч", 7);
		Outfit rollers = new Outfit(Category.SUMMER, "Ролики", 10);
		
		Accessories helmet = new Accessories(Category.SUMMER, "Шлем", 4);
		Accessories kneePads = new Accessories(Category.SUMMER, "Наколенники",2);
		Accessories elbowPads = new Accessories(Category.SUMMER, "Налокотники", 3);
		Accessories skiPoles = new Accessories(Category.WINTER, "Лыжные палки",  5);
		Accessories skiBoots = new Accessories(Category.WINTER, "Лыжные ботинки", 4);
		Accessories snowboardBoots = new Accessories(Category.WINTER, "Сноубордистские ботинки", 2);
		Accessories lifeVest = new Accessories(Category.WATER, "Спасательный жилет", 1);
		Accessories bikeHelmet = new Accessories(Category.SUMMER, "Велосипедный шлем", 4);
		
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

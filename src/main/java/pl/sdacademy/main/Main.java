package pl.sdacademy.main;

import pl.sdacademy.model.Bike;
import pl.sdacademy.model.Opel;
import pl.sdacademy.model.RenaultCar;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Car[] carTable = new Car[2];

		Bike marcinsRomet = new Bike();
		Opel adamsOpel = new Opel();
		RenaultCar maciejsRenault = new RenaultCar;
		maciejsRenault.refuel();
		carTable[0] = adamsOpel;
		carTable[1] = maciejsRenault;
		
		for (int i = 0; i < carTable.length; i++) {
			System.out.println(carTable[i].getInfo());
		}
	}

}

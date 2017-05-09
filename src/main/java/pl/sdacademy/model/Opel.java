package pl.sdacademy.model;

import org.omg.Messaging.SyncScopeHelper;

import pl.sdacademy.enums.BodyType;

public class Opel extends Car {

	public Opel() {
		super(BodyType.HATCHBACK, 4000);
	}

	public void Refuel() {
		System.out.println("Tankuje Opla...");
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Zatankowano");
	}

}

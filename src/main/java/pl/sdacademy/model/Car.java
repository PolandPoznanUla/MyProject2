package pl.sdacademy.model;

import pl.sdacademy.enums.BodyType;
import pl.sdacademy.interfaces.IAction;

public class Car extends Vehicle implements ICar, IAction {

	BodyType bodyType;
	
	
	public Car() {
		super("benzin", 4, 2000.5); //wykonanie konstruktora klasy nadrzednej
		
	}

	
	
	public Car(BodyType bodyType) {
		this(); // wywolanie konstruktora domyslnego
		setBodyType(bodyType);
	}
	
	public Car(BodyType bodyType, double weight) {
		this(bodyType); //wywolanie konstruktora z linii 17
		setWeight(weight); //mamy dostep do setera od ojca - dziedziczenie
	}
	
	
	public BodyType getBodyType() {
		return bodyType;
	}


	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

}

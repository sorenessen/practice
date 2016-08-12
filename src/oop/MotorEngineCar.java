package oop;

public class MotorEngineCar extends MotorCar implements Car{

	
	public void carShape() {
		System.out.println("The car is 5 thousand meters by 5 thousand meters long.");
	}
	public void start() {
		System.out.println("Must have start feature to start the engine.");	
	}
	public void stop() {
		System.out.println("Once you start the car, you must be able to stop it.");	
	}
	public void drive() {
		System.out.println("You can drive the car after starting the engine.");
	}
	public void breakPad(){
		System.out.println("You need break pads to stop the car.");
	}
		
	}


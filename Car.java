
public class Car {
	String type; 
	String color;
	int speed;
	
	public Car(String type, String color, int speed) {
		this.type = type;
		this.color = color;
		this.speed = speed;
	}

	public int increaseSpeed(int increment) {
	        this.speed = this.speed + increment;
	        return this.speed;
	}
	
	public static void main(String[] args) {
		Car car = new Car("Sedan", "White", 60);
		System.out.println("Car Speed is "+car.increaseSpeed(25));
	}
}

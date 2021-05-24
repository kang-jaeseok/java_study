package ex_class;

class Car{
	
	String name = "aaa";
	String color = "흰색";
	boolean power = false;
	int speed = 10;
	
	void powerToggle() {
		power = !power;
	}
	
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
}

public class J20210416_03_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println((c1.power)? "on" : "off");
		c1.powerToggle();
		System.out.println((c1.power)? "on" : "off");
		
		System.out.println("현재 속도: "+ c1.speed);
		c1.speedUp();
		System.out.println("현재 속도: "+ c1.speed);
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		System.out.println("현재 속도: "+ c1.speed);
	}

}

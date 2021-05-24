package ex_class;

class Dog {
	// 속성
	// 자동초기화
	String type = "강아지";
	String name = "멍멍이";
	int legs = 4;
	int cnt; // 걸음수 

	void walking() {
		cnt++;
		System.out.println(name + " 걷는다");
	}
	
	void eating() {
		String food = "사료";
		System.out.println(food + " 먹는다");
	}
}

public class J20210416_03_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		System.out.println(d1.type);
		System.out.println(d1.legs);
		d1.walking();
		System.out.println(d1.cnt);
		d1.eating();
	}

}

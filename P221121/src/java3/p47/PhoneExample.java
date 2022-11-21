package java3.p47;

public class PhoneExample {

	public static void main(String[] args) {
		Phone phone = new SmartPhone("홍길동");

//		Phone phone1 = new Phone("여동구"); // 추상클래스는 인스턴스 생성 불가능

		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

		phone.turnOff();
//		phone.internetSearch(); // 자신이 가지고 있는것만 가능
		phone.turnOn();
	}

}

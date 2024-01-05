package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {  //public이라서 바로 사용 가능
		super(model, color);   //부모 생성자 호출
//		this.model = model;
//		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}

}

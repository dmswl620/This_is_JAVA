package ch06.sec13.exam02.package1;

public class B {
	//필드 선언
	A a1 = new A(true);   	//o		boolean 타입 : public
	A a2 = new A(1);		//o 	int 타입 : default
//	A a3 = new A("문자열"); //x   	String 타입: private 생성자 접근 불가 (컴파일 에러)
}

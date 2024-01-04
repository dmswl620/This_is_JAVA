package ch06.sec13.exam3.package1;	//<- 패키지 동일 

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;	//o public
		a.field2 = 2;   //o default
//		a.field3 = 3;  	//x  <- private 필드 접근 불가(컴파일 에러)
		
		
		//메소드 호출
		a.method1();	//o public
		a.method2();	//o default
//		a.method3(); 	//x	<- private 메소드 접근 불가(컴파일 에러)
	}
}

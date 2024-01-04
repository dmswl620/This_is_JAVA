package ch06.sec13.exam3.package2;  	//다른 패키지

import ch06.sec13.exam3.package1.*;

public class C {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;	//o 	public
//		a.field2 = 2;   //x 	default		같은 패키지x
//		a.field3 = 3;  	//x  	private 	필드 접근 불가(컴파일 에러)
		
		//메소드 호출
		a.method1();	//o 	public
//		a.method2();	//x 	default		같은 패키지x
//		a.method3(); 	//x	 	private 	메소드 접근 불가(컴파일 에러)
}
}
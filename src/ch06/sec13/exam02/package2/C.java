package ch06.sec13.exam02.package2; //다른 패키지
import ch06.sec13.exam02.package1.*;
public class C {
	//필드 선언
	A a1 = new A(true);			//public
//	A a2 = new A(1);			//default -> 다른 패키지는 사용불가
//	A a3 = new A("문자열");		//private
}

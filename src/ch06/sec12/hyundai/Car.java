package ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	//부품 필드 선언
	//명시적 기입을 통해서 다른 패키지의 클래스를 이용할 수 있다.
	//명시적 (패키지경로, 클래스명)으로 객체 생성 가능
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire(); 
	ch06.sec12.kumho.AllSeasonTire tire2 = new ch06.sec12.kumho.AllSeasonTire();

//import된 클래스는 클래스명으로 객체 생성 가능
SnowTire tire3 = new SnowTire();
AllSeasonTire  tire4 = new AllSeasonTire();
}

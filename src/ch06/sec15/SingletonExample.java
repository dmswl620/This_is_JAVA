package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 생성자에 접근이 불가능해서 에러
		Singleton obj1 = new Singleton(); //컴파일 에러
		Singleton obj2 = new Singleton(); //컴파일 에러
		*/
		
		//정적 메소드를 호출해서 싱글톤 객체 얻음
		//생성자로 생성이 되지 않아(접근권한때문) 메소드를 이용해서 생성
		//메소드에서 객체를 값을 리턴 받아서 생성이 가능하다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//obj1, obj2가 Singleton안에 singleton 객체를 같은 값을 지니게 된다.
		
		//동일한 객체를 참조하는지 확인
		if(obj1 == obj2 ) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}

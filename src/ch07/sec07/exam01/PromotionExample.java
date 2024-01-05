package ch07.sec07.exam01;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;		//->자동 타입 변환 (상속관계에 있음)
		A a3 = d;
		A a4 = e;
		
		// B b3 = e;	->컴파일 에러(상속관계에 있지 않음)
		// C c2 = d;
	}

}
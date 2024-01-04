package ch05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		String Num3 = ssn.substring(0, 2);
		System.out.println("출생연도 : " + Num3);

		String Num4 = ssn.substring(7, 8);
		/*switch(Num4) {
		case '1':
		case '3':
			System.out.println("남자");
			
		case '2':
		case '4':
			System.out.println("여자");
		}*/
		
		/*if (Num4 == "1" || Num4 == "3") {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}*/

	}

}

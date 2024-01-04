package ch04;
import java.util.Scanner;
public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double grade; //평점
     //토익 점수를 저장하는 변수를 선언
     int toeic;
     //Scanner 객체 생성, scan
     Scanner scan = new Scanner(System.in);
     System.out.print("평점을 입력하세요 : ");
     grade = scan.nextDouble();
     System.out.print("TOEIC 점수를 입력하세요 : ");
     toeic = scan.nextInt();
     
     if(toeic < 700) {
    	 if(grade < 3.0) {
    	 System.out.println("지원할 수 없습니다");
    	 }
     }else if (grade < 3.5) {
    	 System.out.println("필기 시험 대상자입니다");
     }else if (grade < 4.0) {
    	 System.out.println("서류 전형 대상자입니다");
     } else {System.out.println("면접 대상자입니다");
     }
     
     }
}

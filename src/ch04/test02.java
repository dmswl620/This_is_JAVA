package ch04;
import java.util.Scanner;
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int totalcreditearned; //총 이수 학점
     int toeic;
     
     Scanner scan = new Scanner(System.in);
     
     System.out.print("총 이수학점을 입력하세요 : ");
     totalcreditearned = scan.nextInt();
     System.out.print("TOEIC 점수를 입력하세요 : ");
     toeic = scan.nextInt();
     
     if(totalcreditearned < 140) {
    	 System.out.println("졸업이 불가합니다");
     }else if (toeic < 700) {
    	 System.out.println("아쉽지만 수료하셨습니다");
     }else {
    	 System.out.println("졸업을 축하합니다");
     }
	}

}

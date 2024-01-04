package ch04;
import java.util.Scanner;
import java.util.Random;
public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int targetNumber; // 사용자가 맞추려고 노력하는 숫자
     int guessNumber; //사용자가 추측한 숫자
     int count; //추측한 횟수
     final int sentinel = -1; //감시 숫자
     String again="예"; //계속 여부
     
     Scanner scan = new Scanner(System.in);
     Random generator = new Random();

     while (again.equals("예")) { //
        targetNumber = generator.nextInt(100) + 1; // 랜덤 정수 생성
        count = 0;

        while (true) {
           System.out.print("1~100 사이의 정수 : ");
           guessNumber = scan.nextInt(); // guess 입력

           if (guessNumber == sentinel) {
              System.out.println("끝");
             // break; // 안쓰면 while(true) 무한반복
           }

           count++;

           if (guessNumber < targetNumber) {
              System.out.println("크다");
           } else if (guessNumber > targetNumber) {
              System.out.println("작다");
           } else {
              System.out.println("맞다");
              System.out.println("count : " + count);
              break; // 안쓰면 while(true) 무한반복
           }

        }
        System.out.println("다시 시작? (예/아니오) : ");
        again = scan.next();
     }

     System.out.println("끝");
  }

}
package ch04;
import java.util.Scanner;
public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
     Scanner scan = new Scanner(System.in);
     System.out.print("양의 정수를 입력하세요 : ");
     number = scan.nextInt();
     
     if(number%3==0) {
    	 System.out.println("3의 배수");
     }if(number%5==0) {
    	 System.out.println("5의 배수");
     }if(number%8==0) {
    	 System.out.println("8의 배수");
     }if(number%3!=0 && number%5!=0 && number%8!=0) {
    	 System.out.println("어느 배수도 아니다");
     }
	}
}

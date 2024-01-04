package ch05;
import java.util.Scanner;
public class ghjy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A;
		
		System.out.print("1부터 100까지의 정수 : ");
		A = scan.nextInt();
		
		
		for(int i=A; i<=100; i=i+A) {
			System.out.print(i + " ");
			if(i%10 == 0) {break;}
		}
	}

}

package ch04;
import java.util.Scanner;
public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a;
    int b;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("구입 금액 : ");
    a = scan.nextInt();
    
    if(a>=300000) {
    	b=a-30000;
    }else if(a>=100000) {
    	b=a-5000;
    }else {b=a;}
    System.out.println("청구 금액 : "+b);
	}

}

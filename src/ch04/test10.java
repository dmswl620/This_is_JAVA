package ch04;
import java.util.Scanner;
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;                 //입력 받는 점수
		int totalCount= 0;   //점수들의 총 수
		int Acount = 0;      //A학점의 수     90점 이상
		int Bcount =0;       //B학점의 수     80점 이상 90점 미만
		int Ccount =0;      //C학점의 수     70점 이상 80점 미만  
		int Dcount =0;      //D학점의 수    60점 이상 70점 미만  
		int Fcount =0;        //F학점의 수     60점 미만
		
	Scanner scan = new Scanner(System.in);
	score = 0;
	
	while (score != -1) {	
		System.out.print("점수를 입력하세요(종료하려면 -1을 입력) : ");
	   score = scan.nextInt();
	    
	if (score != -1) {
	 if(score>=90) {Acount++;}
	 else if(score>=80) {Bcount++;}
	 else if(score>=70) {Ccount++;}
	 else if(score>=60) {Dcount++;}
	 else {Fcount++;}
	 totalCount++;
	}
	}
	System.out.println("점수들의 총 수 : "+totalCount);
	System.out.println("A학점 수 : "+Acount);
	System.out.println("B학점 수 : "+Bcount);
	System.out.println("C학점 수 : "+Ccount);
	System.out.println("D학점 수 : "+Dcount);
	System.out.println("F학점 수 : "+Fcount);
	}

}

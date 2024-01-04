package ch04;
import java.util.Scanner;
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attendscore;
	    int assignmentscore;
	    int quizscore;
	    int midtermexamscore;
	    int finalexamscore;
	    
	    double total;
	    String grade="";
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.print("출석 점수를 입력하세요 : ");
	    attendscore = scan.nextInt();
	    System.out.print("과제 점수를 입력하세요 : ");
	    assignmentscore = scan.nextInt();
	    System.out.print("수시 점수를 입력하세요 : ");
	    quizscore = scan.nextInt();
	    System.out.print("중간 점수를 입력하세요 : ");
	    midtermexamscore = scan.nextInt();
	    System.out.print("기말 점수를 입력하세요 : ");
	    finalexamscore = scan.nextInt();
	    
	    total = attendscore*0.1+assignmentscore*0.4+quizscore*0.1+midtermexamscore*0.2+finalexamscore*0.2;
	    System.out.print("총 점 : "+total);
	    if(total >= 90 && total <= 100) {
	    	grade = "A";
	    }else if(total >= 80 && total < 90) {
	    	grade = "B";
	    }else if(total >= 70 && total < 80) {
	    	grade = "C";
	    }else if(total >= 60 && total < 70) {
	    	grade = "D";
	    }else if(total >=0 && total <60) {
	    	grade = "F";}
	    System.out.println("");
	    System.out.print("학점 : "+grade);
	} 
}

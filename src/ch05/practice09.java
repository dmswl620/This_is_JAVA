package ch05;

import java.util.Scanner;

public class practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
        int studentNum;
        int[] scores = null;
        int maxScore=0;
         Scanner scan = new Scanner(System.in);
         int sum=0;
        
        //do
        while(true) {
        
        System.out.println("------------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("------------------------------------------------------");
        System.out.print("선택하세요 : ");
        int selectNo = Integer.parseInt(scan.nextLine());
        System.out.println("선택>" + selectNo);
        
        if(selectNo == 1) {	
        	System.out.print("학생수>");
        	studentNum = Integer.parseInt(scan.nextLine());
        	// 배열 크기 지정
        	scores = new int[studentNum];
        }else if(selectNo == 2) {        	 
        	//배열 크기만큼 반복한다 ->
        	for( int i=0; i<scores.length; i++) { //입력 한 것을 대입한다
        	   System.out.print("scores["+i+"]:");
        	   scores[i] = Integer.parseInt(scan.nextLine());
        	   
        	}
        }else if(selectNo == 3) {
        	for(int i=0; i<scores.length; i++) {
        	System.out.println("scores["+i+"]:"+ scores[i]);
        	}
        }else if(selectNo == 4) {

        	for(int i=0; i<scores.length; i++) {
        		 sum =  sum + scores[i];
        		
        		if(maxScore<scores[i]) {
        			maxScore=scores[i];
        		}
        	}double avg = (double)sum/scores.length;
        	
        	System.out.println("최고점수: " + maxScore);
        	System.out.println("평균점수: " + avg);
        	
        }else if(selectNo == 5) {
        	System.out.println("종료");
        	break;
        }
	
        }
	}

}

package ch04;
import java.util.Scanner;
public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int jumsu;      //점수
     int count = 0;    //점수들의 수
     int max = -1;     //최고 점수
     int min = 101;    //최저 점수
     int sum = 0;      //합계
     double aver;    //평군 점수
     
     Scanner scan = new Scanner(System.in);
     jumsu = 0;
     
     while(jumsu != -99) {
    	 System.out.print("점수를 입력하세요 : ");
     	jumsu = scan.nextInt();  
 
     	if(jumsu != -99) {   //-99가 아니라면 계산O But -99면 X
     		sum=sum+jumsu;
     	    
     		if(max<jumsu) {max=jumsu;}    //max<jumsu -> max=jumsu
            if(min>jumsu) {min=jumsu;}     //min>jumsu -> min=jumsu
            count++;	
     	}
     	
     }
     
    System.out.println("최고 점수 : "+max);
    System.out.println("최저 점수 : "+min);
     aver = (double)sum/count;
    System.out.println("평균 점수 : "+aver);
	}

}

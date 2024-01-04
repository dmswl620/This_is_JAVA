package ch06.exam;
import java.util.*;
public class BankApplication {
	
private static Account[] accountArray = new Account[100];  // 계좌 여러명 생성하기 위해 배열
		private static Scanner scan = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			boolean run = true;
			while(run) {
				System.out.println("-------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("-------------------------------------------");
				System.out.print("선택> ");
			         
					int selectNo = Integer.parseInt(scan.nextLine());
			         
			        if(selectNo == 1) {
			           createAccount();
			           System.out.println("--------");
			           System.out.println("계좌생성");
			           System.out.println("--------");
			           System.out.print("계좌번호: ");
			           String ano = scan.nextLine();
			           System.out.print("계좌주: ");
			           String owner = scan.nextLine();
			           System.out.print("초기입금액: ");
			           String balance = scan.nextLine();
			           System.out.println("계좌가 생성되었습니다.");
			        }else if(selectNo == 2) {
			           accountList();
			           System.out.println("--------");
			           System.out.println("계좌목록");
			           System.out.println("--------");
			           System.out.println(  );
			           
			        }else if(selectNo == 3) {
			           deposit();
			        }else if(selectNo == 4) {
			           withdraw();
			        }else if(selectNo == 5) {
			           run = false;
			        }
			         
			      }
			      System.out.println("프로그램 종료");
			   }
			   
			   private static void createAccount() {
			      
			   }
			   private static void accountList() {
			      
			   }
			   private static void deposit() {
			   
			   }
			   private static void withdraw() {
			   
			   }
			   
			   
			
	}



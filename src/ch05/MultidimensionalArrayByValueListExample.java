package ch05;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 생성
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };

		// 배열의 길이
		System.out.println("1차원 배열 길이의 수(반의 수) : " + scores.length);
		System.out.println("2차원 배열 길이의 수(첫 번째 반의 학생 수) : " + scores[0].length);
		System.out.println("2차원 배열 길이의 수(두 번째 반의 학생 수) : " + scores[1].length);

		// 첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);

		// 두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);

		// 전체 학생의 평균 점수 구하기
		int totalStudent = 0;   //전체 학생 수
		int totalSum = 0;       //전체 점수
		for (int i = 0; i < scores.length; i++) {         //반의 수만큼 반복 1반+2반=총 두개의 반
			totalStudent += scores[i].length;             //반의 학생 수 합산 두 반의 학생수:3명+2명=5명
			for (int k = 0; k < scores[i].length; k++) {  //해당 반의 학생 수만큼 반복
				totalSum += scores[i][k];                 //학생 점수 합산
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);
	}

}

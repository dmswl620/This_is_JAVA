package ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열
		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy(oldStrArray, 1, newStrArray, 0, 2);   //length 길이를 알아야 한다. 
		//배열 항목 출력                                         모르면 전체 가져와보기
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}

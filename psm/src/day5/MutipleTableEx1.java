package day5;

public class MutipleTableEx1 {

	public static void main(String[] args) {
		/* 2단에서 9단까지 구구단을 출력하는 코드를 작성하세요.
		 * 7단 코드를 가져와서 생각
		 * */

		int num = 2, j;
		//단을 2단에서 9단까지 1씩증가
		while(num <= 9) {
			//num2단 출력하는 코드
			j = 1;
			while(j <= 9) {
				System.out.println(num+ "x" + j + "=" + num * j);
				j++;
			}
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

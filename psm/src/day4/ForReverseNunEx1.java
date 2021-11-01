package day4;

public class ForReverseNunEx1 {

	public static void main(String[] args) {
		/* 5부터 1까지 출력하는 예제를 for문을 이용하여 작성하세요
		 * 5 4 3 2 1
		 * 방법1
		 * 반복횟수 : i는 5부터 1까지 1씩 감소
		 * 실행문  : i르 ㄹ출력
		 * 방법2.
		 * 반복횟수 : i는 0부터 5보다 적을때까지 1씩증가
		 * 실행문  : 5 - 1를 출력
		 */
		int i = 0;
		for(i = 5 ; i>=1 ; i--) {
			System.out.print(i + "");
		}
		System.out.println();
		//방법2
		for(i = 0; i < 5 ; i++) {
			System.out.println(5 - i + " ");
		}

	}

}

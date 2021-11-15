package day14;

public class ExcParseEx1 {

	public static void main(String[] args) {
		/* 정수를 문자열로 만드세요.*/
		int num = 10;
		String str = "" + num;
		System.out.println("정수 num : " + num);
		System.out.println("문자열 str : " + str);
		/* 문자열을 정수로 만드는 예제
		 * 래퍼 클래스인 Integer에서 제공하는 parseInt는 메소드를 이용*/
		str ="1234";
		num = Integer.parseInt(str);
		System.out.println("정수 num: " + num);
		System.out.println("문자열 str : " + str);
		
		//문자열을 정수로 바꿀 때 바꿀수 없는 문자열이 있을때
		//NumberFormatException 예외발생
		//num = Integer.parseInt(123.45);
		num = Integer.parseInt("123a");					//예외처리 : 예외가 발생하였을때 코드가 중단되지 않고 이어서 잘 싱행되도록 처리하는것은 예외처리라함.
		System.out.println("예외발생");
	}

}

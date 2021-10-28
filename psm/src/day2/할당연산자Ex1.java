package day2;

public class 할당연산자Ex1 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		num1 = num2;//num2에 있는 20을 num1에 저장 (덮어씀), num1 은 20이됨
		System.out.println("num1=" + num1 + ", num2 =" + num2);
		
		num1= 10;
		num2= 20;
		
		
		num2= num1;// num1에 있는 10을 num2에 저장 (덮어씀), num 은 10이됨
		System.out.println("num1=" + num1 + ", num2 =" + num2);
		
		num1 = num1 + num2; // num1에 있는 10과 num2에 10을 더해서 num1에 저장
		System.out.println("num1=" + num1 + ", num2 =" + num2);
		
		//num1 + num2 = num1; //에러 발생, 대입 연산자 왼쪽에는 변수 1개만 와야한다.
		//num1 + 1 = num1; //에러발생
		
	}

}

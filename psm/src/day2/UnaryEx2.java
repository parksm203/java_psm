package day2;

public class UnaryEx2 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		System.out.println("증가전 : num1 = " + num1 + " ,num2 = " + num2);
		//num1은 전위형증감 결과를 원하고, num2는 후위형증감 결과를 원함
		num1++;//num1은 전위형 효과를 내야하기 떄문에 동작하는 부분 앞에 증가를함. 
		System.out.println("증가중 : num1 = " + num1 + " ,num2 = " + num2);
		num2++;//num2는 후위형 효과를  내야하기 떄문에 동작하는 부분 뒤에 증가를함
		System.out.println("증가후 : num1 = " + num1 + " ,num2 = " + num2);
		
		
		
		
	}

}

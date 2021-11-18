package day17;

import java.util.*;

public class ExaLottoEx1 {

	public static void main(String[] args) {
		/* 로또 프로그램을 day17 패키지의 야구 게임을 활용하여 만드세요.*/
		
		List<Integer> lotto = new ArrayList<Integer>();
		List<Integer> user = new ArrayList<Integer>();
		int bouns = 0;
		int min = 1, max = 45;
		int count = 6, total = 0;
		char ch = 'y';
		Scanner scan = new Scanner(System.in);
		//로또 당첨 번호를 랜덤으로 생성
		ExeBaseballEx1.createRandomLIst(lotto, min, max, count);
		
		
		
		//로또 보너스 번호를 랜덤으로 생성
		while(true) {
			bouns = (int)(Math.random()*(max-min+1)+min);
			if(!lotto.contains(bouns)) {
				break;
			}
		}
		System.out.print(lotto);
		System.out.println(bouns);
		
		//반복
		while(ch =='y'|| ch== 'Y') {
			//사용자가 로또 번호 입력
			System.out.println("6개 입력 : ");
			int inputResult = ExeBaseballEx1.inputList(user, min, max, count, scan);
			switch(inputResult) {
			case -1:
				System.out.println("중복된 값을 입력했습니다.");
				break;
			case 1:
				System.out.println("잘못된 범위의 정수를 입력했습니다.");
				break;
			}
			System.out.println(user);
			//당첨 갯수 확인
			total = ExeBaseballEx1.getBall(lotto, user)
					+ExeBaseballEx1.getStrike(lotto, user);
					
			//당첨 등수 확인
			switch(total) {
			case 6: System.out.println("1등 당첨");   	break;
			case 5: 
				if(user.contains(bouns)) {
					System.out.println("2등당첨");
				}else {
					System.out.println("3등당첨");
				}
				break;
			case 4: System.out.println("5등 당첨");   	break;
			case 3: System.out.println("5등 당첨");   	break;
			default: System.out.println("꽝");
			
			}
			
			//더 할건지 말건지 물어보는 코드
			System.out.println("더 하시겠습니까?(y/n) : ");
			ch = scan.next().charAt(0);
		}
		System.out.println("프로그램을 종료하겠습니다.");
	}

}

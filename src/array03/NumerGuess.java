package array03;

import java.util.Random;
import java.util.Scanner;

public class NumerGuess {

	public static void main(String[] args) {
		int low, high; //카드에 적힌 수의 범위
		int card; // 카드에 적힌 번호 값(숨기는 값, 정답)
		Random r = new Random(); // 난수 발생기 생성
		Scanner scanner = new Scanner(System.in); //키보드 입력기 생성
		
		
		// "N"이 입력될 때까지 반복하여 게임을 진행한다.
		
		while(true) {
			int i = 0; //사용자의 시행횟수
			low = 0; //카드 값의 최소 범위
			high = 99; // 카드 값의 최대범위
			card = r.nextInt(100); // 0과 99사이의 난수(숨기는 값) 생성
			System.out.println("수를 결정하였습니다. 맞추어보세요.");
			
			while(true) {
				System.out.println(low + "-" +high);  //값의 범위 출력
				System.out.println(i+1+">>");  //시행횟수 출력
				int n=0;
			
	
			try {
				n = scanner.nextInt(); //수를 입력받는다.
			}
			catch(Exception e) { //키 입력을 정수로 변환하지 못하는 예외 처리
				System.out.println("정수만 입력하셔야 합니다!!");
				scanner.nextLine(); //나머지 모든키를 읽어서 버린다.
			}
			
			if(n>high || n<low)  //high와 low의 범위를 벗어난 경우
				System.out.println("범위를 벗어났어요");
			else {
				if(n==card) {
					System.out.println("맞았습니다");
					break; //while문 종료
				}
				else if(n>card) {
					System.out.println("더 낮게");
					high = n;
				}
				else { //입력된 값이 정답보다 낮은 범위의 수인 경우
					System.out.println("더 높게");
					low = n;
				}
			}
			
		}
		

	}

}
}

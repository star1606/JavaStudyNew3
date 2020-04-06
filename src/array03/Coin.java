package array03;



//남은 동전의 개수를 구하는 프로그램(500, 100, 50, 10)
//2680
public class Coin {

	
	public static void main(String[] args) {
		int money = 43324324;
		int count = 0;
		System.out.println("시작 금액:" +money);
		int coin[] = {500, 100, 50, 10, 1};
		
		for (int i = 0; i < coin.length; i++) {
			count = money/coin[i];
			money= money%coin[i];
			System.out.println(coin[i]+"원 개수 :" +count);
			System.out.println("남은 금액:" + money);
		}
		
		
		/* int coin[] = {500, 100, 50, 10};
		
		
		count = money/500;
		money= money%500;
		System.out.println("500원 개수 :" +count);
		System.out.println("남은 금액:" + money);
		
		count = money/100;
		money = money%100;
		System.out.println("100원 개수 :" +count);
		System.out.println("남은 금액: " + money);
		
		count = money/50;
		money = money%50;
		System.out.println("50원 개수 : " +count);
		System.out.println("남은 금액 : " +money);
		
		count = money/10;
		money = money%10;
		System.out.println("10원 개수:" +count);
		System.out.println("남은 금액:" +money); */
	}

}

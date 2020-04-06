package array03;

public class ArrayEx05 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i=i*3) {
		  //3, 6, 9, 12, 15
			if(i%3==0) {
				sum = sum + i;
			}
		}
		System.out.println("sum :" + sum);
	}

}

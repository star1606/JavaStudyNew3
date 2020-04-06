package array03;

public class ClassNum {

	public static void main(String[] args) {
	int[] arr = new int[3]; //배열은 new해서 만듬
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	
	
	
		try {
			for (int i = 0; i < 4; i++) {
			System.out.println(arr[i]+ " ");
				}
			} catch (Exception e) {
				System.out.println("배열의 크기를 넘어갔습니다.");
			//오류 처리
		}
		
			
	
	
	}

}

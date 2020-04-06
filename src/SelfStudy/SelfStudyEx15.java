package SelfStudy;
//메소드의 입력
public class SelfStudyEx15 {
	   public static void numbering(int limit) {
	        int i = 0;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(5);
	    }
}

//메소드의 입력  ---> 입력 값을 주는법
//입력 값을 줘서 어떻게 원하는것만을 출력하게 하는지
//매개변수 이용    변수니까 매개변수.
//고정적인 것을 가변적인 것으로 바꾸는 원리
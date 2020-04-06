package SelfStudy;

public class SelfStudyEx07 {

	//메소드로 여러개의 입력값을 전달하고 싶다면 어떻게 해야 할까?
	
	 public static void numbering(int init, int limit) {
	        int i = init;
	        
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	
	
	public static void main(String[] args) {
		  numbering(1, 5);

	}

}

package SelfStudy;
 
public class selfStudyEx10 {
	static int i;
    static void a() {
    	i = 0;
         System.out.println(i);        //�̰� �����ϱ�
         
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}
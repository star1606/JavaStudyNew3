package datexx;

import java.util.Calendar;

import ch03.Cal;

public class CalendEx
{
	public static void printCalendar(String msg, Calendar cal)
	{
		//2020-03-18:22:11:05
		int year = cal.get(Calendar.YEAR); // 2020
		int month = cal.get(Calendar.MONTH)+1; // 0���ͽ�����.. +1���ش�
		String mon = (month < 10)?"0"+month : ""+month;
		              
		// �ڹ� ------��Ʈ�� -------> DB�� ������ String���� ������ �� ��
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		String h = (hour <10)? "0" + hour : ""+hour;
		
		int min = cal.get(Calendar.MINUTE);
		String m = (min < 10)?"0" + min: ""+min;
		
		int sec = cal.get(Calendar.SEC);
		String sec = (sec < 10)?"0"+sec: ""+sec;
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("day :" + day);
		System.out.println("dayOfWeek :" +dayOfWeek);
		System.out.println(year + "-" + month + "-" + day);
	}

	public static void main(String[] args)
	{
		Calendar now = Calendar.getInstance() ;  //�� new�� ���ϴ� ���� : new ���� ����(�߻�Ŭ����)
		printCalendar("����", now);      		 //�̱���
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2020, 02, 22); // 2020�� 03�� 22��. 3���� ǥ���ϱ� ���� month�� 2�� ����
		
		firstDate.set(Calendar.HOUR_OF_DAY, 22); //���� 22��
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("ó���������� ����", firstDate);
	}
}

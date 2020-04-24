package datexx;

import java.util.Calendar;

import ch03.Cal;

public class CalendEx
{
	public static void printCalendar(String msg, Calendar cal)
	{
		//2020-03-18:22:11:05
		int year = cal.get(Calendar.YEAR); // 2020
		int month = cal.get(Calendar.MONTH)+1; // 0부터시작함.. +1해준다
		String mon = (month < 10)?"0"+month : ""+month;
		              
		// 자바 ------스트림 -------> DB로 보낼때 String으로 보내면 다 들어감
		
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
		Calendar now = Calendar.getInstance() ;  //왜 new를 안하는 이유 : new 막아 놓음(추상클래스)
		printCalendar("현재", now);      		 //싱글톤
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2020, 02, 22); // 2020년 03월 22일. 3월을 표현하기 위해 month에 2로 설정
		
		firstDate.set(Calendar.HOUR_OF_DAY, 22); //저녁 22시
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음데이터한 날은", firstDate);
	}
}

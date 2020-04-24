package datexx;

import java.sql.Timestamp;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

//시간을 가지고 논다



//구버전 자바 1.7 이하..
//패키지 있다.
//java.sql.Date 
//java.sql.Time (x)
//java.sql.TimeStamp
//jave.util.Calendar (x)
//java.util.Date

//신버전 자바 1.8 이상
//java.time.LocalDate
//java.time.LocalDateTime
//java.time.LocalTime



public class TimeEx01 
{

	public static void main(String[] args)
	{	//1. Calendar안씀 알고는 있자.
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today = formater.format(cal.getTime());
		System.out.println("cal.getTime()" +cal.getTime());
		System.out.println("today :" + today );

	

		//2. java.util.Date안씀 1970.01.01 기준으로 해서 경과된 밀리초를 계산
		
		Date time2 = new Date();
		System.out.println("time2 :" + time2);
		System.out.println("time2.getTime() :" + time2.getTime());
		String today2 = formater.format(time2);
		System.out.println("today2 :" + today2);
		
		
		//3. java.sql.Date안씀
		java.sql.Date time3 = new java.sql.Date(86500001); //패키지 풀경로를 적어준다
		System.out.println("time3 :"+ time3);
	
		
		// 4. java.sql.TimeStamp 이거씀 그냥 만들어서 집어 넣으면 됨
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = new Date();
		String timestamp = sf.format(d.getTime());
		Timestamp ts = Timestamp.valueOf(timestamp);
		System.out.println("ts: " +ts);
	
		// 자바는 localdate를 들고 있지만 DB는 안들고 있다 그래서 timestamp로 담아서 db로 넣는다..
		
		
		// 5. LocalDateTime (LocalDate to TimeStamp)
						//자바에서 DB로 밀어넣을때는 로컬데이트를 타임스탬프로 바꿔서보냄 
						//DB로부터 타임스탬프 오면 로컬데이트껄로 바꿔서 자바안에 쓰면됨
		Timestamp nowDate = Timestamp.valueOf(LocalDateTime.now());
		System.out.println("nowDate: " + nowDate);
		
		// 6. LocalDateTime (TimeStamp to Localdate Time)
		LocalDateTime ldt = nowDate.toLocalDateTime();
		System.out.println("ldt: " + ldt);
		
		
		
		
		System.out.println("LocalDateTime: " + LocalDateTime.now());
		System.out.println("LocalDate: " + LocalDate.now());
		System.out.println("LocaTime: " + LocalTime.now());
		
		
		
		
		
		
	}
	
	
	
	
	
}

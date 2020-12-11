package lesson93;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CheckBirthday {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Calendar nowdays = Calendar.getInstance();
		nowdays.set(Calendar.HOUR, 0);
		nowdays.set(Calendar.MINUTE, 0);
		nowdays.set(Calendar.SECOND, 0);
		nowdays.set(Calendar.MILLISECOND, 0);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("자신의 생일을 입력해 주세요. (양식 : 11 11)");
		
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(nowdays.get(Calendar.YEAR), month - 1, day);
		birthday.set(Calendar.HOUR, 0);
		birthday.set(Calendar.MINUTE, 0);
		birthday.set(Calendar.SECOND, 0);
		birthday.set(Calendar.MILLISECOND, 0);
		
		int difference = getCalendarDifference(nowdays, birthday);
		
		printCalendar("현재 날짜 : ", nowdays);
		printCalendar("생일 : ", birthday);
		
		System.out.println("오늘과 생일 간의 차이는 " + difference + "일입니다.");
		
		scanner.close();
	}
	
	public static void printCalendar(String msg, Calendar cal) {
	    int year = cal.get(Calendar.YEAR);

	    int month = cal.get(Calendar.MONTH) + 1;
 	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    int hour = cal.get(Calendar.HOUR);	    
	    int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
	    int ampm = cal.get(Calendar.AM_PM);
	    int minute = cal.get(Calendar.MINUTE);	    
	    int second = cal.get(Calendar.SECOND);
	    int millisecond = cal.get(Calendar.MILLISECOND);
	    
	    System.out.print(msg + year + "/" + month + "/" + day + "/");
	    switch(dayOfWeek) {
		    case Calendar.SUNDAY : System.out.print("일요일 "); break;	    
		    case Calendar.MONDAY : System.out.print("월요일 "); break; 
		    case Calendar.TUESDAY : System.out.print("화요일 "); break;
		    case Calendar.WEDNESDAY : System.out.print("수요일 "); break;
		    case Calendar.THURSDAY : System.out.print("목요일 "); break;
		    case Calendar.FRIDAY: System.out.print("금요일 "); break;
		    case Calendar.SATURDAY : System.out.print("토요일 "); break;	    
	    }
	    
	    //System.out.print("(" + hourOfDay + "시) ");
	    if(ampm == Calendar.AM) System.out.print("오전 ");
	    else System.out.print("오후 ");	    	
	    System.out.println(hour + "시 " + minute + "분 " + second + "초 "
			 + millisecond +"밀리초");
	}
	
	public static int getCalendarDifference(Calendar c1, Calendar c2) {
		int difference = 0;
		
		if (c1.compareTo(c2) < 0) {
			difference = c2.get(Calendar.DAY_OF_YEAR) - c1.get(Calendar.DAY_OF_YEAR);
		} else {
			difference = c1.get(Calendar.DAY_OF_YEAR) - c2.get(Calendar.DAY_OF_YEAR);
		}
		
		return difference;
	}
}

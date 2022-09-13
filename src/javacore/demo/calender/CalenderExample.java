package javacore.demo.calender;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();// chon mui gio mac dinh cua may dang chay
		// bat dau tu thang thu 0
		System.out.println("Ngay hien tai:");
		System.out.println(c.get(Calendar.DATE) +"/"+ (c.get(Calendar.MONTH)+ 1) +"/"+ c.get(Calendar.YEAR));
		
		//cong them 10h nua vao ngay hien tai
		System.out.println("Ngay hien tai cong them 10h:");
		c.add(Calendar.HOUR, 12);
		System.out.println(c.get(Calendar.DATE) +"/"+ (c.get(Calendar.MONTH)+ 1) +"/"+ c.get(Calendar.YEAR));
		
		//cong them 5 ngay vao ngay hien tai
		System.out.println("Ngay hien tai cong them 5 ngay:");
		c.add(Calendar.DATE, 5);
		System.out.println(c.get(Calendar.DATE) +"/"+ (c.get(Calendar.MONTH)+ 1) +"/"+ c.get(Calendar.YEAR));
		
		//DateFormat
		Date d = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		//tim so ngay trong tuan
		int maxDay = c.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Mot tuan co " + maxDay + " ngay.");
		
		//tim so ngay trong thang
		int maxMonth = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Mot thang co " + maxMonth + " ngay.");
		
		//gia tri min cua so ngay trong tuan
		int minDay = c.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Trong tuan co it nhat " + minDay + " ngay.");
	}	
}

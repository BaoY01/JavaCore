package javacore.demo.enumm;

public class EnumTest {
	
	public static void main(String[] args) {
		WorkToDo w1 = new WorkToDo(Day.Monday, "List & Map");
		WorkToDo w2 = new WorkToDo(Day.Thursday, "Set & Date");
		WorkToDo w3 = new WorkToDo(Day.Satuday, "Properti & Calender");
		WorkToDo w4 = new WorkToDo(Day.Friday, "Enum");
		
		System.out.println(w3);
	}
	
	
}

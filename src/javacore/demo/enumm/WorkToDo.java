package javacore.demo.enumm;

public class WorkToDo {
	
	private Day day;
	private String work;
	
	public WorkToDo(Day day, String work) {
		super();
		this.day = day;
		this.work = work;
	}
	
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "WorkToDo [day=" + day + ", work=" + work + "]";
	}
	
}

package javacore.demo.serializable;

import java.io.Serializable;

public class Student implements Serializable {
	
	//Muc dich cua bien nay la di chac chan rang truoc va sau khi chuyen doi lop Student la mot
	private static final long serialVersionUID = 1L;
	
	private String name;
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}

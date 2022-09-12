package javacore.demo.list;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String id;
	private String name;
	private int birthDay;
	private float pointAve;	
	public Student(String id) {
		this.id = id;
	}
	public Student(String id, String name, int birthDay, float pointAve) {
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
		this.pointAve = pointAve;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public float getPointAve() {
		return pointAve;
	}
	public void setPointAve(float pointAve) {
		this.pointAve = pointAve;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthDay=" + birthDay + ", pointAve=" + pointAve + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.id.compareTo(o.id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(birthDay, id, name, pointAve);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) ;
	}
	
	
	
	
}

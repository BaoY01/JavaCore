package javacore.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListStudent {
	List<Student> myList = new ArrayList<>();
	

	public ListStudent() {
		this.myList = new ArrayList<Student>();
	}

	public ListStudent(List<Student> myList) {
		this.myList = myList;
	}

	public void addStudent(Student student) {
		this.myList.add(student);
	}
	
	public void printListStudent() {
		for (Student student : myList) {
			System.out.println(student);
		}
	}
	public boolean checkEmpty() {
		return this.myList.isEmpty();
	}
	public int numberStudent() {
		return this.myList.size();
	}
	public void mkIsEmpty() {
		this.myList.removeAll(myList);
	}
	public boolean checkExist(Student sd) {
		return this.myList.contains(sd);
	}
	public boolean delStudent(Student sd) {
		return this.myList.remove(sd);
	}
	public void searchStudent(String sd) {
		for (Student student : myList) {
			if(student.getName().indexOf(sd) >= 0) {
				System.out.println(student);
			}
		}
	}
	public void descenSortPoint() {
		Collections.sort(this.myList, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getPointAve() > student2.getPointAve()) {
					return -1;
				}else if(student1.getPointAve() < student2.getPointAve()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
	}
}

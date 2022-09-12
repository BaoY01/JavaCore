package javacore.demo.list;

import java.util.Scanner;

public class test {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ListStudent listSD = new ListStudent();
		int option = 0;
		do {
			System.out.println("--------MENU-------");
			System.out.println("0.Thoat chuong trinh.\n"
					+ "1. Them sinh vien.\n"
					+ "2. In danh sach sinh vien.\n"
					+ "3. Kiem tra danh sach rong.\n"
					+ "4. Lay ra so luong sinh vien.\n"
					+ "5. Lam rong danh sach sinh vien\n"
					+ "6. Kiem tra sinh vien co ton tai khong.\n"
					+ "7. Xoa sinh vien.\n"
					+ "8. Tim sinh vien dua vao ten.\n"
					+ "9. Sap xep ra danh sach sinh vien co diem cao den thap.\n");
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1: 
			{		
				System.out.println("Nhap ma sinh vien:");
				String id = sc.nextLine();
				System.out.println("Nhap ten sinh vien:");
				String name = sc.nextLine();
				System.out.println("Nhap nam sinh: ");
				int birthDay = sc.nextInt();
				System.out.println("Nhap diem trung binh: ");
				float pointAve = sc.nextFloat();
				Student sd = new Student(id, name, birthDay, pointAve);
				listSD.addStudent(sd);
				break;
			}
			case 2:
			{
				listSD.printListStudent();
				break;
			}
			case 3: 
			{
				if(listSD.checkEmpty()) {
					System.out.println("Danh sach dang rong.");
				}else {
					System.out.println("Danh sach hien khong rong.");
					listSD.printListStudent();
				}
				break;
			}
			case 4:
			{
				System.out.println("So luong sinh vien trong danh sach: "+ listSD.numberStudent());
				break;
			}
			case 5:
			{
				System.out.println("Da lam rong danh sach");
				listSD.mkIsEmpty();
				break;
			}
			case 6:
			{
				System.out.println("Nhap ma sinh vien de kiem tra: ");
				String id = sc.nextLine();
				Student student = new Student(id);
				if(listSD.checkExist(student)) {
					System.out.println("Sinh vien {"+ id + "}da ton tai.");
				}else {
					System.out.println("Sinh vien {"+ id +"} chua ton tai.");
				}
				break;
			}
			case 7:
			{
				System.out.println("Nhap ma sinh vien can xoa: ");
				String id = sc.nextLine();
				Student student = new Student(id);
				if(listSD.delStudent(student)) {
					System.out.println("Danh sach sinh vien sau khi xoa:");
					listSD.printListStudent();
				}else {
					System.out.println("Khong co sinh vien nay xoa khong thanh cong.");
				}		
				break;
			}
			case 8:
			{
				System.out.println("Nhap ten sinh vien can tim: ");
				String name = sc.nextLine();
				System.out.println("Ket qua tim kiem: ");
				listSD.searchStudent(name);
				break;
			}
			case 9:
			{
				System.out.println("Danh sach sau khi da sap xep: ");
				listSD.descenSortPoint();
				listSD.printListStudent();
				break;
			}
			}
		}while(option != 0);
	}
	
	
}

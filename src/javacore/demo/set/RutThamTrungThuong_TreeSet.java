package javacore.demo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {
	Set<String> listCoupons = new TreeSet<String>();
	
	public RutThamTrungThuong_TreeSet() {
	}
	
	public boolean addCoupons(String value) {
		return this.listCoupons.add(value);
	}
	
	public boolean rmCoupons(String value) {
		return this.listCoupons.remove(value);
	}
	
	public boolean checkCoupons(String value) {
		return this.listCoupons.contains(value);
	}
	
	public void rmAllCoupons() {
		 this.listCoupons.clear();
	}
	public int countCoupons() {
		return this.listCoupons.size();	
	}
	public String randomVote() {
		String vote = "";
		Random random = new Random();
		int location = random.nextInt(this.listCoupons.size());
		return this.listCoupons.toArray()[location].toString();
	}
	public void printCoupons() {
//		for (String string : listCoupons) {
//			System.out.println(string);
//		}
		System.out.println(Arrays.toString(this.listCoupons.toArray()));
	}

	public static void main(String[] args) {
		
		int option = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
		
		do {
			System.out.println("=====================");
			System.out.println("-----MENU-------");
			System.out.println("0. Thoat chuong trinh.\n");
			System.out.println("1. Them ma so du thuong.\n");
			System.out.println("2. Xoa ma so du thuong.\n");
			System.out.println("3. Kiem tra ma so du thuong co ton tai khong.\n");
			System.out.println("4. Xoa tat ca cac phieu du thuong.\n");
			System.out.println("5. So luong phieu du thuong.\n");
			System.out.println("6. Rut tham trung thuong.\n");
			System.out.println("7. In danh sach phieu.\n");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option){
			case 1:
			{
				System.out.println("Nhap ma so can them: ");
				String value = sc.nextLine();
				rt.addCoupons(value);
				System.out.println("Them thanh cong!");
				break;
			}
			case 2:
			{
				System.out.println("Nhap ma so can xoa: ");
				String value = sc.nextLine();
				rt.rmCoupons(value);
				System.out.println("Xoa thanh cong!");
				break;
			}
			case 3:
			{
				System.out.println("Nhap ma can kiem tra:");
				String value = sc.nextLine();
				if(rt.checkCoupons(value)) {
					System.out.println("Ma da ton tai!");
				}else {
					System.out.println("Ma chua ton tai!");
				}
				break;
			}
			case 4:
			{
				rt.rmAllCoupons();
				System.out.println("Da xoa het tat ca.");
				break;
			}
			case 5:
			{
				System.out.println("So luong phieu du thuong la: " + rt.countCoupons());
				break;
			}
			case 6:
			{
				System.out.println("Tham ban rut duoc la: " + rt.randomVote());
				break;
			}
			case 7:
			{
				System.out.println("Danh sach phieu du thuong:");
				rt.printCoupons();
			}
			}
		}while(option != 0);
	}
}

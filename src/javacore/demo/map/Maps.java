package javacore.demo.map;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<String, Integer> id = new HashMap<>();
		
		//vi du danh sach sinh vien co ten và id
		id.put("Bao Y", 0123456);
		id.put("Bao Bao", 543210);
		id.put("Khanh An", 546216);
		
		//in ra tat ca sinh vien
		System.out.println(id);
		
		//su dung get key de in ra value
		System.out.println(id.get("Khanh An"));
		
		//kiem tra key co ton tai khong
		System.out.println(id.containsKey("Bao Bao"));
		System.out.println(id.containsKey("Minh Minh"));// khong ton tai trong map
		
		//kiem tra xem value co trong map khong
		System.out.println(id.containsValue(9));//khong ton tai trong map
		System.out.println(id.containsValue(0123456));
		
		//cap nhat lai value
		id.put("Bao Bao", 777777);
		System.out.println(id);
		
		//thay the value khi key da ton tai
		id.replace("Bao Y", 999999);
		System.out.println(id);
		
		//them vao map neu truoc do chua co 
		id.putIfAbsent("Bao Nhu", 666666);
		id.putIfAbsent("Bao Y", 111111);// da ton tai ro nen khong cap nhat lai
		System.out.println(id);
		
		//xoa khoi map
		id.remove("Bao Bao");
		System.out.println(id);
	}
}

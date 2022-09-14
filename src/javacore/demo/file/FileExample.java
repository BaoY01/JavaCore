package javacore.demo.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {

		// tao file
		File file = new File("JavaFile.txt");
		boolean value;
		try {
			value = file.createNewFile();
			if (value) {
				System.out.println("Tao file thanh cong.");
			} else {
				System.out.println("Tao file that bai.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//lay ten file...
		System.out.println("Ten file: " + file.getName());
		System.out.println("Path: " + file.getPath());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("File size in bytes: " + file.length());

		// xoa file
		
		try {
			if (file.delete()) {
				System.out.println("Xoa file " + file.getName() + " thanh cong.");
			}
			else {
				System.out.println("Xoa file that bai.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
}

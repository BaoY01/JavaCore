package javacore.demo.inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputOutputStream {
	public static void main(String[] args) {
		
		//tao file
		File file = new File("input.txt");
		
		if( ! file.exists()) {
			try {
				
				file.createNewFile();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		//ghi vao file input.txt
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String textWritten = "My name is Bao Y";
		
		try {
			
			fos.write(textWritten.getBytes());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			fos.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//doc file
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		int i = 0;
		try {
			i = fis.read();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		while(i != -1) {
			char c = (char)i;
			System.out.println(c);
			try {
				i = fis.read();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

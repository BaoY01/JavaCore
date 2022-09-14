package javacore.demo.bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
	public static void main(String[] args) {
		BufferedInputStream input = null;
		BufferedOutputStream output = null;
		
		try {
			input = new BufferedInputStream(new FileInputStream("input.txt"));
			output = new BufferedOutputStream(new FileOutputStream("output.txt"));
			
			for(int i = input.read(); i != -1; i = input.read()) {
				output.write(i);
			}
			output.flush();
		}catch(IOException ex) {
			System.out.println(ex);
		}finally {
			try {
				if(input != null) {
					input.close();
				}
				if(output != null) {
					output.close();
				}
			}catch(IOException ex) {
				System.out.println(ex);
			}
		}
	}
}

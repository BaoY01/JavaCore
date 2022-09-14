package javacore.demo.datainput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInput {
	public static void main(String[] args) throws IOException {
	
		FileOutputStream output = null;
		DataOutputStream doutput = null;
		
		output = new FileOutputStream("input.txt");
		doutput = new DataOutputStream(output);
		doutput.writeUTF("le phuc bao y");
		
		output.close();
		doutput.close();
		
		InputStream input = null;
		DataInputStream dis = null;
		try {
			input = new FileInputStream("input.txt");
			dis = new DataInputStream(input);
			int count = input.available();
			byte[] arr = new byte[count];
			dis.read(arr);
			for (byte bt : arr) {
				char k = (char) bt;
				System.out.print(k);
			}
		} catch (IOException ex) {

		} finally {
			dis.close();
		}
		
	
	}
}

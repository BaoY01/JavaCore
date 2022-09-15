package javacore.demo.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class UnsupportedEncodingExample {
	public static void main(String[] args) throws UnsupportedEncodingException  {
		
		// Custom input string
        String str = "Le Phuc Bao Y";
        // Declaring a byte array
        byte[] bytes;
  
        bytes = str.getBytes("UTF-8");
  
        // Now here we are trying printing
        // given string and corresponding output string
        System.out.println("Given  String : " + str);
        System.out.println("Output bytes   : " + bytes);
		        

        
	}
}

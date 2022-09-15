package javacore.demo.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
	public static void main(String[] args) throws IOException {
		// tao phien ban lop FileReader  
        FileReader fileReader = new FileReader("Test.txt");  
        
        BufferedReader bufferReader = new BufferedReader(fileReader);  
        
        // khai bao chuoi rong truyen gia tri null
        String fileData = null;  
        
        // dung vong lap while de doc va in du lieu   
        while ((fileData = bufferReader.readLine()) != null)   
        {  
            System.out.println(fileData);  
        }    
       try {  
           bufferReader.close();  
       } catch (IOException e) {  
           e.printStackTrace();  
       }  
		
	}
}

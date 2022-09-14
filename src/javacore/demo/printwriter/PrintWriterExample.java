package javacore.demo.printwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter("input1.txt");
			printWriter = new PrintWriter(fileWriter);

			printWriter.println(true);
			printWriter.println((int) 123);
			printWriter.println((float) 123.456);

			int intValue = 45;
			double doubleValue = 968.245;

			printWriter.printf("i = %d and k = %f", intValue, doubleValue);
			System.out.println("Ghi thanh cong");

		} finally {
			if (fileWriter != null) {
				fileWriter.close();
			}
			if (printWriter != null) {
				printWriter.close();
			}
		}
	}

}


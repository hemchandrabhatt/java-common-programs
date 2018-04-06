package io_fileHandlingExample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		// File file = new File("");
		try {
			File file = new File("E:\\Selenium-Programs\\A.txt");
			/*
			 * If file gets created then the createNewFile() method would return
			 * true or if the file is already present it would return false
			 */
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("File has been created successfully");
			} else {
				System.out
						.println("File already present at the specified location");
			}
			
			FileWriter writer = new FileWriter("E:\\Selenium-Programs\\A.txt", true);
			writer.write("Hello Hem how are you?");
			writer.write("\r\n");   // write new line
			writer.write("Hello this another paragraph.");
			writer.close();
			
			FileReader reader = new FileReader("E:\\Selenium-Programs\\A.txt");
			int character; 
			while((character=reader.read()) != (-1)){
				System.out.print((char)character);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
		
		
	}

}

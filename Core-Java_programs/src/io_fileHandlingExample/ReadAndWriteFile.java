package io_fileHandlingExample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFile {

	public static void main(String[] args) {
		File file = new File("E:\\Selenium-Programs\\C.txt");
		try {
			boolean checkFile=file.createNewFile();
			if(checkFile)
				System.out.println("File is created succussfyly");
			else
				System.out.println("File is alrady exist.");
			
			FileWriter writer = new FileWriter("E:\\Selenium-Programs\\C.txt", true);
			writer.write("Hello this is another test");
			writer.write("\r\n");
			writer.close();
			
			FileReader reader = new FileReader("E:\\Selenium-Programs\\C.txt");
			int character;
			while((character=reader.read()) != (-1)){
				System.out.print((char)character);
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

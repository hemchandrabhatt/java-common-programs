package collectionExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadAndWriteExample {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream file = new FileInputStream("E:\\JavaGit-Projects\\java common programs\\Core-Java_programs\\src\\collectionExamples\\config.properties");
			Properties prob = new Properties();
			prob.load(file);
			String userName=prob.getProperty("userName");
			String password=prob.getProperty("password");
			System.out.println(userName +" ---" + password);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

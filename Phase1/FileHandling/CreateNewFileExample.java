package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class CreateNewFileExample {
	private static void createFileUsingFileClass() throws IOException {
			File file =new File("G://corejava//Java_Core//testFile1.txt");
			//create a file
			if(file.createNewFile())
				System.out.println("File is created!");
			else
				System.out.println("File already exist");
			
			
			//Write Content
			FileWriter fwrite =new FileWriter(file);
			fwrite.write("Test Data");
			fwrite.close();
			
	}
	
	//Create file using Stram classes
	private static void createFileUsingFileOutputStreamClass() throws IOException{
		//It override existing file or create new file
		FileOutputStream out= new FileOutputStream("G://corejava//Java_Core//testFile2.txt");
		String data= "We are learning File Handling";
		out.write(data.getBytes());
		out.close();
	}
	
	private static void createFileIn_NIO() throws IOException{
		String data="Using NIO";
		Files.write(Paths.get("G://corejava//Java_Core//testFile3.txt"),data.getBytes());
		
	}

	public static void main(String[] args) {
		try {
			//createFileUsingFileClass();
			//createFileUsingFileOutputStreamClass();
			createFileIn_NIO();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

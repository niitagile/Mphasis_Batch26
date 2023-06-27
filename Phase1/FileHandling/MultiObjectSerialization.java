package FileHandling;
//When we are writing any Object in file -- Serialization
//When we read any object from file--deserialization

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Serializable is a pre defined marker interface- empty interface- it is used to indicate jvm that particular calss objects must be treated in special way
class Movie  implements Serializable {
	//variables
	private int id;
	private String name;
	
	public Movie() {}

	public Movie(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void getValues() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		id=sc.nextInt();
		sc.nextLine();//to remove enter
		System.out.println("Enter name");
		name=sc.nextLine();
	}
	void display() {
		System.out.print("id="+id);
		System.out.println("\tname="+name);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
public class MultiObjectSerialization {

	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.getValues();
		Movie m2=new Movie();
		m2.getValues();
		
		List<Object>lmovies=new ArrayList<>();
		lmovies.add(m1);
		lmovies.add(m2);
		try {
		writeToFile(lmovies);
		//readFile();
		//searchMovie();
		deleteObject();
		readFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	private static void searchMovie() throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name");
		String mname=sc.nextLine();
		FileInputStream file=new FileInputStream("Movie.txt");
		ObjectInputStream os=new ObjectInputStream(file);
		List<Object> list=(List<Object>)os.readObject();
		for(Object obj : list) {
			Movie movie=(Movie)obj;
			if(movie.getName().equalsIgnoreCase(mname)) {
			movie.display();
			break;
			}
			
		}
		file.close();
		os.close();
		
	}

	private static void readFile() throws IOException, ClassNotFoundException {
		
		FileInputStream file=new FileInputStream("Movie.txt");
		ObjectInputStream os=new ObjectInputStream(file);
		List<Object> list=(List<Object>)os.readObject();
		for(Object obj : list) {
			Movie movie=(Movie)obj;
			movie.display();
			
		}
		file.close();
		os.close();
		
	}

	private static void writeToFile(List<Object> lmovies) throws IOException {
		//Open file in write mode
		FileOutputStream file=new FileOutputStream("Movie.txt");
		ObjectOutputStream os=new ObjectOutputStream(file);
		os.writeObject(lmovies);
		os.close();
		file.close();
		
		
	}
	
	private static void deleteObject() throws IOException, ClassNotFoundException {
		//create temp file
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name");
		String mname=sc.nextLine();
		FileOutputStream temp=new FileOutputStream("temp.txt");
		ObjectOutputStream tempos=new ObjectOutputStream(temp);
		List<Object> templist=new ArrayList<>();
		//Open file in read mode
		FileInputStream file=new FileInputStream("Movie.txt");
		ObjectInputStream os=new ObjectInputStream(file);
		List<Object> list=(List<Object>)os.readObject();
		for(Object obj : list) {
			Movie movie=(Movie)obj;
			if(movie.getName().equalsIgnoreCase(mname)==false) {
				templist.add(obj);
			}
		}
		tempos.writeObject(templist);
		tempos.close();
		os.close();
		file.close();
		temp.close();
		File f=new File("Movie.txt");
		f.delete();
		File ftemp=new File("temp.txt");
		ftemp.renameTo(f);
		
		
		
		
		
		
	}

}

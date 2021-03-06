package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import model.Man;
import model.Person;

public class MainTest {
	public static void writeSerializabaleObject(){
		try{
			Man man = new Man("jhc","123456");
			Person person = new Person(man,"wz",21);
//			OutputStream os = new FileOutputStream("output.txt");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));
			oos.writeObject("string");
			oos.writeObject(person);
			oos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void readSerializableObject(){
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output.txt"));
			String string = (String)ois.readObject();
			Person per = (Person)ois.readObject();
			System.out.println(string+per.getUsername());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		writeSerializabaleObject();
		readSerializableObject();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

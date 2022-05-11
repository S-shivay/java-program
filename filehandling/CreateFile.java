package com.filehandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			createFileUsingFileClass();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	static void createFileUsingFileClass() throws IOException{
		
		File myfile =new File("F:\\programfile\\filebyjava.txt");
		
		if(myfile.createNewFile())
			System.out.println("File created Successfully");
		else
			System.out.println("File is already Exist");
	}
}

package com.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args){
		try {
	FileWriter w= new FileWriter("F:\\programfile\\filebyjava.txt");
	w.write(" This is written by Sarang Developer of this program and this is write by file handling process");
	System.out.println("Data written successfully");
	w.close();
		}
	catch(IOException e) {
		System.out.println("An error occurred.");
	      e.printStackTrace();
	}
}
}

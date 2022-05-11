package com.filehandling;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		try (FileReader r = new FileReader("F:\\programfile\\filebyjava.txt")) {
			char txt[]= new char[500];
			r.read(txt); //reading data in form of characters
			System.out.println(txt);
		}
		catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}

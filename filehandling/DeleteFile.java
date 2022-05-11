package com.filehandling;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
	public static void main(String[] args) {
		try {
			Path f= Paths.get("F:\\programfile\\file1.txt");
			if(Files.deleteIfExists(f))
				System.out.println("File deleted Successfully");
			else
				System.out.println("File not exist");
			
		} 
		catch (NoSuchFileException e) {
			e.printStackTrace();
		}
		catch(DirectoryNotEmptyException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

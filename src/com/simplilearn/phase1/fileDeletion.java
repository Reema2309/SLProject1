package com.simplilearn.phase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileDeletion {

	@SuppressWarnings("resource")
	public static void delete() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory from where you want to delete a file:");
		String directory = sc.next();
		//Creating a File object for directory
		File directoryPath = new File(directory);
		File filesList[] = directoryPath.listFiles();
		
		
			if (directoryPath.exists()) {
				System.out.println("List of the files:");
				System.out.println("-----------------------------------------------");
				for(File file : filesList) {
					System.out.println(file.getName());
				}
			  
				System.out.println();
				System.out.println("Enter filename to delete from above list (without spaces):");
				String filename = sc.next();
				File myObj = new File(directoryPath.getAbsolutePath() + "\\" +filename); 
				if (myObj.delete()){
					System.out.println("Deleted the file: " + myObj.getName());
					System.out.println("List of the files after deletion:");
					File fileslist[] = directoryPath.listFiles();
					System.out.println("-----------------------------------------------");
				for(File file : fileslist) {
					System.out.println(file.getName());
				}
				}else {
					System.out.println("File doesn't exist.");
				}
		}else System.out.println("Invalid directory");
	}
}
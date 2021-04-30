package com.simplilearn.phase1;

import java.io.File;  
import java.io.IOException;   
import java.util.Scanner;

public class fileCreation { 
	public static void create() {
		 
			   @SuppressWarnings("resource")
			   Scanner sc = new Scanner(System. in );
			   System.out.println("Enter the directory where you want to create a file: ");
				String directory = sc.next();
				//Creating a File object for directory
				File directoryPath = new File(directory);
				System.out.println("Enter the filename to be added:");
				String filename = sc.next();
				File file = new File(directoryPath.getAbsolutePath() +"\\"+ filename); 
				if (directoryPath.exists()) {
				try {
					if (file.createNewFile()) {  
						System.out.println("File " + file.getName() +" is created successfully.");  
						System.out.println("List of the files after addition:");
						File fileslist[] = directoryPath.listFiles();
						System.out.println("-----------------------------------------------");
					for(File files : fileslist) {
						System.out.println(files.getName());
					}
					} else {  
						System.out.println("File is already exist in the directory."); 
						System.out.println("List of the files in current directory");
						File fileslist[] = directoryPath.listFiles();
						System.out.println("-----------------------------------------------");
					for(File files : fileslist) {
						System.out.println(files.getName());
					}
						}
				} catch (IOException e) {
					System.out.println("Error in creating the file");
				}  
			  } else System.out.println("Invalid directory selected");
		
	}
}
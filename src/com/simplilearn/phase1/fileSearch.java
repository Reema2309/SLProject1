package com.simplilearn.phase1;

import java.io.File;
import java.util.Scanner;
public class fileSearch {
	@SuppressWarnings("resource")
	public static  void search() {
		  System.out.println("Enter the directory in which you want to search a file: ");
	      Scanner sc = new Scanner(System.in);
	      String pathStr = sc.next();        
	      System.out.println("Enter the desired file name: ");
	      String file = sc.next();     
	      File dir = new File(pathStr);
	      String[] list = dir.list();
	      boolean flag = false;      
	      try
	      {
	      for (int i = 0; i < list.length; i++) {
	         if(file.equals(list[i])){
	            flag = true;
	         }
	      }        
	      if(flag){
	         System.out.println("File Found");
	      }else{
	         System.out.println("File Not Found");
	      }
	      }catch(NullPointerException e) {
	    	  System.out.println("Wrong directory entered!!!");
	}
   }
}

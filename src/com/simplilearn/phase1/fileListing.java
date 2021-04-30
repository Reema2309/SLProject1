package com.simplilearn.phase1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class fileListing {
   @SuppressWarnings({ "resource" })
public static void listing() {
	  System.out.println("Enter the directory in which you want to be listed in ascending order: ");
	  Scanner sc = new Scanner(System.in);
	  String pathStr = sc.next();           
	  File dir = new File(pathStr);
      File[] files = dir.listFiles();
      try {
      Arrays.sort(files, (f1, f2) -> {
         if (f1.isDirectory() && !f2.isDirectory()) {
            return -1;
         } else if (!f1.isDirectory() && f2.isDirectory()) {
            return 1;
         } else {
            return f1.compareTo(f2);
         }
      });

      for (File file1 : files) {
         if (!file1.isHidden()) {
            if (file1.isDirectory()) {
               System.out.println("DIR \t" + file1.getName());
            } else {
               System.out.println("FILE\t" + file1.getName());
            }
         }
      }
   }catch (Exception e) {
	   System.out.println("Invalid directory selected");
   }
   }
}
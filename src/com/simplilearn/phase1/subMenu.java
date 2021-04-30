package com.simplilearn.phase1;

import java.util.Scanner;

public class subMenu {

	public static void sMenu() {
		int ch;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			while(true){
				System.out.println();
				System.out.println("***************************************************");
				System.out.println("Sub-Menu");
				System.out.println("1. Add file ");
				System.out.println("2. Delete file");
				System.out.println("3. Search file");
				System.out.println("4. Go back to main menu");
				System.out.print("Enter an integer option from above to perform required operation:");
				ch = sc.nextInt();	
					switch (ch) {
						case 1:
							fileCreation.create();
							break;
						case 2:
							fileDeletion.delete();
							break;
						case 3:
							fileSearch.search();
							break ;
						case 4:
							System.out.println();
							mainMenu.mMenu();
							break;
						default:
							System.out.println("Invalid option selected from Menu");
							break;
					}
					System.out.println();
			}
		}catch (Exception e) {
			System.out.println("Option entered is not an integer value, re-enter a valid option");
			sMenu();
		}

	}

}

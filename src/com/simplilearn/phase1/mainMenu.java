package com.simplilearn.phase1;

import java.util.Scanner;

public class mainMenu{
	public static void welcome() {
		System.out.println("********************Welcome************************");
		System.out.println("Application name: LockedMe.com");
		System.out.println("Developed by: Reema Kuwar");
		System.out.println("***************************************************");
	}
	public static void mMenu() {
	int ch;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	try {
		 while(true){
			System.out.println();
			System.out.println("***************************************************");
			System.out.println("Main menu");
			System.out.println("1. Display files in directory ");
			System.out.println("2. Select this option to Add/Delete/search a file");
			System.out.println("3. Exit");
			System.out.print("Enter an integer option from above to perform required operation:");
			ch = sc.nextInt();	
				switch (ch) {
					case 1:
						fileListing.listing();
						break;
					case 2:
						subMenu.sMenu();
						break;
					case 3:
						System.exit(1);
						break ;
					default:
						System.out.println("Invalid option selected from Menu");
						break;
				}
		}
	}catch (Exception e) {
		System.out.println("Option entered is not an integer value, re-enter a valid option");
		mMenu();
	}
}
	public static void main(String args[]){
		welcome();
		mMenu();
	}
}

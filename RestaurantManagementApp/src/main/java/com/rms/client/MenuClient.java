package com.rms.client;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.rms.controller.MenuController;
import com.rms.dto.MenuDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;


public class MenuClient {

	static Logger logger = Logger.getLogger(MenuClient.class);

	public static void main(String[] args) throws DuplicateIDException, InvalidDeletionException, IDNotExistException, EmptyListException  {


		BasicConfigurator.configure();  
		
		logger.info("In main");  
		
		MenuController menucontroller  = new MenuController();

		Scanner sc=new Scanner(System.in);
		
		int ch;

		for (;;) {
			System.out.println("======Menu Designing - ADMIN==============");

			System.out.println("1.Add Food Items" + "\n" + "2.Remove Food Items" + "\n" + "3.Update Food Items" + "\n"
					+ "4.Display Food Items" + "\n" + "5.Exit" + "\n");

			ch = sc.nextInt();

			switch (ch) {

			case 1: {

				System.out.println("\n" + "OPERATION-CREATION/ADDING OF MENU ITEMS" + "\n");

				System.out.println("Enter the food item number");

				int foodid = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter the food item name");

				String foodname = sc.nextLine();

				System.out.println("Enter the food item type");

				String foodtype = sc.nextLine();

				System.out.println("Enter the food item price");

				int foodprice = sc.nextInt();

				MenuDto menudto=new MenuDto(foodid,foodname,foodtype,foodprice);
				
				
				menucontroller.addFoodItem(menudto);
				
				System.out.println("\n" + "Food Item Added!!!!" + "\n");

				break;
			}
			case 2: {

				System.out.println("\n" + "OPERATION-DELETION OF MENU ITEMS" + "\n");

				
				System.out.println("Enter the food item number");

				int foodid = sc.nextInt();
				sc.nextLine();

				MenuDto menudto = new MenuDto(foodid);
				
				
				
				menucontroller.deleteFoodItem(menudto);
				

				System.out.println("\n" + "Food item Deleted!!!" + "\n");

				break;
			}

			case 3: {

				System.out.println("\n" + "OPERATION-UPDATION OF MENU ITEMS" + "\n");


				System.out.println("Enter the food item number");

				int foodid = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter the food item name to update");

				String foodname = sc.nextLine();

				System.out.println("Enter the food item type to update");

				String foodtype = sc.nextLine();

				System.out.println("Enter the food item price to update");

				int foodprice = sc.nextInt();

				MenuDto menudto=new MenuDto(foodid,foodname,foodtype,foodprice);

				
				
				menucontroller.updateFoodItem(menudto);
				

				System.out.println("\n" + "Food Item Updated!!!!" + "\n");

				break;

			}

			case 4: {

				System.out.println("\n" + "OPERATION-DISPLAYING OF MENU ITEMS" + "\n");

				menucontroller.displayFoodItem();
				

				System.out.println("\n" + "Food Item Displayed!!!!" + "\n");

				break;

			}
			case 5: {
				sc.close();
				System.exit(0);

			}

			default: {
				System.out.println("\n" + "Enter a Valid Choice" + "\n");

			}

			}

		}

	}

}
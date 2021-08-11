package com.rms.client;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.rms.controller.MenuController;
import com.rms.dto.MenuDto;
import com.rms.exception.InvalidIDException;
import com.rms.exception.InvalidSwitchException;

public class MenuClient {

	static Logger logger = Logger.getLogger(MenuClient.class);

	public static void main(String[] args)
			throws InvalidIDException {


		logger.info("In main");

		MenuController menucontroller = new MenuController();

		Scanner sc = new Scanner(System.in);

		int ch;

		for (;;) {
			logger.info("======Menu Designing - ADMIN==============");

			logger.info("1.Add Food Items To Menu");
			logger.info("2.Remove Food Items From Menu");
			logger.info("3.Update Food Items In Menu");
			logger.info("4.Display Food Items of Menu"); 
			logger.info("5.Exit The Application");

			ch = sc.nextInt();

			switch (ch) {

			case 1: {

				logger.info("OPERATION-CREATION/ADDING OF MENU ITEMS");

				logger.info("Enter the food item number");

				logger.info("Food Items Id between 100 and 150");
				
				
				int foodid = sc.nextInt();
				
				if(foodid<100 || foodid>=150)
				{
					throw new InvalidIDException("Enter Valid ID");
				}
				
				sc.nextLine();
				
				logger.info("Enter the food item name");

				String foodname = sc.nextLine();

				logger.info("Enter the food item type");

				String foodtype = sc.nextLine();

				logger.info("Enter the food item price");

				int foodprice = sc.nextInt();

				MenuDto menudto = new MenuDto(foodid, foodname, foodtype, foodprice);

				menucontroller.addFoodItem(menudto);

				break;
			}
			case 2: {

				logger.info("OPERATION-DELETION OF MENU ITEMS");

				logger.info("Enter the food item number");
				
				logger.info("Food Items Id between 100 and 150");
				
				int foodid = sc.nextInt();
				
				if(foodid<100 || foodid>=150)
				{
					throw new InvalidIDException("Enter Valid ID");
				}
				
				sc.nextLine();
				
				MenuDto menudto = new MenuDto(foodid);

				menucontroller.deleteFoodItem(menudto);

				break;
			}

			case 3: {

				logger.info("OPERATION-UPDATION OF MENU ITEMS");

				MenuDto menudto = new MenuDto();

				menucontroller.updateFoodItem(menudto);

				break;

			}

			case 4: {

				logger.info("OPERATION-DISPLAYING OF MENU ITEMS");

				menucontroller.displayFoodItem();

				break;

			}
			case 5: {
				sc.close();
				System.exit(0);

			}

			default: {
					try {
					throw new InvalidSwitchException("Invalid Switch Case..");
					}
					catch(Exception e) {logger.info(e);}
			}

			}

		}

	}

}
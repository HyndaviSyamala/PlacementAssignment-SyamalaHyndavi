package in.ineuron.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import in.ineuron.model.FoodMenu;
import in.ineuron.service.IfoodMenuService;
import in.ineuron.serviceFactory.FoodMenuServiceFactory;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to ORION Restaurant");
		while (true) {

			System.out.println("1. INSERT");
			System.out.println("2. SEARCH");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.print("ENTER UR CHOICE, PRESS[1/2/3/4/5]::  ");
			String option = br.readLine();

			switch (option) {
			case "1":
				insertOperation();
				break;
			case "2":
				selectOperation();
				break;
			case "3":
				updateRecord();
				break;
			case "4":
				deleteRecord();
				break;
			case "5":
				System.out.println("******* Thanks for visiting *****");
				System.exit(0);
			default:
				System.out.println("Invalid option plz try agin with valid options....");
				break;
			}

		}

	}private static void updateRecord() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the food Item to be updated:: ");
		String foodItem = br.readLine();

		IfoodMenuService foodService = FoodMenuServiceFactory.getFoodMenuService();
		FoodMenu menu = foodService.searchFoodItem(foodItem);

		if (menu != null) {
			FoodMenu newMenu = new FoodMenu();

			System.out.println("Item no is :: " + menu.getSno());
			newMenu.setSno(menu.getSno());

			System.out.print("Old FoodItem is :: " + menu.getFoodItem() + "  Enter newItem :: ");
			String newItem = br.readLine();
			if (newItem.equals("") || newItem== "") {
				newMenu.setFoodItem(menu.getFoodItem());
			} else {
				newMenu.setFoodItem(newItem);
			}
			System.out.print("Old FoodItem quantity is :: " + menu.getQuantity() + "  Enter new quantity :: ");
			String newquantity = br.readLine();
			if (newquantity .equals("") || newquantity  == "") {
				newMenu.setQuantity(menu.getQuantity());
			} else {
				newMenu.setQuantity(Integer.parseInt(newquantity));
			}
			System.out.print("Old FoodItem price is :: " + menu.getPrice() + "  Enter new price :: ");
			String newprice = br.readLine();
			if (newprice.equals("") || newprice == "") {
				newMenu.setPrice(menu.getPrice());
			} else {
				newMenu.setPrice(Float.parseFloat(newprice));
			}

			System.out.println("new Object data is :: " + newMenu);
			System.out.println();

			String status = foodService.updateFoodItem(newMenu);
			if (status.equalsIgnoreCase("success")) {
				System.out.println("record updated succesfully");
			} else {
				System.out.println("record updation failed");
			}

		} else {
			System.out.println("Food Item is not available for updation...");
		}

	}

	private static void deleteRecord() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sno to be deleted:: ");
		int sno = scanner.nextInt();

		IfoodMenuService foodService = FoodMenuServiceFactory.getFoodMenuService();
		String msg = foodService.deleteFoodItem(sno);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record deleted succesfully");
		} else if (msg.equalsIgnoreCase("not found")) {
			System.out.println("record not avilable for the given id ::" + sno);
		} else {
			System.out.println("record deletion failed....");
		}

	}

	private static void selectOperation() {
		// insertOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the foodItem :: ");
		String foodItem = scanner.next();

		IfoodMenuService foodService = FoodMenuServiceFactory.getFoodMenuService();
		FoodMenu menu= foodService.searchFoodItem(foodItem);
		if (menu != null) {
			//System.out.println(menu);
			System.out.println("SNO\tFOODITEM\tQUANTITY\tPRICE");
			System.out.println(menu.getSno() + "\t" + menu.getFoodItem() + "\t\t" + menu.getQuantity() + "\t\t" + menu.getPrice());
		} else {
			System.out.println("Record not found for the given foodItem");
		}

	}

	private static void insertOperation() {
		IfoodMenuService foodService = FoodMenuServiceFactory.getFoodMenuService();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Food Item :: ");
		String foodItem = scanner.next();

		System.out.print("Enter the quantity:: ");
		int quantity = scanner.nextInt();

		System.out.print("Enter the price :: ");
		Float price= scanner.nextFloat();

		String msg = foodService.addFoodItem(foodItem, quantity, price);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record inserted succesfully");
		} else {
			System.out.println("record insertion failed....");
		}
	}


}

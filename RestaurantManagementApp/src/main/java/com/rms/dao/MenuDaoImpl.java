package com.rms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.rms.db.DBUtil;
import com.rms.dto.MenuDto;

public class MenuDaoImpl implements MenuDao {

	static Logger logger = Logger.getLogger(MenuDaoImpl.class);
	
	Scanner sc  = new Scanner(System.in);
	
	@Override
	public void addFoodItem(MenuDto menudto) {
	
		logger.debug("Inside addFood-MenuDaoImpl..");
		try {
			Connection con=DBUtil.getConnection();
			
			PreparedStatement pst=con.prepareStatement("insert into Menu values(?,?,?,?)");
			pst.setInt(1,menudto.getId());
			pst.setString(2,menudto.getName());
			pst.setString(3, menudto.getType());
			pst.setInt(4,menudto.getPrice());
			pst.execute();
			logger.info("Food Details are inserted..");
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		
	}
	
	@Override
	public void deleteFoodItem(MenuDto menudto) {
	
		logger.info("Inside deleteFood-MenuDaoImpl..");
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from Menu where MenuId=?");
			pst.setInt(1, menudto.getId());
			pst.executeUpdate();
			logger.info("Food Detail is deleted...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void updateFoodItem(MenuDto menudto) {
	
		try {
			
			System.out.println("Enter the Food ID");
			int foodid = sc.nextInt();
			
			
			System.out.println("\n"+"Fields  -  Update Status Code");
			System.out.println("Food Name    - 1");
			System.out.println("Food Type    - 2");
			System.out.println("Food Price   - 3");
			
			System.out.println("Enter the update status code to update which details");
			
			int statuscode=sc.nextInt();
			
			switch(statuscode) {
			
			case 1:{
					try(Connection con = DBUtil.getConnection();){
					
					
					sc.nextLine();
					
					System.out.println("Enter the Food Name");
					String foodname = sc.nextLine();
					
					System.out.println("here");
										
					PreparedStatement pst=con.prepareStatement("update Menu set FoodName=? where FoodId=?");
					
					pst.setString(1, foodname);
					pst.setInt(2, foodid);
					
					pst.executeUpdate();
					
					logger.info("Food Name is updated...");
				
					break;
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
			}		
			case 2:{
				try(Connection con = DBUtil.getConnection();) {
					
					sc.nextLine();
					
					System.out.println("Enter the Food Type");
					
					
					String foodtype = sc.nextLine();
			
					PreparedStatement pst=con.prepareStatement("update Menu set FoodType=? where FoodId=?");
					
					pst.setString(1, foodtype);
					pst.setInt(2, foodid);
					
					pst.executeUpdate();
					
					logger.info("Food Type is updated...");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				}
			case 3:{
				try(Connection con = DBUtil.getConnection();) {
					
					
					sc.nextLine();
					
					System.out.println("Enter the Food Price");
					int foodprice = sc.nextInt();
					

					PreparedStatement pst=con.prepareStatement("update Menu set FoodPrice=? where FoodId=?");
					
					pst.setInt(1,foodprice);
					pst.setInt(2,foodid);
					
					pst.executeUpdate();
					
					logger.info("Food Price is updated...");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				}
				
			
				}
			
			
			}
			
			catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	
	@Override
	public void displayFoodItem() {
	
		try {

			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from Menu");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				
				System.out.println("\n"+"Food ID:"+rs.getInt(1));
				System.out.println("Food Name:"+rs.getString(2));
				System.out.println("Food Type:"+rs.getString(3));
				System.out.println("Food Price:"+rs.getInt(4)+"\n");
				
				
			}
			logger.info("Food Details are displayed...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}



}

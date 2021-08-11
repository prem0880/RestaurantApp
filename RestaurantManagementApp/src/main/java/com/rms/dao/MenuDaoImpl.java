package com.rms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.rms.db.DBUtil;
import com.rms.dto.MenuDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidIDException;
import com.rms.exception.InvalidSwitchException;

public class MenuDaoImpl implements MenuDao {

	static Logger logger = Logger.getLogger(MenuDaoImpl.class);
	
	Scanner sc  = new Scanner(System.in);
	
	public void CheckDuplicateID(Integer id) throws DuplicateIDException {
		logger.info("Inside CheckDuplicateID");
		Boolean flag = true;
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from Menu where FoodId=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				flag=false;
				break;
			}

		} catch (Exception e) {
			logger.info(e);	
		}
		if(flag == false)
		{
			throw new DuplicateIDException("ID Alreay Exists in Db...");
		}
	}

	public void CheckFoodID(Integer id) throws IDNotExistException {
		logger.info("Inside CheckFoodID");
		Boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from Menu where FoodId=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				flag=true;
			}

		} catch (Exception e) {
			logger.info(e);
		}
		if(flag == false)
		{
			throw new IDNotExistException("ID Not Found in Db...");
		}
	}

	@Override
	public void addFoodItem(MenuDto menudto) throws InvalidIDException {
	
		logger.debug("Inside addFood-MenuDaoImpl..");
		
		if(menudto.getId()<100)
		{
			throw new InvalidIDException("Enter Valid ID");
		}
		
		try {
			CheckDuplicateID(menudto.getId());
		} catch (DuplicateIDException e1) {
			logger.info(e1);
		}
		
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

			logger.info(e);
		}

		
	}
	
	@Override
	public void deleteFoodItem(MenuDto menudto) {
	
		
		logger.info("Inside deleteFood-MenuDaoImpl..");
		try {
			CheckFoodID(menudto.getId());
		} catch (IDNotExistException e1) {
			e1.printStackTrace();
		}
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from Menu where FoodId=?");
			
			pst.setInt(1, menudto.getId());
			pst.executeUpdate();
			logger.info("Food Detail is deleted...");

		} catch (Exception e) {
			logger.info(e);
		}

	}
	

	
	@Override
	public void updateFoodItem(MenuDto menudto) {
	
		try {
			
			logger.info("Enter the Food ID");
			int foodid = sc.nextInt();
			
			logger.info("Food Items Id between 100 and 150");
			
			if(foodid<100 || foodid>=150)
			{
				throw new InvalidIDException("Enter Valid ID");
			}
			
			CheckFoodID(foodid);
			
			logger.info("Fields  -  Update Status Code");
			logger.info("Food Name    - 1");
			logger.info("Food Type    - 2");
			logger.info("Food Price   - 3");
			
			logger.info("Enter the update status code to update which details");
			
			int statuscode=sc.nextInt();
			
			switch(statuscode) {
			
			case 1:{
					try(Connection con = DBUtil.getConnection();){
					
					
					sc.nextLine();
					
					logger.info("Enter the Food Name");
					String foodname = sc.nextLine();
					
					PreparedStatement pst=con.prepareStatement("update Menu set FoodName=? where FoodId=?");
					
					pst.setString(1, foodname);
					pst.setInt(2, foodid);
					
					pst.executeUpdate();
					
					logger.info("Food Name is updated...");
				
					break;
				}
				catch(Exception e)
				{
					logger.info(e);
				}
			}		
			case 2:{
				try(Connection con = DBUtil.getConnection();) {
					
					sc.nextLine();
					
					logger.info("Enter the Food Type");
					
					
					String foodtype = sc.nextLine();
			
					PreparedStatement pst=con.prepareStatement("update Menu set FoodType=? where FoodId=?");
					
					pst.setString(1, foodtype);
					pst.setInt(2, foodid);
					
					pst.executeUpdate();
					
					logger.info("Food Type is updated...");
				}
				catch(Exception e)
				{
					logger.info(e);
				}
				break;
				}
			case 3:{
				try(Connection con = DBUtil.getConnection();) {
					
					
					sc.nextLine();
					
					logger.info("Enter the Food Price");
					int foodprice = sc.nextInt();
					

					PreparedStatement pst=con.prepareStatement("update Menu set FoodPrice=? where FoodId=?");
					
					pst.setInt(1,foodprice);
					pst.setInt(2,foodid);
					
					pst.executeUpdate();
					
					logger.info("Food Price is updated...");
				}
				catch(Exception e)
				{
					logger.info(e);
				}
				break;
				}
			default: {
				try {
				throw new InvalidSwitchException("Invalid Switch Case..");
				}
				catch(Exception e) {logger.info(e);}
		       }
				
			
				}
			
			
			}
			
			catch (Exception e) {
				logger.info(e);
		}

		
	}
	
	
	@Override
	public void displayFoodItem() {
	
		try {

			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from Menu");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				
				logger.info("Food ID:"+rs.getInt(1));
				logger.info("Food Name:"+rs.getString(2));
				logger.info("Food Type:"+rs.getString(3));
				logger.info("Food Price:"+rs.getInt(4));
				
				
			}
			logger.info("Food Details are displayed...");
		}
		catch(Exception e)
		{
			logger.info(e);
		}
		
	}



}

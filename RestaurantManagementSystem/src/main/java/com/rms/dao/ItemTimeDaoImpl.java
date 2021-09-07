package com.rms.dao;

import java.util.List;

import org.hibernate.Session;

import com.rms.dto.ItemTimeDto;
import com.rms.entity.ItemTime;
import com.rms.util.HibernateUtil;
import com.rms.util.ItemTimeMapper;

public class ItemTimeDaoImpl implements ItemTimeDao{

	
	@Override
	public Long addFoodItemTime(ItemTimeDto itemTimeDto) {
		
		Long id=null;
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			id=(Long)session.save(ItemTimeMapper.mapItemTime(itemTimeDto));
			session.getTransaction().commit();
			session.clear();
			session.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return id;
		
		
	}
	
	@Override
	public List<ItemTime> viewFoodItemTime() {
	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		return session.createQuery("FROM ItemTime", ItemTime.class).getResultList();
		
	}
	
}

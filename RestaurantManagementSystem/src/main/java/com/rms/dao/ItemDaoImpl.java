package com.rms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.rms.util.HibernateUtil;
import com.rms.util.ItemMapper;
import com.rms.dto.ItemDto;
import com.rms.dto.ItemTimeDto;
import com.rms.entity.Item;
import com.rms.entity.ItemTime;

public class ItemDaoImpl implements ItemDao {

	
	@Override
	public Long addFoodItem(ItemDto itemDto) {
	
		Long id=null;
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Item it=ItemMapper.mapItem(itemDto);
			for(ItemTimeDto i:itemDto.getItemTime()) {
				it.getItemTime().add(session.get(ItemTime.class, i.getId()));
			}
			id=(Long)session.save(it);
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
	public List<Item> viewFoodItem() {
	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		return session.createQuery("FROM Item", Item.class).getResultList();
		
	}
	
	@Override
	public List<Item> viewFoodItemById(Long id) {
	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Query<Item> query = session.createQuery("FROM Item I where I.id=:id", Item.class);
	
		query.setParameter("id", id );
		
		return query.list();
		
	}
	
	
	@Override
	public Boolean updateFoodItemById(ItemDto itemDto,Long id) {
		
		Boolean flag=false;
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			Item item = ItemMapper.mapItem(itemDto);
			if(session!=null) {
				Item items = session.get(Item.class, id);
				items.setName(item.getName());
				items.setType(item.getType());
				items.setCategory(item.getCategory());
				items.setDescription(item.getDescription());
				items.setPrice(item.getPrice());
				session.saveOrUpdate(items);
				session.getTransaction().commit();
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}
	
	@Override
	public Boolean deleteFoodItemById(Long id) {
		
		Boolean flag=false;
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			Item item = session.load(Item.class, id);
			session.delete(item);
			flag=true;
			session.getTransaction().commit();
		    session.clear();
		    session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}
}

package com.te.ecommerce.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ecommerce.beans.AdminBean;
import com.te.ecommerce.beans.Items;
import com.te.ecommerce.dao.AdminDAOwithHibernateImpl;



@Service
public  class AdminServiceImpl implements AdminService {


	@Autowired
	AdminDAOwithHibernateImpl adminDao;
	
	@Override
	public AdminBean authenticate(Integer id, String password) {
		
		AdminBean admin = adminDao.authenticate(id, password);
		return admin;
	}

	@Override
	public boolean addItem(Items item) {
		boolean result = adminDao.addItem(item) ;
		return result;
	}

	@Override
	public boolean removeItem(Integer id) {
		boolean result = adminDao.removeItem(id);
		return result;
	}

	@Override
	public Items searchItem(Integer id) {
		Items item = adminDao.searchItem(id);
		return item;
	}

	@Override
	public List<Items> getAllItems() {
		List<Items> list = adminDao.getAllItems();
		return list;
	}

	

	@Override
	public boolean updateItem(Items item) {
		// TODO Auto-generated method stub
		boolean result = adminDao.updateItem(item);
		return result;
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

		


}

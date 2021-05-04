package com.te.ecommerce.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.te.ecommerce.beans.AdminBean;
import com.te.ecommerce.beans.Items;


public interface AdminService {
public AdminBean authenticate(Integer id, String password);
	
	public boolean addItem(Items item);
	
	public boolean removeItem(Integer id);
	
	public Items searchItem(Integer id);
	
	public List<Items> getAllItems();
	
	public boolean updateItem(Item item);

	boolean updateItem(Items item);
}

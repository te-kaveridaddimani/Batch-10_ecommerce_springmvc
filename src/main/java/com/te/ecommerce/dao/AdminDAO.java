package com.te.ecommerce.dao;

import java.util.List;



import com.te.ecommerce.beans.AdminBean;
import com.te.ecommerce.beans.Items;

public interface AdminDAO {
public AdminBean authenticate(Integer id, String password);
	
	public boolean addItem(Items item);
	
	public boolean removeItem(Integer id);
	
	public Items searchItem(Integer id);
	
	public List<Items> getAllItems();
	
	public boolean updateItem(Items item);
}

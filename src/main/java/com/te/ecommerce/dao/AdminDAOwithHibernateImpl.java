package com.te.ecommerce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.stereotype.Repository;

import com.te.ecommerce.beans.AdminBean;
import com.te.ecommerce.beans.Items;


@Repository
public class AdminDAOwithHibernateImpl implements AdminDAO {

	public AdminBean authenticate(Integer id, String password) {
		AdminBean admin = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
			EntityManager manager = factory.createEntityManager();
			String sql = "from Admin where id =: id and password =: password";
			Query query = manager.createQuery(sql);
			query.setParameter("id", id);
			query.setParameter("password", password);
			admin = (AdminBean) query.getSingleResult();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return admin;
	}

	@Override
	public boolean addItem(Items item) {
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(item);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean removeItem(Integer id) {
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Items item = manager.find(Items.class, id);
			manager.remove(item);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Items searchItem(Integer id) {
		
		Items item = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
			EntityManager manager = factory.createEntityManager();
			item = manager.find(Items.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public List<Items> getAllItems() {
		
		List<Items> list = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
			EntityManager manager = factory.createEntityManager();
			String sql = "from Items";
			Query query = manager.createQuery(sql);
			list  = query.getResultList();
			return list;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean updateItem(Items item) {
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			System.out.println("id "+item.getId());
			Items originalItem = manager.find(Items.class, item.getId());
			
			if(item.getName() != null && item.getName() != "") {
				originalItem.setName(item.getName());
			}

			transaction.commit();
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}

}
}
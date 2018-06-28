package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.User;
import com.revature.util.HibernateUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> getUser() {
		Session s = HibernateUtil.getSession();
		List<User> users = s.createQuery("from User").list();
		s.close();
		return users;
	}

	@Override
	public User getUserById(int id) {
		Session s = HibernateUtil.getSession();
		User foundUser = (User) s.get(User.class, id);
		s.close();
		return foundUser;
	}

	@Override
	public int createUser(User user) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int created = (int) s.save(user);
		tx.commit();
		s.close();
		return created;
	}

	@Override
	public void updateUser(User user) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(user);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteUserById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		User current = (User) s.get(User.class, id);
		if(current != null) {
			s.delete(current);
		}
		tx.commit();
		s.close();
		
	}

}

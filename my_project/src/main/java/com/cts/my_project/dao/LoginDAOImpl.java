package com.cts.my_project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.my_project.bean.login;
import com.cts.my_project.dao.LoginDAO;


	@Repository("loginDAO")
	public class LoginDAOImpl implements LoginDAO{
		
		@Autowired
		@Qualifier("sessionFactory")
		SessionFactory sessionFactory;

	
		
		@Transactional(readOnly = true)
		public login authenticate(String userName, String password) {
			// TODO Auto-generated method stub
					
			Session session = null;
			
					String query= "from login where userName = ? AND password = ?";
				Query<login> query2=null;
					try {
						session = sessionFactory.getCurrentSession();
						query2=session.createQuery(query);
						query2.setParameter(0, userName);
						query2.setParameter(1, password);
						login login1 = query2.getSingleResult();
						//System.out.println(login1.getUserAddress());
						if(login1==null)
							return null;
						else
							return login1;
					} catch (Exception e) {
						e.printStackTrace();
					}
			return null;
		}

		
}

package com.hibarnatedemo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//from Actor a where a.last_name='CHASE' AND a.first_name='ED'
			//from Actor a where a.first_name LIKE '%da%'
			//from Actor a where a.first_name LIKE '%da'
			//from Actor a where a.first_name LIKE 'da%'
			//from Actor a ORDER BY a.first_name
			//from Actor a ORDER BY a.first_name ASC
			//from Actor a ORDER BY a.first_name DESC
			//List<String> first_names = session.createQuery("select a.first_name, MAX(a.last_name) from Actor a Group BY a.first_name", Object[].class)
                    //.getResultList()
                    //.stream()
                    //.map(objects -> (String) objects[1])
                    //.collect(Collectors.toList());
			
			/*
			 * for(String first_name:first_names) { System.out.println(first_name); }
			 */
			
			//INSERT
//			Actor actor=new Actor();
//			actor.setFirst_name("Alex");
//			actor.setLast_name("Defe");
//			actor.setLast_update(LocalDateTime.now());
//			//actor.setActor_id(null);
//			session.save(actor);
			
			//UPDATE
//			Actor actor= session.get(Actor.class, 7);
//			System.out.println(actor.getFirst_name());
//			actor.setFirst_name("Jake");
//			
//			session.save(actor);
			
			//Delete
			Actor actor= session.get(Actor.class, 8);
			session.delete(actor);
			
			session.getTransaction().commit();
			System.out.println("Aktör silindi");
		}finally {
			factory.close();
		}
	}

}

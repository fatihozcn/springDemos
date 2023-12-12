package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.Actor;

import jakarta.persistence.EntityManager;



@Repository
public class HibernateActorDal implements IActorDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateActorDal(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Actor> actors = session.createQuery("from Actor",Actor.class).getResultList();
		return actors;
	}

	@Override
	public void add(Actor actor) {
		Session session=entityManager.unwrap(Session.class);
		session.persist(actor);
	}

	@Override
	public void update(Actor actor) {
		Session session=entityManager.unwrap(Session.class);
		session.merge(actor);
		
	}

	@Override
	public void delete(Actor actor) {
		Session session=entityManager.unwrap(Session.class);
		Actor actorToDelete = session.get(Actor.class, actor.getActor_id());
		session.remove(actorToDelete);
		
	}

	@Override
	public Actor getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Actor actor = session.get(Actor.class, id);
		return actor;
	}

}

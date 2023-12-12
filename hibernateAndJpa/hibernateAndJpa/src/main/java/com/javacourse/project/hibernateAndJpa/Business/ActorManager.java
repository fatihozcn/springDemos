package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.IActorDal;
import com.javacourse.project.hibernateAndJpa.Entities.Actor;

@Service
public class ActorManager implements IActorService {

	private IActorDal actorDal;
	
	@Autowired
	public ActorManager(IActorDal actorDal) {
		this.actorDal = actorDal;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		
		return this.actorDal.getAll();
	}

	@Override
	@Transactional
	public void add(Actor actor) {
		this.actorDal.add(actor);
	}

	@Override
	@Transactional
	public void update(Actor actor) {
		this.actorDal.update(actor);
		
	}

	@Override
	@Transactional
	public void delete(Actor actor) {
		this.actorDal.delete(actor);
		
	}

	@Override
	public Actor getById(int id) {
		// TODO Auto-generated method stub
		return this.actorDal.getById(id);
	}

}

package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Actor;

public interface IActorDal {
	List<Actor> getAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
	Actor getById(int id);
}

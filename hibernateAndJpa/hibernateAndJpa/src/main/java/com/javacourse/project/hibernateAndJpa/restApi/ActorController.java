package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.IActorService;
import com.javacourse.project.hibernateAndJpa.Entities.Actor;

@RestController
@RequestMapping("/api")
public class ActorController {
	private IActorService actorService;

	@Autowired
	public ActorController(IActorService actorService) {
		this.actorService = actorService;
	}
	
	@GetMapping("/actors")
	public List<Actor> get(){
		return actorService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Actor actor){
		actorService.add(actor);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Actor actor){
		actorService.update(actor);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Actor actor){
		actorService.delete(actor);
	}
	
	@GetMapping("/actors/{id}")
	public Actor getById(@PathVariable int id){
		return actorService.getById(id);
	}
}

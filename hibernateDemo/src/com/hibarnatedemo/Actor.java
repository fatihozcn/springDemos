package com.hibarnatedemo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Actor")
public class Actor {
	@Id
	@Column (name="actor_id")
	private int actor_id;
	@Column (name="first_name")
	private String first_name;
	@Column (name="last_name")
	private String last_name;
	@Column (name="last_update")
	private LocalDateTime last_update;
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public LocalDateTime getLast_update() {
		return last_update;
	}
	public void setLast_update(LocalDateTime localDateTime) {
		this.last_update = localDateTime;
	}
}

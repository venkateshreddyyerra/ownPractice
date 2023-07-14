package com.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Scene {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name ="locid")
    private Location location;
	@ManyToOne
	@JoinColumn(name ="timeid")
	private Time time;
	@ManyToOne
	@JoinColumn(name ="scid")
	private Script script;
}

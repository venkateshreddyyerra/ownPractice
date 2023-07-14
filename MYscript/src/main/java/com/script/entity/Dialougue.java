package com.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


import lombok.Data;

@Data
@Entity
public class Dialougue {

	@Id
	@GeneratedValue
	private Long id;
	private String content;
	@ManyToOne
	@JoinColumn(name="scptchId")
	private ScriptCharector scriptCharector;
	@ManyToOne
	@JoinColumn(name="scid")
	private Scene scene;
	@OneToOne
	@JoinColumn(name="sceSeqId") 
	private SceneOrder sceneOrder;
	
	private String parantical;
	
}
